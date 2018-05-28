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

class train {
	LinkedList<String> time = new LinkedList<String>();
	String arriveTime = null;
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
		String s = complete+"\t"+time.size()+"\t";
		for(String i:time) {
			s+=i+" ";
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
	}
	
}
public class DHStation {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
	private final String name;
	List<String> arriveTime1 = new LinkedList<String>();
	List<String> arriveTime2 = new LinkedList<String>();
	private String time1,time2;
	private String actualTime=null;
	
	
	List<train> trainAller = new LinkedList<train>();
	List<train> trainRetour = new LinkedList<train>();
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
	
	private long timeDifference(String t1,String t2) {
		try {
			return (format.parse(t1).getTime()-format.parse(t2).getTime())/1000;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 100000;
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
		s+="\n";
		for(train i:trainAller) {
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
}
