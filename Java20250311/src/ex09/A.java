package ex09;

public class A {
 
	private String name;
	
    A(String name){
	  this.name=name;
  }
    void test() {
   System.out.println(name);
 }
}
class B extends A{
     private String address;
       
     B(String name,String address){  
        super(name);
		this.address=address;
	}
     void test() {
      super.test();
   	  System.out.println(address);
    }
}
class C extends B{	
	private int age;
	
	C(String name,String address,int age){
		super(name,address);
		this.age=age;

	}
	@Override
  void test() {
	  super.test();	
	  System.out.println(age);
  }
  
}