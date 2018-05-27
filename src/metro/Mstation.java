package metro;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

public class Mstation {
	private String name;
	
	List<Mstation> neighbour = new LinkedList<Mstation>();
	
	public Color c;
	
	Mstation (String name, Color c){
		this.name = name;
		this.c = c;
	}
	
	public void addNeighbour(Mstation ms) {
		neighbour.add(ms);
	}
	
	public int getNeignhourNumber() {
		return neighbour.size();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
