package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	 
	 Scanner sc = new Scanner(System.in);
	 System.out.print("월 입력>>>");
	  int month =sc.nextInt();
	  System.out.print("등급입력:");
	  int grade = sc.nextInt();
   if(month%2==0) {
	   SalaryExpr s1 = new SalaryExpr(100);
	 System.out.println(month+"월 "+grade+"등급의 월급은:"+s1.getSalary(grade)+"입니다.");
     }
	if(month%2==1) {
		SalaryExpr s2 = new SalaryExpr();
		s2.grade=grade;
		 System.out.println(month+"월 "+grade+"등급의 월급은:"+s2.getSalary()+"입니다.");
	}
		   
		   
	   
   
	}

}
