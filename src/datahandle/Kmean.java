package datahandle;

import java.util.List;

public class Kmean extends KMeansClustering<train>{

	@Override
	public double similarScore(train o1, train o2) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i = 0;i<30;i++) {
			sum += Math.abs(o1.diff[i]*o1.diff[i]-o2.diff[i]*o2.diff[i]);
		}
		return 1/sum;
	}

	@Override
	public boolean equals(train o1, train o2) {
		// TODO Auto-generated method stub
		boolean flag = true;
		for(int i = 0;i<30;i++) {
			if(o1.diff[i]!=o2.diff[i]) {
				flag=false;
				break;
			}
		}
		return flag;
	}

	@Override
	public train getCenterT(List<train> list) {
		// TODO Auto-generated method stub
		train t = new train("test");
		for(train i:list) {
			for(int j = 0;j<30;j++) {
				t.diff[j]+=i.diff[j];
			}
		}
		for(int j = 0;j<30;j++) {
			t.diff[j]/=list.size();
		}
		return t;
	}
	
	public double calculateDistance(train center,List<train> l) {
		double sum = 0.0;
		for(train t:l) {
			sum+= Math.sqrt(1/similarScore(center,t));
		}
		return sum;
	}
	public String test(List<List<train>> res) {
		String ans = "";
		double sum = 0.0;
		double sum2 = 0.0;
		int size;
		for(List<train> l:res) {
			double a = calculateDistance(getCenterT(l),l);
			ans+=a+" ";
			sum+=a;
			size = l.size();
			sum2 = 0.0;
			for(train i: l) {
				sum2+=((double)i.toMinutes())/size;
			}
			ans+=(Math.round(sum2)/60)+":";
			ans+=(Math.round(sum2)%60)+" ";
		//	System.out.println(sum2);
		}
		
		
		return "K:"+this.getK()+" "+sum+" "+ans;
	}
	
	public String toMinute(List<List<train>> res) {
		String ans = "";
		for(List<train> l:res) {
			for(train i:l) {
				ans+= (Math.round(i.toMinutes())/60)+":"+(Math.round(i.toMinutes())%60)+"\t";
			}
			ans+="\n";
		}
		return ans;
	}


}
