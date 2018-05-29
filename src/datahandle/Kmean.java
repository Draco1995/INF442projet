package datahandle;

import java.util.List;

public class Kmean extends KMeansClustering<train>{

	@Override
	public double similarScore(train o1, train o2) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i = 0;i<30;i++) {
			sum += Math.sqrt(o1.diff[i]*o1.diff[i]-o2.diff[i]*o2.diff[i]);
		}
		return sum;
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
		for(train i:list) {
			for(int j = 0;j<30;j++) {
				t.diff[j]/=list.size();
			}
		}
		return t;
	}


}
