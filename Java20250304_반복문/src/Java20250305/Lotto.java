package Java20250305;

public class Lotto {

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
     //배열 섞기
      for(int i=0; i<1000; i++) {
    	  for(int j=0;j<45;j++) {
    	  int index = (int)(Math.random()*45);
    	  int temp = lotto[j];
    	  lotto[j] = lotto[index];
    	  lotto[index] = temp;
    	  }
      }
      for(int i=0;i<6;i++) {
		System.out.println(lotto[i]+" ");
      }
		
		
	}

}
