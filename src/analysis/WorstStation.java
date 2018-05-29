package analysis;

import datahandle.DHStations;

import java.util.HashMap;

import datahandle.DHStation;
import datahandle.GenerateRealTime;
public class WorstStation {
	public static void main(String []args) {
		GenerateRealTime stations=new GenerateRealTime();
		stations.readFileByLines("LineInfoRBFinal.txt");
		DHStations dhs=GenerateRealTime.getDHStation();
		System.out.println("Stations="+dhs.map.size());
		
		for (HashMap.Entry<String, DHStation> entry : dhs.map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());  
		}
		
		int[][] test=new int[2][3] ;
		for(int i=0;i<test.length;i++) {
			for(int j=0;j<test[0].length;j++) {
				test[i][j]=i+j;
				System.out.print("k= "+test[i][j]+'\t');
			}
			System.out.println();
		}
		
		
		
		System.out.println("byTrain= "+distancebyTrain(test));
		System.out.println("byTime= "+distancebyTime(test));
		
	}
	
	
	/**
	 * Euclidien norme 2 for every train and get the mean number
	 * @param station
	 * @return
	 */
	static double distancebyTrain(int[][]station) {
		int numTrain=station.length;
		int numPred=station[0].length;
		
		double dis=0;
		for(int i=0; i<numTrain;i++) {
			double disTrain=0;
			for(int j=0;j<numPred;j++) {
				disTrain+=station[i][j]*station[i][j];
			}
			disTrain=Math.sqrt(disTrain);
			dis+=disTrain;
		}
		dis=dis/(numTrain*1.0);
		return dis;
	}
	
	
	static double distancebyTime(int[][]station) {
		int numTrain=station.length;
		int numPred=station[0].length;
		
		double dis=0;
		for(int i=0 ;i< numPred;i++) {
			double localD=0;
			for(int j=0; j< numTrain;j++) {
				localD+=station[j][i]*station[j][i];
			}
			localD=Math.sqrt(localD);
			dis+=localD/numPred;
		}
		return dis;
	}
	
	
}
