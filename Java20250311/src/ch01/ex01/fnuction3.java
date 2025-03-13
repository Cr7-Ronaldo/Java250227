package ch01.ex01;

import java.util.Scanner;

public class fnuction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		     String result = add();
		     System.out.println("result = "+result);
		      
		   }		
	static String add() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력>>");
		//String name = sc.nextLine();
		
		return sc.nextLine();
	
	}
}

