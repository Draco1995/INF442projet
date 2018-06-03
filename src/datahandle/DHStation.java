package datahandle;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
class train {
	LinkedList<String> time = new LinkedList<String>();
	String arriveTime = null;
	int[] diff = new int[30];
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
		for(int i:diff) {
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
	
	public int getDiffIndex(int i) {
		return diff[i];
	}
	
	
}*/
public class DHStation {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
	private final String name;
	List<String> arriveTime1 = new LinkedList<String>();//所有的aller的车的经过时间
	List<String> arriveTime2 = new LinkedList<String>();//所有retour的车的经过时间
	private String time1,time2;//time1 临时用的
	private String actualTime=null;//临时用的，表示处理数据条时候的时间
	
	
	List<train> trainAller = new LinkedList<train>();//一个list保管所有处理过程中创建过得车，可能pass过也可能没pass过
	List<train> trainRetour = new LinkedList<train>();//
	int numOfAller = 0;
	int numOfRetour = 0;
	LinkedList<train> qa = new LinkedList<train>();
	LinkedList<train> qr = new LinkedList<train>();
	
	
	DHStation(String[] para){
		name = para[0];
		
		this.push(para);
		/*
		this.name = name;
		this.actualTime = actualTime;
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
		}*/
	}
	
	
	public void push(String[] para) {
		try {
			handle(true,para, qa,time1,trainAller);
			handle(false,para,qr,time2,trainRetour);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/*
		try {
			this.time1 = phrase(time1,this.time1,arriveTime1);
			this.time2 = phrase(time2,this.time2,arriveTime2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.actualTime = actualTime;
		*/
	}
	
	private void handle(boolean f,String para[],LinkedList<train> q, String t,List<train> lt) throws ParseException {
		
		if(actualTime ==null || timeDifference(para[1],actualTime)>300) {
			q.clear();
		//	System.out.println(para[4]+" "+para[6]);
			int num = Integer.parseInt(para[f?4:6]);
			int pos = 7+ (f?0:Integer.parseInt(para[4]));
			for(int i = pos;i<pos+num;i++) {
				train tr = new train(para[i]);
				q.add(tr);
				lt.add(tr);
			}
			
			if(num !=0)	t = para[pos];
			else t = null;
			
			actualTime = para[1];
			if(f) {
				numOfAller = num;
			}else {
				numOfRetour = num;
			}
		}else {//如果在时间内，开始处理数据
			//判断是否有车到达
			int num = Integer.parseInt(para[f?4:6]);  //有多少时间预测
			int pos = 7+ (f?0:Integer.parseInt(para[4])); //时间预测开始位置
			
			int cursor = pos;
			for(train i:q) {
				i.added = false;
				for(int j = pos;j<pos+num;j++) {
					if(para[j]==null) {
						continue;
					}
					long dif = timeDifference(para[j],i.last());
					if(Math.abs(dif)<70) {
						i.add(para[j]);
						para[j]=null;
						i.added = true;
						break;
					}
				}
			}
			for(train i:q) {
				if(i.added ==true) {
					continue;
				}
				for(int j = pos;j<pos+num;j++) {
					if(para[j]==null) {
						continue;
					}
					long dif = timeDifference(para[j],i.last());
					if(Math.abs(dif)<140) {
						i.add(para[j]);
						para[j]=null;
						i.added = true;
						break;
					}
				}
			}
			
			for(train i:q) {
				if(i.added ==true) {
					continue;
				}
				for(int j = pos;j<pos+num;j++) {
					if(para[j]==null) {
						continue;
					}
					long dif = timeDifference(para[j],i.last());
					if(Math.abs(dif)<200) {
						i.add(para[j]);
						para[j]=null;
						i.added = true;
						break;
					}
				}
			}
			
			for(train i:q) {
				if(i.added ==true) {
					continue;
				}
				for(int j = pos;j<pos+num;j++) {
					if(para[j]==null) {
						continue;
					}
					long dif = timeDifference(para[j],i.last());
					if(Math.abs(dif)<250) {
						i.add(para[j]);
						para[j]=null;
						i.added = true;
						break;
					}
				}
			}
			
			
			
			if(q.size()!=0) {
				train first = q.getFirst();
				for(train i : q) {
					if(timeDifference(i.last(),first.last())<0) {
						first = i;
					}
				}
				if(first.added==false&&Math.abs(timeDifference(first.last(),actualTime))<=120) {
					first.complete = true;
					if(f) {
						arriveTime1.add(first.last());
					}else {
						arriveTime2.add(first.last());
					}
				}
			}
			List<train> l = new LinkedList<train>();
			for(train i: q) {
				
				if(i.added == false) {
					l.add(i);
				}
			}
			q.removeAll(l);
			
			for(int i = pos;i<pos+num;i++) {
				if(para[i]!=null) {
					train  nt = new train(para[i]);
					q.add(nt);
					lt.add(nt);
				}
			}
			actualTime = para[1];
			if(f) {
				numOfAller = num;
			}else {
				numOfRetour = num;
			}
		}
		
	}
	
	public static long timeDifference(String t1,String t2) {
		try {
			return (format.parse(t1).getTime()-format.parse(t2).getTime())/1000;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			return 1000000000;
		}
	}
	/*
	private boolean phrase(String after,Date before, List<String> arriveTime) throws ParseException {
		if(after == null) {
			if(before!=null) {
				arriveTime.add(format.format(before));
				
			}
			return false;
		}
		
		if(before == null) {
			return format.parse(after);
		}
		
		Date aTime = format.parse(after);
		long difference = aTime.getTime()-before.getTime();
		long second = difference/(1000);
		if(second>70) {
			if((format.parse(this.actualTime).getTime()-before.getTime())<120*1000)
				arriveTime.add(format.format(before));
			
		}
		return aTime;
	}
	*/
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
		s+="\nAller:\n";
		for(train i:trainAller) {
			s+=i+"\n";
		}
		s+="\nRetour:\n";
		for(train i:trainRetour) {
			s+=i+"\n";
		}
		return s;
	}
	
