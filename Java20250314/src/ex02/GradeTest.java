package ex02;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터 갯수 입력>>>");
		int count = sc.nextInt();
		System.out.println("점수 입력>>>");
		int[] score = new int[count];
		for(int i=0;i<score.length;i++) {
			score[i]=sc.nextInt();
		}
        GradeExpr expr=new GradeExpr(score);
        expr.getTotal();
        expr.getAverage();
        expr.getGoodScore();
        expr.getBadScore();
        
}
}