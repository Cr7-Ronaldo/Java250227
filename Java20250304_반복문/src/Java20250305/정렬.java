package Java20250305;

public class 정렬 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		int tmp;
		
		for(int i=0;i<10;i++) {
			tmp = (int)(Math.random()*100)+1;
			numArr[i] = tmp;
			
		}
		for(int i=0;i<10;i++) {
			System.out.print(numArr[i]+" ");
		}

	}

}
