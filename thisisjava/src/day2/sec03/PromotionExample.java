package day2.sec03;

public class PromotionExample {

	public static void main(String[] args) {
		//컴퓨터는 2의 보수를 이용하여 뺄셈을 한다
		//뺄셈 하는법은 오버플로우가 발생하면 오버플로우가 발생한 값을 버린뒤 값을 취하고 오버플로우가 발생하지 않으면 다시 2의 보수로 만들어 그 값에 -값을 취한다.
		
        byte result1 = 10 + 20;
        System.out.println("result1: " + result1);
        
        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;
        System.out.println("result2: " + result2);
        
        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000;
        long result3 = v3 + v4 + v5;
        System.out.println("result3: " + result3);
        
        
        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4: " + result4);
        System.out.println("result4: " + (char)result4);
        
        int v8 = 10;
        int result5 = v8/4;
        System.out.println("result4: " + result4);
        
        int v9 = 10;
        		double result6 = v9/4.0;
        System.out.println("result6: " + result6);
        
        int v10 = 1;
        int v11 = 2;
        double result7 = (double) v10/v11;
        System.out.println("result7: " + result7);
	}

}
