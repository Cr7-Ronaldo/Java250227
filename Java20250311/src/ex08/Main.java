package ex08;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A aa = new A();
       
         B bb = new B();
         
         
         B b2 = new B("지리산", 50, "전라남도 남원시");
         b2.funcA();
         b2.funcB();
         b2.info();
         System.out.println();
         b2.infoB();
	}

}
