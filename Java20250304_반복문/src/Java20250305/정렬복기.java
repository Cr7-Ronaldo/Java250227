package Java20250305;

public class 정렬복기 {

	public static void main(String[] args) {
		/*
		 * 로또 프로그램
		 * 배열 : 6칸 짜리 int배열
		 * 로또는 1~45 랜덤하게 저장
		 * 단, 중복불가
		 */
     int[] number = new int[10];
     for(int i=0;i<number.length;i++){
     number[i] = (int)(Math.random()*100)+1;}
     int max = number[0];
     int min = number[0];
     System.out.println("무작위 10개 번호: ");
     for(int i=0;i<number.length;i++) {
    	System.out.print( number[i]+" ");
    	}
     
     for(int i=0;i<number.length;i++) {
    	 if(max<number[i]) 
    	 max=number[i];
    	 if(min>number[i]) 
    	 min=number[i];
     }
     System.out.printf("\n최대값:%d, 최소값:%d\n",max,min);
    
     for(int i=0;i<number.length;i++) {
    	 
    	 for(int j=0;j<number.length-1-i;j++) {
    	 int temp=0;
    	 if(number[j]>number[j+1]) {
    		 temp=number[j];
    		 number[j]=number[j+1];
    		 number[j+1]=temp;
    		  }
    	 }
     }
    	 System.out.println("정렬된 번호: ");
    	 for(int i=0;i<number.length;i++) {
    		 System.out.print(number[i]+" ");
    	 }
    	 		
	}

}
