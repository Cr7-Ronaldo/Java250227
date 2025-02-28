package ch01.ex02;

import java.util.Scanner;

public class IfExam3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
			System.out.print("국어점수 입력:");
			int kor = sc.nextInt();
			if(kor>=80) {
				System.out.println("상");
			}else if(kor>=60){		
				System.out.println("중");
				}
			else{
				System.out.println("하");
			}
		
			System.out.print("영어점수 입력:");
			int eng = sc.nextInt();
			if(eng>=80) {
				System.out.println("상");
			}else if(eng>=60){		
				System.out.println("중");
			}else {
				System.out.println("하");
			}		
			
	System.out.println("종료");
	}
	
	}


