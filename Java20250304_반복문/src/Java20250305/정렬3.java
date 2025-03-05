package Java20250305;

import java.util.Random;

public class 정렬3 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] numArr = new int[8];
		int tmp;
		
		for(int i=0;i<numArr.length;i++) {
			tmp = (int)random.nextInt(100)+ 1;
			numArr[i] = tmp;
			
		}
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]+" ");
		}
//       최대값 ,최소값
		System.out.println();
		
		int max,min;
		max = min = numArr[0];
		
		for(int i=1;i<numArr.length;i++) {
			
			if(max<numArr[i]) //최대값
				max=numArr[i];
			
			if(min>numArr[i]) //최소값
				min=numArr[i];
	
		}
			
		System.out.println("최대값: "+max+" 최소값: "+min);
			
		System.out.println();
		//총점,평균
		int sum = 0;
		double avg = 0;
		for(int i=0;i<numArr.length;i++) {
			sum +=numArr[i];
		}
		avg = (double)sum/numArr.length;
		System.out.printf("총점: %d, 평균: %.2f\n",sum,avg);
		
		//정렬~(버블정렬)
		int temp;
		for(int i=0;i<numArr.length;i++) {
			
			for(int j=0;j<numArr.length-1-i;j++) {
				if(numArr[j]>numArr[j+1]) {
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
				
				
				
			}
			}
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i] + " ");
			
			
		}
		
		
		
		}
		
		
		
		
	}


