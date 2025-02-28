package ch01.ex02;

import java.util.Scanner;

public class 월계산프로그램2 {
	public static void main(String[] args) {
/*
 * 문제 설명:
 * 사용자가 월을 입력하면 해당 월이 어느 계절에 해당하는지를 출력하는 프로그램을 작성하세요.
 * 12,1,2 : 겨울
 * 3,4,5 : 봄
 * 6,7,8 : 여름
 * 9,10,11 : 가을
 */
	Scanner sc = new Scanner(System.in);
	System.out.print("월을 입력하세요:");
	int month = sc.nextInt();
	
	if(month==3|month==4|month==5) {System.out.println("봄");
	
	}else if(month==6|month==7|month==8) {
		System.out.println("여름");
	}else if(month==9|month==10|month==11) {
			System.out.println("가을");
	}else if(month==12|month==1|month==2) {
		System.out.println("겨울");
	}else {System.out.println("올바르게 입력하세요");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}