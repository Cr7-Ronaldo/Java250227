package Java20250306;

import java.util.Scanner;

public class Add함수2 {
/*
 * 2개 값을 입력받아서, 더하는 기능 수행
 * 매개변수 x 반환x
 */
	public static void main(String[] args) {
		System.out.print("첫번째 값을 입력하세요:");
		Scanner sc=new Scanner(System.in);
        int first= sc.nextInt();
        System.out.print("두번째 값을 입력하세요:");
        int second= sc.nextInt();
        
        
        int result =  add(first,second);
        System.out.printf("%d+%d=%d",first,second,result);
	}
	public static int add(int plus1,int plus2) {
	
		int sum = plus1+plus2;
	return sum;
	}	
}
