package ex06;
/*
 * T : 타입인자.
 * T extends A : T에게 전달되는 대상은 A이거나 A자손만 전달 가능하다.
 */

class Box<T extends A>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
class A{}
class B extends A{}
class C extends B{}
class D {} 
class Person{}
class Car{}
public class 제네릭이해 {	

	public static void main(String[] args) {

	Box<A> aBox=new Box<>();
	Box<B> bBox=new Box<>();
	Box<C> cBox= new Box<>();
    //Box<Integer> ibox = new Box<>();불가
	//Box<D> dBox=new Box<>();불가
	//Box<Car> cBox=new Box<>();불가
	//Box<Person> pBox=new Box<>();불가
	
	}

}
