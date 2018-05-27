package datahandle;

import java.util.HashMap;

public class DHStations {
	HashMap<String, DHStation> map = new HashMap<String, DHStation>();
	DHStations(){
		
	}
	public void push(String name, String time1,String time2) {
		if(map.containsKey(name)) {
			map.get(name).push(time1,time2);
		}else {
			map.put(name, new DHStation(name,time1,time2));
		}
	}
	
	public void print() {
		for (HashMap.Entry<String, DHStation> entry : map.entrySet()) {  
			  
		    System.out.println(entry.getKey() + ":" + entry.getValue());  
		  
		}  
	}
	
}
