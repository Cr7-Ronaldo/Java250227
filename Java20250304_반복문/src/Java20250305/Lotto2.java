package Java20250305;

public class Lotto2 {

	public static void main(String[] args) {
		/*
		 * 로또 프로그램
		 * 배열 : 6칸 짜리 int배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복불가
		 */
     int[] lotto = new int[6];
     boolean flag = false;
     
     for(int i=0;i<lotto.length; i++) {
    	//중복 체크 과정 필요
    	 int temp = (int)(Math.random()*45)+1;	 
    	 
    	 
    	 for(int j=0; j<lotto.length; j++) {
    		 if( temp == lotto[j]) {
    			 flag = true;    
    			 break;
    		 }
    	 }
    	 if(flag != true)
    	     lotto[i] = temp;
    	 else {//중복된 경우는
    		 i--;//i값 하나 감소
    		 flag = false;//중복된 경우 flag값 초기화
    	 }
     
     }
    for(int i=0;i<6;i++)	 
    {System.out.print(lotto[i]+" ");}	
    
	}
}
	
