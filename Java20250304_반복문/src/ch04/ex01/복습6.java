package ch04.ex01;

import java.util.Scanner;

public class 복습6 {
	public static void main(String[] args) {
      
//		지역변수
		int num = 0;
		int num2 = 0;
		
		{
			int num3 = 0; // 블럭변수
			num++;
			num2++;
			
		}
//		System.out.println(num3);블럭 안에서 지정한 변수는 블럭 밖에서 사용할수 없다.
		
		
	}
//		함수
	
	public static void func() {
		int num = 0;
		
  }
}