package com.test.java.stat;

import java.util.Scanner;


public class Static {
	
	public static void main(String[] args) {
		
	boolean loop = true;
	Scanner scan=new Scanner(System.in);
	
	while (loop) {
		
		System.out.println("원하는 기능을 선택하세요.");
		System.out.println("1. 혼잡도 통계");
		System.out.println("2. 이용객 통계");
		System.out.println("3. 매출 통계");
		
		
		String sel = scan.nextLine();
		
		if(sel.equals("1")) {
//			CongestionStat.TotalCal(); //오류
			
		}else if(sel.equals("2")) { //"2. 이용객 통계"
			
			sel = scan.nextLine();
			
			if(sel.equals("1")) { //전체
				
				CongestionStat.TotalCal("0");
				
			}else if(sel.equals("2")) { //호선 선택
				String lines = scan.nextLine();
				
//				GuestStat.cal(lines);
				CongestionStat.TotalCal(lines);
				
			}
		}else if(sel.equals("3")) { //"3. 매출 통계"
			
			sel = scan.nextLine();
			
			if(sel.equals("1")) { //전체
				
				int[] asd = CongestionStat.TotalCal("0");
				CongestionStat.ChooseCal(asd);
				
				
			}else if(sel.equals("2")) { //선택 노선 통계
				
				String lines=scan.nextLine();
				int[] asd=CongestionStat.TotalCal(lines);
				CongestionStat.ChooseCal(asd);
				
			}
			
			SalesStat.cal();
		}else {
			System.out.println("다시 입력하십시오");
			loop=false;
		}
		
		
		
	}}}

