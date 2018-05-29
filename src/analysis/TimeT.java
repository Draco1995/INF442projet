package analysis;

public class TimeT {
	int month;
	int day;
	int hour;
	int minute;
	public static void main(String []args) {
		String s="201805291345";
		TimeT t2=new TimeT("201805291244");
		TimeT t=new TimeT(s);
		System.out.println(t.substract(t2));
	}
	public TimeT(String s) {
		this.day=Integer.parseInt(s.substring(6, 8));
		this.minute=Integer.parseInt(s.substring(10,12));
		this.hour=Integer.parseInt(s.substring(8,10));
		this.month=Integer.parseInt(s.substring(4,6));
	}
	public int substract(TimeT T) {
		int hours=this.hour-T.hour;
		int minutes=this.minute-T.minute;
		return minutes+hours*60;
	}

}
