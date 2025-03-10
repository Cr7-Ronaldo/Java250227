package ch01.ex03;

public class 함수오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    functionA();
    functionA(2);
    functionA(2.0);
    functionA(2,2);
	}
    public static void functionA(){
    	System.out.println("functionA");
    }
    public static void functionA(int n){
    	System.out.println("functionA(int n)");
    }
    public static void functionA(double n){
    	System.out.println("functionA(double n)");
    }
    public static void functionA(int n1,int n2){
    	System.out.println("functionA(int n1,int n2)");
    }
}
