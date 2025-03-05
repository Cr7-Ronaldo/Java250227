package Java20250305;

public class Lotto3 {

	public static void main(String[] args) {
		/*
		 * 로또 프로그램
		 * 배열 : 6칸 짜리 int배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복불가
		 */
     int[] lotto = new int[45];
    
     for(int i=0;i<lotto.length;i++) {
       lotto[i]=i+1;
      }
     //1~45까지 공 집어 넣기
     for(int j=0;j<100;j++) {
    	  for(int i=0;i<45;i++) {
    	  int index = (int)(Math.random()*45);
    	  int temp = lotto[i];
    	  lotto[i] = lotto[index];
    	  lotto[index] = temp;
    	  }//랜덤으로 자리수를 지정해서 값을 바꾸기,중복이 되더라도 값이 바뀌지 않기 때문에 
    	  //중복값이 발생하지 않는다.
	}
    	System.out.print("이번주 예상 로또 번호: ");  
      for(int i=0;i<6;i++) {
		System.out.print(lotto[i]+" ");
      }
		
		
	}

}
