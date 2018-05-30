package datahandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class GenerateRealTime {
	static DHStations dhs = new DHStations();
	 public static void readFileByLines(String fileName) {
	        File file = new File(fileName);
	        BufferedReader reader = null;
	        try {
	            System.out.println("以行为单位读取文件内容，一次读一整行：");
	            reader = new BufferedReader(new FileReader(file));
	            String tempString = null;
	    //        int line = 1;
	            // 一次读入一行，直到读入null为文件结束
	            while ((tempString = reader.readLine()) != null) {
	                // 显示行号
	            	handleLine(tempString);
	                //System.out.println("line " + line + ": " + tempString);
	            //    line++;
	            }
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                }
	            }
	        }
	    }
	 public static void handleLine(String line) {
		 String[] para = line.split("\t");
		 int flag = 1;
		 if(para[1].equals("201805272000")&&para[0].equals("Chatelet") ) {
			 flag = 0;
		 }
		 if(para[0].equals("Chatelet")){
			 System.out.println(line);
		 }
		 dhs.push(para);
		 
	 }
	 public static void main(String[] args) {
		 readFileByLines("LineInfoRB");
		 readFileByLines("LineInfoRB1");
		 readFileByLines("LineInfoRB2");
		 readFileByLines("LineInfoRB3");
		 readFileByLines("LineInfoRB4");
	//	 dhs.print();
	//	 dhs.printPassTrain();
		 dhs.prune();
	//	 dhs.print();
	//	 dhs.printAverageDelay(null,null, "*");
		 
		 
		 
		 for(int k=7;k<=7;k++) {
			 Kmean km = new Kmean();
			 dhs.addTrain(km);
			 km.setK(k);
			 System.out.println(km.toMinute(km.clustering()));
			 
		 }
		 /*
		 Kmean km = new Kmean();
		 dhs.addTrain(km);
		 km.setK(6);
		 List<List<train>> re = km.clustering();
		 for(List<train> i : re) {
			 for(train j:i) {
				 System.out.print(j.arriveTime+":");
				 for(int k = 0;k<30;k++) {
					 System.out.print(j.diff[k]+"\t");
				 }
				 System.out.println();
			 }
			 System.out.println();
		 }
		 
		 for(List<train> i : re) {
			 for(train j:i) {
				 System.out.print(j.arriveTime+"\t");
			 }
			 System.out.println();
		 }*/
	 }
}
