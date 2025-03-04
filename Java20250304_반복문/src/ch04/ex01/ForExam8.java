package ch04.ex01;

import java.util.Scanner;

public class ForExam8 {

	public static void main(String[] args) {
		/*
		*7명 점수를 입력 받아서 , 총점 평균을 구하기
		 점수를 입력하면 등수 출력
		 */
      Scanner sc = new Scanner(System.in);
 
      int[] student = new int[7];
      int sum = 0;
      double avg = 0;
      int index = 0;
      int[] max = new int[7];
      for(int i=0;i<7;i++)
      {
      System.out.println("점수를 입력하세요:");
		student[i] = sc.nextInt();
      }
      for(int i=0;i<7;i++)
      { sum+=student[i];}
      avg=(double)sum/7;
      
      System.out.printf("평균 점수:%.2f\n",avg);
      for(int i=0;i<7;i++) {
    	 if(max[0]<student[i]) {
    		 max[0] = student[i];
    		}
      }
      for(int i=0;i<7;i++) {
    	  if(max[0]>student[i]&max[1]<student[i]) {
    		  max[1] = student[i];
    	  }}
    	  for(int i=0;i<7;i++) {
    		  if(max[1]>student[i]&max[1]<student[i]) {
    			  max[2] = student[i];
   		  }}
    		  for(int i=0;i<7;i++) {
    			  if(max[3]>student[i]&max[1]<student[i]) {
    				  max[3] = student[i];
    	  }}
    			  for(int i=0;i<7;i++) {
    				  if(max[4]>student[i]&max[1]<student[i]) {
    					  max[4] = student[i];
    	 }
      }
    System.out.println(max[0]+","+max[1]);
}
}
      
		
	
	



