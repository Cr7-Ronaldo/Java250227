package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제4 {

	public static void main(String[] args) {
		/*
		 * 키보드 통해서 국어점수 입력 받는다.
		 * 국어점수
		 * 80이상이면 상
		 * 60이상이면 중
		 * 59이하면 하
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력:");
		int a = sc.nextInt();
		String result = (a==100)?"만점":(a>=80)?"상":(a>=60)?"중":"하";//(조건) ? 참:거짓
		System.out.println(result);
		
		
					
	}

}
