package datahandle;

import java.util.HashMap;

public class DHStations {
	HashMap<String, DHStation> map = new HashMap<String, DHStation>();
	DHStations(){
		
	}
	public void push(String[] para) {
		if(map.containsKey(para[0])) {
			map.get(para[0]).push(para);
		}else {
			map.put(para[0], new DHStation(para));
		}
	}
	
	public void print() {
		for (HashMap.Entry<String, DHStation> entry : map.entrySet()) {  
			  
		    System.out.println(entry.getKey() + ":" + entry.getValue());  
		  
		}  
	}
	
	public void printPassTrain() {
		for (HashMap.Entry<String, DHStation> entry : map.entrySet()) {  
			  
		    System.out.println(entry.getKey() + ":" + entry.getValue().getTrueNumbers());  
		  
		}  
	}
	
	public void prune() {
		for (HashMap.Entry<String, DHStation> entry : map.entrySet()) {  
			  
		    entry.getValue().prune();
		  
		}  
	}
	
}
