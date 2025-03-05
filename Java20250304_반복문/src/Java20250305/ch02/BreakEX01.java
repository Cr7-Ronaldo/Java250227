package Java20250305.ch02;

public class BreakEX01 {

	public static void main(String[] args) {
		int sum=0;
		int i=0;
		for(;true;i++) {
			sum+=i;
		if(i==334)
			break;
		}
     System.out.println(sum+" "+i);
	}
	
}
