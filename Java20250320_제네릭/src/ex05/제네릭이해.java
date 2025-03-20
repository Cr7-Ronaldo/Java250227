package ex05;


class Box<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
class Person{}
class Car{}
public class 제네릭이해 {	

	public static void main(String[] args) {

	Box<String> sBox=new Box<>();
	Box<String> iBox=new Box<>();
	Box<Person> pBox= new Box<>();
	Box<Car> cBox=new Box<>();
	
	}

}
