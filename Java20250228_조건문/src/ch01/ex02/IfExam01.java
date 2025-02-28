package ch01.ex02;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * 1. if
		 * 2. if ~ else
		 * 3. if ~ else if ~ else
		 *
		 * switch 문
		 * if문이 switch문 보다 활용 범위가 더 넓다.
		 */
		Scanner sc = new Scanner(System.in);
		
			System.out.print("국어점수 입력:");
			int kor = sc.nextInt();
			if(kor>=70) {
				System.out.println("합격");
			}
			if(kor<70) {
				System.out.println("불합격");
			}
			
			System.out.print("영어점수 입력:");
			int eng = sc.nextInt();
			if(eng>=70) {
				System.out.println("합격");
			}
			if(eng<70) {
				System.out.println("불합격");
			}
	
		System.out.println("종료");
		
	

}}
