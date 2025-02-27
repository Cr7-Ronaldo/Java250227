package ch01.ex12;

import java.util.Scanner;

public class NameAge2 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("나이 입력:");
	
	int age = sc.nextInt();
	
	sc.nextLine();//버퍼 클리어 nextint는 정수만 가져오기 때문에 버퍼에 엔터가 남아 있다.그래서 버퍼클리어를 하지 않으면 버퍼가 비어있지 않기 때문에 입력을 요구하지 않는다.
	
	System.out.print("이름 입력:");
	
	String name = sc.nextLine();
	
	System.out.println("\n이름:" + name + " 나이:" + age);
	
	
	}
}