package ex03;

public class Exam01 {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		
		int[] arr = is_even(numbers);
		for(int i : arr)
			
			System.out.println(i);
		
	}
	static int[] is_even(int[] n) {
		
		int[] arr=new int[n.length];
		int j=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0)
			{arr[j]=n[i];
			j++;}
		}
		int[] num=new int[j];
		for(int i=0;i<j;i++) num[i]=arr[i];
		return num;
	}
	
	
}

