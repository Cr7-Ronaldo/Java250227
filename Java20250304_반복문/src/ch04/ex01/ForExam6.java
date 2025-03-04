package ch04.ex01;

import java.util.Scanner;

public class ForExam6 {

	public static void main(String[] args) {
		/*
		*7명 점수를 입력 받아서 , 총점 평균을 구하기
		 */
       Scanner sc = new Scanner(System.in);
       int[] num = new int[7]; //배열선언, int배열 5개가 있다.
       int sum = 0;
       
       
       for(int i=0;i<7;i++) {
       System.out.println(i+1 + "번학생 점수>>>");
       num[i] = sc.nextInt();
       sum += num[i];
       }
       double avg = sum/7.0;
       System.out.printf("총점 : %d, 평균 : %.2f\n",sum , avg);
		
	}

}
