package ch01.ex01;



class A{
	
	String name;
	int age;
	A(){}
	A(String name,int age){
		this.name=name;
		this.age=age;
	}
	void run() {
		System.out.println("run()");
	}
	void eat() {
	System.out.println("eat()");
	}
}
class B extends A{
	String id;
	B(){};
	B(String name,int age,String id){
		super(name,age);
		this.id = id;
	}
  }
final class C extends B{
	String pw;
       C(){}
	   C(String name,int age,String id,String pw){
		   super(name,age,id);
		   this.pw=pw;
	   }

void displayInfo() {
	System.out.println("A class : "+name);
	System.out.println("A class : "+age);
	System.out.println("B class : "+id);
	System.out.println("C class : "+pw);
}
}
//class D extends C{
//final이 있으면 상속 불가	
//}



public class Main {

	public static void main(String[] args) {
	B b = new B();
	b.eat();
	b.run();
   	C c = new C("홍길동",20,"test","1234");
    c.displayInfo();
	}

}
