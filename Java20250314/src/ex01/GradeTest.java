package ex01;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("데이타 갯수>>>");
         int count = sc.nextInt();
         int[] nArr = new int[count];
         for(int i=0;i<nArr.length;i++) {
        	 System.out.println("점수입력>>>");
        	 nArr[i]=sc.nextInt();
         }
         
         for(int i=0;i<nArr.length;i++) {
         System.out.print(nArr[i]+",");}
         System.out.println();
         GradeExpr expr = new GradeExpr(nArr);
         System.out.println("총점 : "+expr.getTotal());
         System.out.printf("평균 : %.2f\n",expr.getAverage());
         System.out.println("최고 : "+expr.getGoodScore());
         System.out.println("최저 : "+expr.getBadScore());
         
                  
         
     	}
	
      
       
}
