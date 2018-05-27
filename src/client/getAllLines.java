package client;

import java.util.ArrayList;
import java.util.List;

import fr.ratp.wsiv.WsivPortType;
import fr.ratp.wsiv.xsd.Line;
import fr.ratp.wsiv.xsd.ObjectFactory;


public class getAllLines {
	List<Line> metro=new ArrayList<Line>();
	List<Line> rer=new ArrayList<Line>();
	List<Line> tramway=new ArrayList<Line>();
	List<Line> bus=new ArrayList<Line>();
	List<Line> sncf=new ArrayList<Line>();
	List<Line> all;
	public getAllLines(WsivPortType wpt,ObjectFactory of){
		
		Line line=of.createLine();
		all=wpt.getLines(line);
		/*
		for(Line l:lines) {
			if(l.getReseau().getValue().getName().getValue().contains("Bus")) {
				this.bus.add(l);
			}
			if(l.getReseau().getValue().getName().getValue().contains("RER")) 
				this.rer.add(l);
			if(l.getReseau().getValue().getName().getValue().contains("Tramway"))
				this.tramway.add(l);
			if(l.getReseau().getValue().getName().getValue().contains("SNCF")) {
				this.sncf.add(l);
			}
			if(l.getReseau().getValue().getName().getValue().contains("M¨¦tro")) {
				this.metro.add(l);
			}
			
		}*/
		
	}
}
