package ch01.ex05;

import java.util.Scanner;

public class 문제1정답 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 :");
		String str = sc.nextLine();	
		
		int totalSecond = Integer.parseInt(str);
		
		int hours = totalSecond / 3600;
		int min = totalSecond%3600 / 60;
		int sec = totalSecond%60;
		
		System.out.printf("total초: %d초\n시간: %d시간 %d분 %d초\n",totalSecond,hours,min,sec );
		
		
		
		

	}

}
