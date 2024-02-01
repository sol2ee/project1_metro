package com.test.java.stat;

import java.io.BufferedReader;
import java.io.FileReader;

public class CongestionStat {

	
	private static long[] AllCalData;
	static int month=1;
	static String path = "dat\\riding_" + month + ".txt"; 
	static int count=1;
	
	//month여기서 선언하지말고 static에서 int month=1;해서 매개변수로 넘겨주기
	

	public static long[] TotalCal(String lines) {
		try {

			lines += "호선";
			
			AllCalData = new long[12];
			
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
//				
				}
			
				month++;
                path="dat\\riding_"+month+".txt";
                count=1;
				
			}
			month=1;
			
		} catch (Exception e) {
			System.out.println("CongestionStat.TotalCal");
			e.printStackTrace();
		}
		
		
		return AllCalData;
		
	}
	
	
	
	
	
	public static void ChooseCal(long[] asd ) { //월 매출
		
		long[] sales = asd;
		long[] money = new long[12];
		
		
		
		for(int i=0; i<sales.length; i++) {
			
			money[i]=(long) (sales[i]*(1400*0.75+800*0.1));
			 System.out.println((i+1)+"월 매출합계 : " + money[i] );
			  
		}
		month=1;
		
		
	}
	public static void sum(long[] asd ) { //월 이용객
		
		long[] sales = asd;
		long[] sum = new long[12];
		
		
		
		for(int i=0; i<sales.length; i++) {
			
			sum[i]=sales[i];
			System.out.println((i+1)+"월 이용객 합계 : " + sum[i] );
			
		}
		month=1;
		
		
	}
}
