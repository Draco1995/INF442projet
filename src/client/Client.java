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
		l.setId(of.createLineId("M1"));
		//TODO l.setCodeStif(of.createLineCodeStif("1800001"));
		Wsiv ws = new Wsiv();
		WsivPortType wpt = ws.getWsivSOAP11PortHttp();
		Station s=of.createStation();
		s.setLine(of.createStationLine(l));
		List <Station> stations =wpt.getStations(s, null,null,null,null).getStations();  
		for(Station station: stations) {
			System.out.println(station.getName().getValue());
		}
	}
}
