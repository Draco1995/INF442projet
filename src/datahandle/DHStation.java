package datahandle;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DHStation {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
	private final String name;
	List<String> arriveTime1 = new LinkedList<String>();
	List<String> arriveTime2 = new LinkedList<String>();
	private Date time1,time2;
	DHStation(String name,String time1,String time2){
		this.name = name;
		
		if(time1 == null) {
			this.time1 = null;
		}else {
			try {
				this.time1 = format.parse(time1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(time2 == null) {
			this.time2 = null;
		}else {
			try {
				this.time2 = format.parse(time1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void push(String time1,String time2) {
		try {
			this.time1 = phrase(time1,this.time1,arriveTime1);
			this.time2 = phrase(time2,this.time2,arriveTime2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private Date phrase(String after,Date before, List<String> arriveTime) throws ParseException {
		if(after == null) {
			if(before!=null) {
				arriveTime.add(format.format(before));
			}
			return null;
		}
		
		if(before == null) {
			return format.parse(after);
		}
		
		Date aTime = format.parse(after);
		long difference = aTime.getTime()-before.getTime();
		long second = difference/(1000);
		if(second>70) {
			arriveTime.add(format.format(before));
		}
		return aTime;
	}
	
	@Override
	public String toString() {
		String s = "[";
		for(String i:arriveTime1) {
			s += i+" ";
		}
		s+="] [";
		for(String i:arriveTime2) {
			s += i+" ";
		}
		s+="]";
		return s;
	}
}
