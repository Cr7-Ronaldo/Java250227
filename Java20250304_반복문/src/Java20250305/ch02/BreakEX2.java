package Java20250305.ch02;

public class BreakEX2 {

	public static void main(String[] args) {
	
		int i=0;
		for(;true;i++) {
			for(int j=0;true;j++) {
				System.out.print("* ");
				if(i==j)
					break;
			}
			System.out.println();
			
		if(i==20)
			break;
		}
     System.out.println(i);
	}
	
}
