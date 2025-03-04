package ch04.ex01;

import java.util.Scanner;

public class ForExam10 {

	public static void main(String[] args) {
		
	/*
	 * {10,-3,-700,1,2,9,3}
	 * 정렬(sort)해서 출력하기...{-700,-3,1,2,3,9,10}	
	 */
   		
		for(int i=0;i<5;i++) {
		   for(int j=0;j<=i;j++) {	
		System.out.print("* ");
	      }
		System.out.println();
	   }	System.out.println();
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {	
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
			for(int i=0;i<5;i++) {
				for(int j=0;j<5-i;j++) {	
					System.out.print("* ");
				}
				System.out.println();
		}
       	
	}

}

