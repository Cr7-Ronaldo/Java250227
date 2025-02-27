package ch01.ex11;

import java.util.Scanner;

public class ConditionalExample {
	public static void main(String[] args) {
  //삼항(조건) 연산자
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 입력: ");
	
	int num = sc.nextInt();
	
	int result = (num > 0) ? num : -num;
	
	System.out.println(result);
	
}}