package Java20250306;

public class 함수4 {

	public static void main(String[] args)//진입점 
	{
		// 매개 변수있고 반환값이 있는 경우
		/*
		 * 함수
		 * 입력(매개변수) 출력(반환값)
		 * o           o 함수3
		 * o           x 함수2
		 * x           o 함수4
		 * x           x 함수1
		 * 4가지 종류가 있다.
		 */
		//함수 정의
	
    
	int result = sum();//함수 홀출
	
 	System.out.println(result+"\n프로그램 종료!");
	 
	
	}//함수 선언할때는 괄호 밖에서 선언*
   public static int sum() {
	   System.out.println("함수 호출!!");	 
	   int a = 100;
	
	  return a;
	}   

}
