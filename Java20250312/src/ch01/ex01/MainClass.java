package ch01.ex01;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 상속 전제 조건
		 * 하위클래스는 상위클래스 접근 가능(private 제외)
		 * 상위클래스는 하위클래스 접근 불가
		 */
         C c1 = new C("백두산","북한",100); 
         c1.fucA();
         c1.fucB();
         c1.fucC();
         
         B b1= new B("남산","서울");
         b1.fucA();
         b1.fucB();
         
         A a1= new A("지리산");
         a1.fucA();
         System.out.println("--------자동타입변환----------");
         
         A a2 = new B("치악산","원주");
         a2.fucA();
         
         A a3 = new C("한라산","제주",31);
         a3.fucA();
         System.out.println("-----------강제타입변환---------");
         A a4 = new B("백두산","함경북도");
         B b2 = new B("백두산","함경북도");
         
         
         A a5 = new A();
         B b3 = new B();
                  //자동타입변환
          a5 = b3; 
          a5.fucA();
          b3=(B)a5;//if a1 불가 
          b3.fucA();
         ((B)a5).fucB();
        A a6 = new B();
        B b4 = new B();
        b4 = (B)a6;
         
        
       A a7 = new C();
       B b5;
       b5 = (B)a7;
       b5.fucA(); 
        
       
       A a8 = new C();
       D d5;
       d5 = (D)a8;//불가
       d5.fucA(); 
         
	}

}