	public int getTrueNumbers() {
		int sum = 0;
		for(train i:trainAller) {
			if(i.complete==true) {
				sum++;
			}
		}
		return sum;
	}
	
	public void prune() {
		List<train> l = new LinkedList<train>();
		for(train i: trainAller) {
			
			if(i.complete == false||i.time.size()<30) {
				l.add(i);
			}
		}
		trainAller.removeAll(l);
		l.clear();
		for(train i: trainRetour) {
			
			if(i.complete == false||i.time.size()<30) {
				l.add(i);
			}
		}
		trainRetour.removeAll(l);
		
		for(train i:trainAller)
			i.prune();
		for(train i:trainRetour)
			i.prune();
		
		
		
		
	}


	public String AverageDelay(String s, String e,String AR) {
		SimpleDateFormat formatLocal = new SimpleDateFormat("HHmm");
		Date start=null,end=null;
		if(s != null && e != null) {
			try {
				start =  formatLocal.parse(s);
				end = formatLocal.parse(e);
			}catch(Exception ee) {
				System.err.println(ee);
			}
		}
		
		int[] ret = new int[30];
		int count = 0;
		if(AR=="A"||AR=="*") {
			Iterator<train> it = trainAller.iterator();
			for(int i = 0;i<trainAller.size();i++) {
				train t= it.next();
				if(start!=null) {
					if(!t.testValid(start, end)) {
						continue;
					}
				}
				for(int j = 0;j<30;j++) {
					
					//ret[j]+= t.getDiffIndex(j);
					ret[j]+= t.getDiffIndex(j)*t.getDiffIndex(j);
				}
				count++;
			}
		}
		
		if(AR=="R"||AR=="*") {
			Iterator<train> it = trainRetour.iterator();
			for(int i = 0;i<trainRetour.size();i++) {
				train t= it.next();
				if(start!=null) {
					if(!t.testValid(start, end)) {
						continue;
					}
				}
				for(int j = 0;j<30;j++) {
					//ret[j]+= t.getDiffIndex(j);
					ret[j]+= t.getDiffIndex(j)*t.getDiffIndex(j);
				}
				count++;
			}
		}
		
		s = "";
		for(int i:ret) {
			if(count!=0)
				s+=String.format("%.1f", (float)i/count)+"\t";
			else {
				if(i!=0) {
					System.err.println("err");
				}
				s+=0+" ";
			}
		}
		return s;
	}


	public void addTrain(Kmean km) {
		// TODO Auto-generated method stub
		for(train i:trainAller) {
			km.addRecord(i);
		}
		for(train i:trainRetour) {
			km.addRecord(i);
		}
	}
}
