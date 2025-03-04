package ch04.ex01;

import java.util.Scanner;

public class WhileExam4 {

	public static void main(String[] args) {

		int i=2;
		
		while(i<=9) {
			int j =1;
			System.out.printf("******%d단******\n",i);
		while(j<=9) {
			System.out.printf("%dx%d=%d\n",i,j,i*j);
			j++;
		}
		System.out.println();		
		i++;
		
		
		
		}
		
		
	}

}
