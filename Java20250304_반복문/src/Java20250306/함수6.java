package Java20250306;

public class 함수6 {

	public static void main(String[] args)//진입점 
	{
		// 매개 변수있고 반환값이 없는 경우
		/*
		 * 함수
		 * 입력(매개변수) 출력(반환값)
		 * o           o
		 * o           x
		 * x           o
		 * x           x
		 * 4가지 종류가 있다.
		 */
		//함수 정의
	int number = 100;
	int evenResult = evenSum(number);
	int oddResult = oddSum(number);
	System.out.println("짝수합: "+evenResult);
	System.out.println("홀수합: "+oddResult);
	
	
	}//함수 선언할때는 괄호 밖에서 선언*
   public static int evenSum(int number) {
   int sum =0;
   for(int i=0;i<=number;i++) {
	   if(i%2==0) sum+=i;
   }
	return sum;   
   }
   public static int oddSum(int number) {
	   int sum =0;
	   for(int i=0;i<=number;i++) {
		   if(i%2==1) sum+=i;
	   }
	   return sum;   
   }
	}


