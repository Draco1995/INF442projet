package getting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import fr.ratp.wsiv.Wsiv;
import fr.ratp.wsiv.WsivPortType;
import fr.ratp.wsiv.xsd.ObjectFactory;
import fr.ratp.wsiv.xsd.*;

public class Stops {
	
	public static void main(String []args) throws IOException {


		//IMPORTANT INFO!
		/**
		 * writeInFile: every call will do (NumberOfStations) times of requests
		 * @param minutes: how long to take for one get info
		 * @param outFileName: will output two file: info and perturbationInfo
		 * @param linename
		 * @param direction A/R/*
		 * OutputFormat:LineInfo 
		 * I forgot the order of output of nextTime, maybe it starts with direction='A'?
		 * StationName +'\t' +TimeRightNow+'\t' +numberOfMissions+'\t'+aLotOfNextTimeSeperateBy'\t'.. +
		 * ","+aLotOfStationMessageSeperatetedBy'\t'
		 * 
		 * OutputFormat:LineInfoPerturbations
		 * StationName+'\t'+Time+'\t'+NumberofPerturbation+'\t'+alotofPerturbationLevel+'\t'+alotofPerturbationMessage
		 */
		writeInFile(1,"LineInfoRB","RB","*");
		writeInFile(1,"LineInfo9106","393101","*");
		/*
		Station station =of.createStation();
		station.setLine(of.createStationLine(line));
		station.setName(of.createStationName("LOZERE"));
		Direction direction =of.createDirection();
		direction.setSens(of.createDirectionSens("A"));
		
		List < Mission > missions =wpt.getMissionsNext(station, direction,null, null).getMissions();
		for(Mission m: missions) {
			System.out.println(m.getStations().get(1));
			System.out.println(m.getStationsMessages().get(0));
			System.out.println(m.getId().getValue());
			System.out.println("code: "+m.getCode().getValue());
		}
		*/
		
		/*
		Mission mission=of.createMission();
		mission.setId(of.createMissionId("PINS"));
		
		mission.setLine(of.createMissionLine(line));
		
		WrMission newM=wpt.getMission(mission, null, null, null);
		System.out.println(newM.getMission().getValue().getStationsDates().get(0));
		
		*/
		return;
	}
	/**
	 * One request will be done
	 * @param linename
	 * @return
	 */
	public static List <String> stopsName(String linename){
		ObjectFactory of = new ObjectFactory();
		Wsiv ws = new Wsiv();
		WsivPortType wpt = ws.getWsivSOAP11PortHttp();
		Station station=of.createStation();
		Line line =of.createLine();
		line.setId(of.createLineId(linename));
		station.setLine(of.createStationLine(line));
		
		List <Station> stations =wpt.getStations(station, null, null, 5000, null).getStations();
		List<String> stopsname=new ArrayList<String>();
		for(Station s : stations) {
			stopsname.add(s.getName().getValue());
		}
		return stopsname;
	}
	
	public static List <Station> getAllStations(String linename,ObjectFactory of,WsivPortType wpt){
		Station station=of.createStation();
		Line RB =of.createLine();
		RB.setId(of.createLineId(linename));
		station.setLine(of.createStationLine(RB));
		List <Station> stationsRB=wpt.getStations(station, null, null, null, null).getStations();
		return stationsRB;
		
	}
	/**
	 * will request for one time 
	 * @param station
	 * @param dir
	 * @param of
	 * @param wpt
	 * @return
	 */
	public static List < Mission> getAllMission(Station station, String dir,ObjectFactory of,WsivPortType wpt){
		Direction direction =of.createDirection();
		direction.setLine(of.createDirectionLine(station.getLine().getValue()));
		direction.setSens(of.createDirectionSens(dir));
		
		List < Mission> missions=wpt.getMissionsNext(station, direction, null, null).getMissions();
		System.out.println(missions.size());
		return missions;
	}
	
