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
		
		if(sel.equals("1")) { //1. 혼잡도 통계
//			CongestionStat.TotalCal(); //오류
			
		}else if(sel.equals("2")) { //"2. 이용객 통계"
			
			sel = scan.nextLine();
			
			if(sel.equals("1")) { //이용객 통계 > 월 전체
				
				long[] asd = CongestionStat.TotalCal("0");
				CongestionStat.sum(asd);
				
			}else if(sel.equals("2")) { //이용객 통계>특정 호선
				String lines = scan.nextLine();
				long[] asd = CongestionStat.TotalCal(lines);
				CongestionStat.sum(asd);
			}else if(sel.equals("3")) { //이용객 통계>호선별 달 이용객 합계
				long[] asd = CongestionStat.TotalCal("0");
				CongestionStat.sum(asd);
				hashmap.sum(asd);
			}
			
		}else if(sel.equals("3")) { //"3. 매출 통계"
			
			sel = scan.nextLine();
			
			if(sel.equals("1")) { //매출 통계 > 전체 노선 합계
				
				long[] asd = CongestionStat.TotalCal("0");
				CongestionStat.ChooseCal(asd);
				
				
			}else if(sel.equals("2")) { //매출 통계 > 선택 노선 통계
				
				String lines=scan.nextLine();
				long[] asd = CongestionStat.TotalCal(lines);
				CongestionStat.ChooseCal(asd);
			}else if(sel.equals("3")) { //매출 통계 > 호선별 연매출
				long[] asd= CongestionStat.TotalCal("0");
				hashmap.sum(asd);
			}
			SalesStat.cal();
			
		}else {
			System.out.println("다시 입력하십시오");
			loop=false;
		}
		
		
		
	}

	
	}
}
