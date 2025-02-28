package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제2 {

	public static void main(String[] args) {
		/*
		 * 키보드 통해서 국어점수,영어점수 입력 받는다.
		 * 국어점수 영어점수 둘다 70 이상이면 합격이 출력되고, 아니면 불합격 메시지 출력
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력:");
		int a = sc.nextInt();
		
		sc.nextLine();//버퍼 엔터키 비우기	
		
		System.out.print("영어점수 입력:");
		int b = sc.nextInt();
		
		String result = (a>=70&&b>=70)?"합격":"불합격";//(조건) ? 참:거짓
		System.out.println(result);
		
		
					
	}

}