	public static String InfoLine(Mission mission) {
		String s="";
		s+=mission.getStations().get(0).getName().getValue()+'\t';
		
		Date date=new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
		String now = dateFormat.format( date );
		//out.print(now+'\t');
		s+=now+'\t';
		
		for(String time : mission.getStationsDates()) {
			s+=time+'\t';
		}
		return s;
	}
	
	
	public static void writeInFile(int min,String fileName,String lineName,String dir) throws IOException {
		ObjectFactory of = new ObjectFactory();
		Wsiv ws = new Wsiv();
		WsivPortType wpt = ws.getWsivSOAP11PortHttp();
		final File logFile=new File (fileName);
		final File logFilePerturbation=new File (fileName+"Perturbation");
		
		if(!logFile.exists()) {
			logFile.createNewFile();
		}
		if(!logFilePerturbation.exists()) {
			logFilePerturbation.createNewFile();
		}
		//One Request
		List<Station> stations =getAllStations(lineName, of, wpt);
		ScheduledExecutorService exec =  Executors.newScheduledThreadPool(1);
		
		exec.scheduleWithFixedDelay(new Runnable(){
            public void run() {

            	
                try {
                	long callTime=0;
                    @SuppressWarnings("resource")
					Writer txtWriter = new FileWriter(logFile,true);
                    @SuppressWarnings("resource")
					Writer txtWriter1 = new FileWriter(logFilePerturbation,true);
                    //Date creation
                    Date date=new Date();
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
					String now = dateFormat.format( date );
    				
    				
    				for(Station station: stations) {
    					
    					//System.out.println(station.getLine().getValue().getReseau().getValue().getId().getValue());
    					Direction direction =of.createDirection();
    					direction.setLine(of.createDirectionLine(station.getLine().getValue()));
    					direction.setSens(of.createDirectionSens(dir));
    					callTime++;
    					WrMissions wrmissions=wpt.getMissionsNext(station, direction, null, 100);
    					List < Mission> missions = wrmissions.getMissions();
    					//FORMAT OF OUTPUT
    					txtWriter.write(station.getName().getValue()+'\t' +now +'\t'+missions.size()+'\t');
    					txtWriter.flush();
    					txtWriter1.write(station.getName().getValue()+'\t' +now +'\t'+wrmissions.getPerturbations().size()+'\t');
    					txtWriter1.flush();
    					
    					for(Mission m: missions) {
    						
    						List <String> nextTime=m.getStationsDates();
    						
    						for(String i: nextTime) {
    							txtWriter.write(i+'\t');
    							txtWriter.flush();
    						}

    					}
    					//txtWriter.write( ",");
    					//txtWriter.flush();
    					for(Mission m: missions) {
    						
    						List <String> nextMessage=m.getStationsMessages();
    						for(String i: nextMessage) {
    							txtWriter.write(i+'\t');
    							txtWriter.flush();
    						}
    					}
    					
    					try {
    						List<Perturbation> perturbations=wrmissions.getPerturbations();
    
    						for(Perturbation p:perturbations ) {
    							
    							txtWriter1.write(p.getLevel().getValue()+'\t');
    							txtWriter1.flush();
    						}
    						for(Perturbation p:perturbations ) {
    							txtWriter1.write(p.getMessage().getValue().getText().getValue()+'\t');
    							txtWriter1.flush();
    						}
    						
    					}catch(Exception e) {}
    					txtWriter.write('\n');
    					txtWriter.flush();
    					txtWriter1.write('\n');
    					txtWriter1.flush();
    					
    					
    				}
    				
    				
    				
                    
                    
                    System.out.println("Time: "+now+'\t' +"Line: "+lineName+ '\t'+"callTimes: "+callTime);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }, 0, min, TimeUnit.MINUTES);
		
		
		
	}
	
	public static void get() {
		int getTime=0;
		ObjectFactory of = new ObjectFactory();
		Wsiv ws = new Wsiv();
		WsivPortType wpt = ws.getWsivSOAP11PortHttp();
		Station station=of.createStation();
		Line RB =of.createLine();
		RB.setId(of.createLineId("RB"));
		station.setLine(of.createStationLine(RB));
		List <Station> stationsRB=wpt.getStations(station, null, null, null, null).getStations();
		getTime++;
		
		try {
			PrintStream out =new PrintStream (new FileOutputStream("allStation.txt"));


			
			for(Station s : stationsRB) {
				
				
				out.print(s.getName().getValue()+'\t');
				Date date=new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
				String now = dateFormat.format( date );
				out.print(now+'\t');
				Direction direction =of.createDirection();
				direction.setLine(of.createDirectionLine(RB));
				direction.setSens(of.createDirectionSens("*"));
				List < Mission> missions = wpt.getMissionsNext(s, direction, null, null).getMissions();
				//getTime++;
				//out.print("number: "+missions.size()+'\t');
				for(Mission m: missions) {
					
					List <String> nextTime=m.getStationsDates();
					
					for(String i: nextTime) {
						out.print(i+'\t');
					}
					List <String> nextMessage=m.getStationsMessages();
					for(String i: nextMessage) {
						out.print(i+'\t');
					}
				}
				
				out.println();
				
			}
			Date date=new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			String now = dateFormat.format( date );
			System.out.println(now);
			
				
	
		    out.close();	
		    
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Finished "+getTime);
		
			
			
		
	}

	
}
