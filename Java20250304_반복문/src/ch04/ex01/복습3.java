package ch04.ex01;

import java.util.Scanner;

public class 복습3 {
	public static void main(String[] args) {
       /*
        * 정수 : byte,short,char,int,long
        * 실수 : float,double
        * 논리 : boolean  boolean test = false
        */
		
		//객체 참조변수
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		//삼항연산자(조건 연산자)
		//(조건판단)? 참 : 거짓
		
		String msg = (num>0)? "양수":(num==0)?"영":"음수";
		System.out.println(msg);
		
		
}
}