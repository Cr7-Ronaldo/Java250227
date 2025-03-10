package Java20250306;

public class 함수3 {

	public static void main(String[] args)//진입점 
	{
		// 매개 변수있고 반환값이 있는 경우
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
	
    
	double result = sum(10,20);//함수 홀출
	double result2 = Math.sqrt(result);
 	System.out.println(result+"\n프로그램 종료!");
	
		
		
	
 	
 	
	
	}//함수 선언할때는 괄호 밖에서 선언*
   public static double sum(int num1,int num2) {
   System.out.println("void sum(int num1,int num2) 함수 호출!!");	   
	   int r=0;
	
	   
	   return num1*num1+num2*num2;//return 값을 반환한다.(num1 + num2 =>정수값)
	   
	}

}
