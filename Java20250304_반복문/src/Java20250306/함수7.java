package Java20250306;

import java.util.Scanner;

public class 함수7 {

	public static void main(String[] args) 	{
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("정수를 입력하세요:");
	int num = sc.nextInt();
	int[] number= new int[num];
	for(int i=0;i<number.length;i++) {
		number[i]=(i+1)*10;
		sum+=number[i];
	}
	int youngResult = youngSum(number);
	int young2Result = young2Sum(number);
	int evenResult = evenSum(number);
	int oddResult = oddSum(number);
	System.out.println("10배 짝수합: "+evenResult);
	System.out.println("10배 홀수합: "+oddResult);
	System.out.println("짝수합: "+youngResult);
	System.out.println("홀수합: "+young2Result);
	System.out.println(sum);
	
	}//함수 선언할때는 괄호 밖에서 선언*
   public static int evenSum(int[] numA) {
       int sum =0;
       for(int i=0;i<numA.length;i++) {
	//  System.out.print(numA[i] + " ");	   
       if((numA[i])/10%2==0) sum += numA[i];
	   	   	   
   }
	return sum;   
   }
   public static int oddSum(int[] numB) {
	   int sum =0;
	   for(int i=0;i<numB.length;i++) {
	   if((numB[i]/10)%2==1) sum+=numB[i];
	   }
	   return sum;   
   }
   public static int youngSum(int[] num) {
	   int sum =0;
	   for(int i=0;i<num.length;i++) {
		  if(num[i]/10%2==0) {
			  sum+=num[i];
		  }
	   }
	   return sum/10;
	   
	   
   }
   public static int young2Sum(int[] numC) {
	   int sum =0;
	   for(int i=0;i<numC.length;i++) {
		   if(numC[i]/10%2==1) sum+=numC[i];
		   
	   }
	   return sum/10;
	   
	   
   }
   
   
   
	}


