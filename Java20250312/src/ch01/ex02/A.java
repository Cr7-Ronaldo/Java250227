package ch01.ex02;

public class A {
     String name;
     A(){}
     A(String name){
    	 this.name=name;
     }
     void test() {
 		System.out.println("A class");
 	}
     void fucA(){
    	 System.out.println("funcA()");
     }
}

class B extends A{
	String address;
	B(){}
	B(String n2,String address){
		super(n2);
		this.address = address;
	}
	void test() {
		System.out.println("B class");
	}
	 void fucB(){
    	 System.out.println("funcB()");
     }
}

class C extends B{
	int age;
	C(){}
	C(String n,String a,int age){
		super(n,a);
		this.age=age;
	}
	void test() {
		System.out.println("C class");
	}
	 void fucC(){
    	 System.out.println("funcC()");
     }
}

class D extends C{
	int high;
	D(){}
	D(String n,String a,int age,int high){
		super(n,a,age);
		this.high=high;
	}
	@Override
	void test() {
		System.out.println("D class");
	}
	 void fucD(){
    	 System.out.println("funcC()");
     }
}


