package getting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
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
	
	public static void main(String []args) {
		ObjectFactory of = new ObjectFactory();
		Wsiv ws = new Wsiv();
		WsivPortType wpt = ws.getWsivSOAP11PortHttp();
		
		Line line =of.createLine();
		//line.setId(of.createLineId("RB"));
	
		get();
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
	
	public static List < Mission> getAllMission(Station station, String dir,ObjectFactory of,WsivPortType wpt){
		Direction direction =of.createDirection();
		direction.setLine(of.createDirectionLine(station.getLine().getValue()));
		direction.setSens(of.createDirectionSens(dir));
		return wpt.getMissionsNext(station, direction, null, null).getMissions();
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
			Runnable runnable =new Runnable() {
				public void run() {
			
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
				}};
				
		    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();  	
		    service.scheduleAtFixedRate(runnable, 0, 10, TimeUnit.SECONDS);  
		    out.close();	
		    
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Finished "+getTime);
		
			
			
		
	}

	
}
