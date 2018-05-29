package datahandle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class train {
	LinkedList<String> time = new LinkedList<String>();
	String arriveTime = null;
	public double[] diff = new double[30];
	public boolean complete = false;
	public boolean added = false;
	train(String t){
		time.add(t);
	}
	public void add(String t) {
		time.add(t);
	}
	
	public String last() {
		return time.getLast();
	}
	
	@Override
	public String toString() {
		String s = complete+"\t"+time.size()+"\t"+arriveTime+"\t";
		for(double i:diff) {
			s+=i+"\t";
		}
		return s;
	}
	
	public void prune() {
		LinkedList<String> nt = new LinkedList<String>();
		Iterator<String> it = time.descendingIterator();
		for(int i = 0;i<30;i++) {
			nt.add(it.next());
		}
		time = nt;
		arriveTime = time.getFirst();
		it = time.iterator();
		for(int i = 0;i<30 ;i++){
			diff[i] = (((int)DHStation.timeDifference(it.next(), arriveTime))/60);
		}
	}
	
	private boolean timeBig(int houra, int minutea,int hourb,int minuteb) {
		return (houra*60+minutea-hourb*60-minuteb)>=0;
	}
	
	public boolean testValid(Date a,Date b) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
		Date at;
		try {
			at = format.parse(arriveTime);
			return timeBig(at.getHours(),at.getMinutes(),a.getHours(),a.getMinutes())&&timeBig(b.getHours(),b.getMinutes(),at.getHours(),at.getMinutes());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public double getDiffIndex(int i) {
		return diff[i];
	}
	
	
}