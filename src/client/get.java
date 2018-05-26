package client;



import java.util.List;

import fr.ratp.wsiv.Wsiv;
import fr.ratp.wsiv.WsivPortType;
import fr.ratp.wsiv.xsd.Direction;
import fr.ratp.wsiv.xsd.Line;
import fr.ratp.wsiv.xsd.Mission;
import fr.ratp.wsiv.xsd.ObjectFactory;
import fr.ratp.wsiv.xsd.Station;

public class get {
	
	
	public static void main(String []args) {
		ObjectFactory of = new ObjectFactory();
		Wsiv ws = new Wsiv();
		WsivPortType wpt = ws.getWsivSOAP11PortHttp();
		List <Mission> missions=getMissionFre("RB","LOZERE", "A", of,wpt);
		for(Mission m : missions ) {
			System.out.println(m.getStationsMessages().get(0));
		}
		return;
	}
	/**
	 * One request will be done
	 * @param line example : RA
	 * @param stationName : Lozere
	 * @param direction :A ,R, *=all
	 * @param of 
	 * @param wpt
	 * @return
	 */
	
	public static List<Mission> getMN(String line,String stationName,String direction,ObjectFactory of,WsivPortType wpt) {
		Station station=of.createStation();
		station.setName(of.createStationName(stationName));
		Line l =of.createLine();
		l.setId(of.createLineId(line));
		station.setLine(of.createStationLine(l));
		Direction dir=of.createDirection();
		dir.setSens(of.createDirectionSens(direction));
		return wpt.getMissionsNext(station, dir,null,null).getMissions();
	}
	
	public static List<Mission> getMN(int numberOfMissions,String line,String stationName,String direction,ObjectFactory of,WsivPortType wpt) {
		Station station=of.createStation();
		station.setName(of.createStationName(stationName));
		Line l =of.createLine();
		l.setId(of.createLineId(line));
		station.setLine(of.createStationLine(l));
		Direction dir=of.createDirection();
		dir.setSens(of.createDirectionSens(direction));
		return wpt.getMissionsNext(station, dir,null,numberOfMissions).getMissions();
	}
	
	public static List<Mission> getMN( Station station, Direction direction, ObjectFactory of,WsivPortType wpt) {
		
		return wpt.getMissionsNext(station, direction,null,null).getMissions();
	}
	/***
	 * 
	 * @param station
	 * @param direction
	 * @param dateStart =201805261058

	 * @param wpt
	 * @return
	 */
	public static List<Mission> getMN( Station station, Direction direction,String dateStart, WsivPortType wpt) {
		return wpt.getMissionsNext(station, direction,dateStart,null).getMissions();
	}
	/**
	 * One request will be executed
	 * @param station
	 * @param direction
	 * @param wpt
	 * @return
	 */
	public static List <Mission> getMissionFre(Station station,Direction direction,WsivPortType wpt){
		return wpt.getMissionsFrequency(station, direction, null, null, null, null).getMissions();
	}
	/**
	 * One request will be executed
	 * @param station string :Lozere
	 * @param direction
	 * @param of
	 * @param wpt
	 * @return
	 */
	public static List <Mission> getMissionFre(String line ,String stationName,String direction,ObjectFactory of,WsivPortType wpt){
		Station station=of.createStation();
		station.setName(of.createStationName(stationName));
		Line l =of.createLine();
		l.setId(of.createLineId(line));
		station.setLine(of.createStationLine(l));
		Direction dir=of.createDirection();
		dir.setSens(of.createDirectionSens(direction));
		return wpt.getMissionsFrequency(station, null, null, null, null, null).getMissions();
	}
	
}
