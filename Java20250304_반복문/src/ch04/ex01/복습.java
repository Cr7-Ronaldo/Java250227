package ch04.ex01;

public class 복습 {
	public static void main(String[] args) {
		
		int num = 0;
		int num2 = 0;
		int num3 = 0;
		
		++num;//증감 연산자(전위연산자)
		num = num+1;//항상 우항이 먼저
		num += 1;
		num++;//증감 연산자(후위 연산자)
		
		num2 = ++num;
		
		num3 = num++;
		
		System.out.printf("%d %d %d",num,num2,num3);
		
		
		
	}
}
