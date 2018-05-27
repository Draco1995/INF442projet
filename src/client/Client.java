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
		l.setId(of.createLineId("393101"));//393103 393102
		//TODO l.setCodeStif(of.createLineCodeStif("1800001"));
		Wsiv ws = new Wsiv();
		WsivPortType wpt = ws.getWsivSOAP11PortHttp();

		
		String[] s;

		s = new String[] {"Gare Massy Palaiseau","Palaiseau Ville","La Vallee","Camille Claudel","Ensta - les Joncherettes","Polytechnique Lozere","Polytechnique Laboratoire","Fresnel","Palaiseau - Campus","Corbeville","Universite Paris-Saclay","Moulon Tcsp","Joliot Curie","Orme des Merisiers","Saint Aubin","Mare du Vivier","Raoult Dautry","Christ de Saclay","Cea Porte Nord","Rond-Point - Maison Foujita","Le Thuit","Rond-Point","Genevieve Aube - Rd36","Merantais","Golf National","Technocentre Gare Routiere","Le Corbusier","Jean Monnet","D'Alembert","Lycee Emilie de Breteuil","Saint-Quentin Gare Routiere (Av des Pres)","Orme des Merisiers"};
		
		List<Mission> lm = get.getMN("393101", s[1], "A", of, wpt);
		
		for(Mission i: lm) {
			System.out.println(i);
		}
		/*
		
		
		for(Line i : list) {
			System.out.println(i);
		}
		
		
		Station station = of.createStation();
		station.setLine(of.createStationLine(list.get(0)));
		WrStations wrstations = wpt.getStations(station, null, null, null, null);
		
		List<Station> lstation = wrstations.getStations();
		
		for(Station s: lstation) {
			System.out.print("\""+s.getName().getValue()+"\"");
			System.out.print(",");
		}
		/*
		List<Mission> lm = get.getMN("RB", "LOZERE", "A", of, wpt);
		
		for(Mission i: lm) {
			System.out.println(i);
		}
		/*
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
			System.out.println(m.getStations().get(0).getName().getValue());
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
