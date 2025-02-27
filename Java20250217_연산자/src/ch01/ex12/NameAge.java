package ch01.ex12;

import java.util.Scanner;

public class NameAge {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("이름 입력:");
	
	String name = sc.nextLine();
	
	System.out.print("나이 입력:");
	
	int age = sc.nextInt();
	
	System.out.println("\n이름:" + name + " 나이:" + age);
	
	
	}
}