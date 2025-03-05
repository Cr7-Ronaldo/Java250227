package Java20250305.ch02;

public class BreakEX3 {

	public static void main(String[] args) {
	
		int sum=0;
		
		for(int i=0;i<=100;i++) {
			
			if(i%2==1)sum += i;
			
		}
		System.out.println(sum);
		
		int sum2 =0;
		for(int i=0;i<=100;i++) {
			
			if(i%2 ==0) continue;
			sum2 += i;
		}
		System.out.println(sum2);
		
	}
	
}
