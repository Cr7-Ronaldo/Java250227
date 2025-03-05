package Java20250305.ch02;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;//i==number.length
		int[] number = null;

		for(;true;) {
			System.out.println("--------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("--------------------");
			System.out.print("선택>");
			int choose = sc.nextInt();
			if(choose==1) {System.out.print("학생수>");
				i = sc.nextInt();
				number = new int[i];
			}		
			else if(choose==2) {
				for(int j=0;j<i;j++) {
				System.out.printf("score[%d]>",j);
				number[j] = sc.nextInt(); 
			}
			}
			
			else if(choose==3) {
				for(int j=0;j<i;j++)
				System.out.printf("score[%d]:%d\n",j,number[j]);
			}
			else if(choose==4) {
				int max=0;
				int sum=0;
				double avg=0;
				for(int j=0;j<i;j++) {
					if(max<number[j]) max=number[j];
					sum+=number[j];
				}
				avg=(double)sum/i;	
				System.out.println("최고 점수:"+max);
				System.out.printf("평균 점수:%.1f\n",avg);
			}
			else if(choose==5) { System.out.println("프로그램 종료");
			break;}
			
		}

	}

}
