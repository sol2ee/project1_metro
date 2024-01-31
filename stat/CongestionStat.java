package com.test.java.stat;

import java.io.BufferedReader;
import java.io.FileReader;

public class CongestionStat {

	
	private static int[] AllCalData;
	static int month;
	static String path;
	static int count;
	
	
	static {
		
		month = 1;
		path = "dat\\riding_" + month + ".txt"; 
		count =1;
		
	}
	
	public static int[] TotalCal(String lines) {
		try {
			
			lines += "호선";
			
			AllCalData = new int[12];
			
			while(month<13) {
				
				BufferedReader reader
				= new BufferedReader(new FileReader(path));
				
				String line=null;
				
				while((line=reader.readLine())!=null) {
					
					String[]temp=line.split(","); //쪼개기
					
					for(int i=0; i<temp.length; i++) {
						
						temp[i] = temp[i].replace("\"", "");
						
					}
					
						//선택 호선 이용객 수 월별
					if(temp[1].equals(lines)) {
						
						AllCalData[month-1] += Integer.parseInt(temp[3]);
						
						//전체 이용객 수 월별
					}else if(lines.equals("0호선") && count !=1) {
						
						AllCalData[month-1] += Integer.parseInt(temp[3]);
						
					}			
					count++;
				}
				count = 1;
				
				month++;
			}
			
			
		} catch (Exception e) {
			System.out.println("CongestionStat.TotalCal");
			e.printStackTrace();
		}
		
		month=1;
		return AllCalData;
		
	}
	
	
	
	
	public static void ChooseCal(int[] asd ) {
		
		int[] sales = asd;
		int[] money = new int[12];
		
		
		
		for(int i=0; i<sales.length; i++) {
			
			money[i]=sales[i]*1500;
			 System.out.println((i+1)+"월 매출합계 : " + money[i] );
			  
		}
		
	}
}
