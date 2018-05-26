package client;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
import fr.ratp.wsiv.GetLines;
import fr.ratp.wsiv.Wsiv;
import fr.ratp.wsiv.WsivPortType;
import fr.ratp.wsiv.xsd.Direction;
import fr.ratp.wsiv.xsd.GeoPoint;
import fr.ratp.wsiv.xsd.Line;
import fr.ratp.wsiv.xsd.Mission;
import fr.ratp.wsiv.xsd.ObjectFactory;
import fr.ratp.wsiv.xsd.Station;
import fr.ratp.wsiv.xsd.WrMission;
import fr.ratp.wsiv.xsd.WrMissions;
import fr.ratp.wsiv.xsd.WrStations;
public class Client {
	
	public static void main(String[] args) {
		ObjectFactory of = new ObjectFactory();
		Wsiv ws = new Wsiv();
		WsivPortType wpt = ws.getWsivSOAP11PortHttp();
		Line line=of.createLine();
		line.setId(of.createLineId("RB"));
		//List<Line> lines=wpt.getLines(line);
		//getAllLines gal=new getAllLines(wpt,of);
		List<Mission> missions=get.getMN(3,"RB", "LOZERE", "R", of, wpt);
		Station station=of.createStation();
		station.setLine(of.createStationLine(line));
		Direction dir=of.createDirection();
		dir.setSens(of.createDirectionSens("*"));
		//List<Mission> missions =wpt.getMissionsNext(station, dir, dateStart, limit)
		WrMissions mm=wpt.getMissionsFirstLast(station, dir, "201805262300");
		//mm.get
		
		for(Mission m: mm.getMissions()) {
			System.out.println(m.getStationsDates().get(0));
			try {
				
				System.out.println(m.getStationsMessages().get(0));
			}catch(Exception e) {}
			
		}

		return ;

		
	}
}


/*
 * 		GeoPoint gp =of.createGeoPoint();
		
		gp.setX(595260.0);
		gp.setY(2431446.0);
		List<Integer> distances=new ArrayList<Integer>();
		distances.add(50000);
		//distances.add(50000);
		Station station=of.createStation();
		station.setName(of.createStationName("LOZERE"));
		//station.setGeoPointA(of.createItineraryGeoPointEnd(of.createGeoPoint()));
		List<Integer>d=new ArrayList<Integer>();
		d.add(10000);
		Direction direction =
				
				of.createDirection();
		direction.setSens(of.createDirectionSens("A"));
		direction.setLine(of.createDirectionLine(line));
		//WrStations stations =wpt.getStations(null, gp, null, null, null);
		wpt.getMissionsFirstLast(station, null, null);
		WrMissions wrm=wpt.getMissionsFrequency(station, direction, null, null, null,null);
		
     	System.out.println(wrm.getMissions().get(0).getStationsDates().get(0));
     	//wpt.getMissionsFrequency(station, direction, stationEndLine, stationEnd, datesStart, datesEnd)
 */



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
}
System.out.println("InfoCatched");
*/

//wpt.getStations(station, gp, distances, limit, sortAlpha)

/*
Line l = new Line();
ObjectFactory of = new ObjectFactory();
l.setId(of.createLineId("RB"));
//TODO 
l.setCodeStif(of.createLineCodeStif("18-0080"));
l.setCode(of.createLineCode("18-0080"));
Wsiv ws = new Wsiv();
WsivPortType wpt = ws.getWsivSOAP11PortHttp();
of.createStation();



Station s=of.createStation();
//s.setName(of.createStationName("LOZERE"));
//s.setLine(of.createStationLine(l));

WrStations getStation=wpt.getStations(s, null, null, null, null);
System.out.println(getStation.getStations().size());
for(Station station : getStation.getStations()) {
	System.out.println("Station: " +station.getName().getValue());
}
/*
Direction dir=of.createDirection();
dir.setSens(of.createDirectionSens("A"));
for(Mission m: wpt.getMissionsNext(s, dir, null, null).getMissions()) {
	System.out.println(m.getStations());
}
//System.out.println(wpt.getMissionsNext(s, dir, null, null).getMissions().get(0).getStationsDates().get(0));
//System.out.println(wpt.getStations(s, null, null, null, null).getStations().get(0).getId().getValue());
*/
