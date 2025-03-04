package ch04.ex01;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {
		/*
		 * 키보드 숫자 입력 받는다.
		 * 5     --> 1~5 15
		 * 10    --> 1~10 55
		 * 100   --> 1~100 5050
		 */
       Scanner sc = new Scanner(System.in);
       System.out.print("정수 입력:");
       int num = sc.nextInt();
       int sum = 0;
       for(int i=1;i<=num;i++) {
    	   sum += i;
    	     	 
       }
  //     for(int i=1;i<=num;i=i+2) {
  //  	   sum += i;
    	   
  //  홀수의 합   }
       //     for(int i=1;i<=num;i++) {
       //  	  if(i%2==1) 
     //       sum += i;       
       
       //  홀수의 합   }
	System.out.println(sum);
		
		
	}

}
