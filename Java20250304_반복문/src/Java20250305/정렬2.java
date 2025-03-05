package Java20250305;

import java.util.Random;

public class 정렬2 {

	public static void main(String[] args) {
		int seed = 12345;
		Random random = new Random(seed);
		int[] numArr = new int[10];
		int tmp;
		
		for(int i=0;i<10;i++) {
			tmp = (int)random.nextInt(100)+ 1;
			numArr[i] = tmp;
			
		}
		for(int i=0;i<10;i++) {
			System.out.print(numArr[i]+" ");
		}

	}

}
