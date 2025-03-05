package Java20250305.ch02;

import java.util.Scanner;

public class BreakEX4 {

	public static void main(String[] args) {
		
	   int balance=0;
	
		Scanner sc=new Scanner(System.in);
		for(;true;) {
					
		System.out.println("------------------------");
		System.out.println("1.예금|2.출금|3.잔고|4.종료"); 
		System.out.println("------------------------");
		System.out.print("선택>");
		int choose = sc.nextInt();
		if(choose==1) {System.out.print("예금액>");
			balance += sc.nextInt();}
		else if(choose==2) {System.out.print("출금액>");
	     	balance -= sc.nextInt();}
		else if(choose==3) System.out.println("잔고>"+balance);
	     
		
		else if(choose==4) {System.out.println("프로그램 종료");
		break;}
		}
		
		
	}
	
}
