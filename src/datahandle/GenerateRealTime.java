package datahandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
		 int numA = Integer.parseInt(para[4]);
		 int numR = Integer.parseInt(para[6]);
	//	 if(para[0].equals("Lozere")) {
		//	 System.out.println(para[1]+" "+para[3]+" "+para[4]+" "+para[5]+" "+para[6]);
		 //}
		 //TODO
		 dhs.push(para[0], numA==0 ? null : para[7], numR==0 ? null : para[7+numA], para[1]);
		 
	 }
	 public static void main(String[] args) {
		 readFileByLines("LineInfoRBFinal.txt");
		 dhs.print();
	 }
}
