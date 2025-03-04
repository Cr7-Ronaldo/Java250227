package ch04.ex01;

import java.util.Scanner;

public class ForExam7 {

	public static void main(String[] args) {
		/*
		*7명 점수를 입력 받아서 , 총점 평균을 구하기
		 */
       Scanner sc = new Scanner(System.in);
       int[] num = new int[] {1,-3,-700,1,2,9,3}; 
       int sum = 0;
       int max = 0; //변수 초기값
       int min = 0;
       int min2 = 0;
       for(int i=0;i<7;i++) {
      double[] numC= new double[5];
    	   
       sum += num[i];
       }
       double avg = sum/7.0;
       System.out.printf("총점 : %d, 평균 : %.2f\n",sum , avg);
		System.out.printf("7번째 방 값:%d\n",num[6]);
	
       System.out.println("-----------------------------");
       //코드
       for(int i=0;i<7;i++) {
       	if(max<num[i]) {
       		max=num[i];
       }
       }
       min=num[0];
       min2=num[1];
       	for(int i=0;i<7;i++) 
       	{   
       		if(min>num[i]) {
       			min=num[i];
       	}	
       	}
       	for(int i=0;i<7;i++) 
       	{   
       		if(min<num[i]&&num[i]<min2) {
       			min2=num[i];
       		}	
       	}

       
       
       System.out.println("최대값:"+ max);
       System.out.println("최소값:"+ min+","+ min2);
       
       System.out.println("------------------------");
       /*
        * {-1,-3,-700,1,2,9,3)
        * 키보드:1 입력하면 , 출력:1값은 4번째 위치입니다.
        */
	int index = 0;
	System.out.println("값을 입력 하세요:");
	int numA = sc.nextInt();
	for(int i=0;i<7;i++) {
		if(numA == num[i]) {
			index = i+1;
			break;
		}
	}
	
	
	if(index !=0)
	System.out.printf("출력 : %d값은 %d번째 위치입니다.",numA,index);
	else
	System.out.printf("%d값은 찾을수 없습니다.\n",numA);
	
	}

}

