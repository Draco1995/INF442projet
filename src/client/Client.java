package client;

import fr.ratp.wsiv.GetLines;
import fr.ratp.wsiv.Wsiv;
import fr.ratp.wsiv.WsivPortType;
import fr.ratp.wsiv.xsd.Direction;
import fr.ratp.wsiv.xsd.Line;
import fr.ratp.wsiv.xsd.Mission;
import fr.ratp.wsiv.xsd.ObjectFactory;
import fr.ratp.wsiv.xsd.WrMission;
import fr.ratp.wsiv.xsd.WrMissions;
import fr.ratp.wsiv.xsd.WrStations;
import fr.ratp.wsiv.xsd.Station;
import java.util.List;
public class Client {
	
	public static void main(String[] args) {
		Line l = new Line();
		ObjectFactory of = new ObjectFactory();
		of.createLineId("RA");
		//l.setCodeStif(of.createLineCodeStif("18-0080"));
	//	l.setCode(of.createLineCode("18-0080"));
		l.setId(of.createLineId("RA"));
		//TODO l.setCodeStif(of.createLineCodeStif("1800001"));
		Wsiv ws = new Wsiv();
		WsivPortType wpt = ws.getWsivSOAP11PortHttp();
		
		Station s = of.createStation();
		s.setId(of.createStationId("139_55_72"));
		Line line = of.createLine();
		line.setId(of.createLineId("B139"));
		s.setLine(of.createStationLine(line));
		Direction d = of.createDirection();
		d.setSens(of.createDirectionSens("*"));
		WrMissions wrmission = wpt.getMissionsNext(s, d, null,null);
		for(Mission m: wrmission.getMissions()) {
			System.out.println(m);/*
			for(Station station:m.getStations()) {
				System.out.println(station.getName().getValue()+"\t"+station.getLine().getValue().getName().getValue());
			}
			System.out.println(m.getStations().get(0).getName().getValue());*/
		}
		System.out.println(line+"\n"+l);
		/*
		Mission m = of.createMission();
		Line line = wpt.getLines(l).get(0);
		m.setLine(of.createMissionLine(line));
		m.setId(of.createMissionId("RA"));
		WrMission wm = wpt.getMission(m, "201805242200", false, false);
		System.out.println(wm.getMission().getValue());
		/*List<Station> list = 
		for(Station s:list) {
			System.out.println(s.getName().getValue());
		}*/
		//System.out.print(wpt.getLines(l).get(0).getName().getValue());
	}
}
