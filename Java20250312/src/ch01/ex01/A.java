package ch01.ex01;

public class A {
     String name;
     A(){}
     A(String name){
    	 this.name=name;
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
	 void fucC(){
    	 System.out.println("funcC()");
     }
}
