package getting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

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
	
		
		List <Line> lines=wpt.getLines(line);
		try {
			PrintStream out =new PrintStream (new FileOutputStream("allLine.txt"));
			
			for(Line l:lines) {
				
					out.println(l);
					
				
				
			}
			out.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
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
	public static void get() {
		ObjectFactory of = new ObjectFactory();
		Wsiv ws = new Wsiv();
		WsivPortType wpt = ws.getWsivSOAP11PortHttp();
		Station station=of.createStation();
		Line RB =of.createLine();
		RB.setId(of.createLineId("RB"));
		station.setLine(of.createStationLine(RB));
		List <Station> stationsRB=wpt.getStations(station, null, null, null, null).getStations();
		
		for(Station s : stationsRB) {
			Direction direction =of.createDirection();
			direction.setLine(of.createDirectionLine(RB));
			direction.setSens(of.createDirectionSens("*"));
			wpt.getMissionsNext(s, direction, null, null).getMissions();
			/*
			try {
				PrintStream out =new PrintStream (new FileOutputStream("allLine.txt"));
				
				for(Line l:lines) {
					if(l.getReseau().getValue().getName().getValue().contains("Bus")
						||l.getReseau().getValue().getName().getValue().equals("M¨¦tro")||
							l.getReseau().getValue().getName().getValue().equals("Tramway")) {
						out.println(l);
						
					}
					
				}
				out.close();
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}*/
			System.out.println("InfoCatched");
			
			
		}
		
	}

	
}
