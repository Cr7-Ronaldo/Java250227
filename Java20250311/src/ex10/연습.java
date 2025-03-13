package ex10;

public class 연습 {
  public static void main(String[]args) {
	  
	  int[] num = new int[10];
	  for(int i=0;i<num.length;i++) {
		 num[i]=(int)(Math.random()*100)+1; 
		  }
	  for(int i=0;i<num.length;i++) System.out.print(num[i]+"\n");
	     System.out.println();
	  //총점&평균
	  int sum=0;
	  double avg=0;
	  for(int i=0;i<num.length;i++) {
		  sum+=num[i];
	  }
	  avg=(double)sum/num.length;
	  
	  System.out.println("총점 : "+sum+" 평균 : "+avg);
  
  
  int max = num[0];
  int min = num[0];
  for(int i=0;i<num.length;i++) {
	  if(max<num[i]) max=num[i];
	  
	  if(min>num[i]) min=num[i];
	  
  }
  System.out.println("최대: "+max+", 최소: "+min);
}
}
