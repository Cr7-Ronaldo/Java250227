package ch04.ex01;

public class WhileExam01 {

	public static void main(String[] args) {
		/*
		 * int sum=0;
		 * for(int=0;int<=5;i++){
		 * sum+=i;
		 * }
		 */
	int sum = 0;
    int i = 0;
    
    while(i<=5) {
    	sum+=i;
    	i++;
    }
	System.out.println("sum="+ sum);
	
	}

}
