package ch01.ex02;

import java.util.Scanner;

public class 버스요금1 {

	public static void main(String[] args) {
		
		/*
		 * 버스요금 계산 프로그램
		 * 기본요금 : 2000
		 * 1~5세 : 무료
		 * 6~12세 : 50%할인
		 * 13~18세 : 25%할인
		 * 19~64세 : 0%할인
		 * 65세 이상 : 무료
		 */
		
        Scanner sc = new Scanner(System.in);
        
	    int cost = 2000;
	    
	    
	    System.out.print("나이를 입력하세요:");
	    
	    int age = sc.nextInt() ;
	      if(age <= 5 ) {
	         cost = 0;
	      }else if(age <= 12) {
	            cost = cost*50/100;
	      }else if(age <= 18) {
	             cost = cost*75/100;
	      }else if(age <= 64) {
	    	  cost = cost;
	      }else {cost = 0;}    
	      
	      if(cost!=0) {
	         System.out.println("버스요금은 :"+ cost + "원");
	      }else {System.out.println("버스요금은 : 무료");
	      }   		
	   }
	}
	