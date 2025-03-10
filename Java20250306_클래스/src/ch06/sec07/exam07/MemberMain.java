package ch06.sec07.exam07;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Member people = new Member();
		String name="";
		String id="";
		String password="";
		int age=0;
		for(int i=0;i<4;i++) {
			if(i==0) {
				System.out.print("이름 입력:");
				name = sc.nextLine();
							}
			if(i==1) {
				System.out.print("id 입력:");
				id = sc.nextLine();
			}
			if(i==2) {
				System.out.print("패스워드 입력:");
				password = sc.nextLine();
			}
			if(i==3) {
				System.out.print("나이 입력:");
				age = sc.nextInt();
			}
		}
		people.member(name, id, password, age);
		System.out.println(name+" id: "+id+" password: "+password+" 나이: "+age);
		}

	

}
