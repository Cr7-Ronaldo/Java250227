package Java20250306;

import java.util.Scanner;

public class 함수5 {

	public static void main(String[] args) {
		/*
		 *  함수2개생성
		 *  매개변수로 100 정수값 전달하면
		 *  함수1은 1~100사이 홀수 리턴
		 *  함수2는 1~100사이 짝수 리턴
		 *  메인 함수에서 두함수를 호출하고,각 값을 출력
		 */
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 입력:");
    int num = sc.nextInt();
		
	int result1 = sum(num);	
	int result2 = sum2(num);
    System.out.println(result1);
    System.out.println(result2);
    
	}
	public static int sum(int x) {
		int b=0;
        for(;;) {
        	int index = (int)(Math.random()*100)+1;
        	if(index%2==1) {
        	b=index; 
        	break;}
        }
        return b;
        	
        }
	public static int sum2(int y) {
		int c=0;
		for(;;) {
			int index = (int)(Math.random()*100)+1;
			if(index%2==0) {
				c=index; 
				break;}
		}
		return c;
		
	}
		
		
	}
