package Java20250305.ch02;

public class DoWhile01 {

	public static void main(String[] args) {
		//do while
		int sum3=0;
		int j=1000;//초기값
		do {
		sum3 +=j;//증가,변동값
		j++;
			
		}while(j<=100);//조건
		System.out.println(sum3);
	}

}
