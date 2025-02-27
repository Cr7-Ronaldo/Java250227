package ch01.ex05;

import java.util.Scanner;

public class Exam_문제1 {

	public static void main(String[] args) {
		/*
		 * 키보드 통해서 4000을 입력 받은후
		 * 시 분 초를 구하는 프로그램 구현
		 * 입력 : 4000
		 * 출력 : 1시간 6분 40초
		 */
		System.out.print("초 입력 : ");
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());//a=4000초
		int b = a/3600;//b=시간
		int c = (a-b*3600)/60; //4000초-1시간/60초 c=분
		int d = a-(b*3600+c*60);//4000초-1시간 6분 d=초 
		System.out.println("출력 : " + b+"시간 " + c+"분 " +  d+"초 ");
		
	}

}
