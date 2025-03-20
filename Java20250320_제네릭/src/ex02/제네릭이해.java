package ex02;

import lombok.Getter;
import lombok.Setter;

class Apple{
	@Override
	public String toString() {
		return "i am an apple.";
	}
}

class Orange{
	@Override
	public String toString() {
		return "i am an orange.";
	}
}

class appleBox{
	private Apple ap;

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}
	
	
}

class orangeBox{
	private Orange op;

	public Orange getOp() {
		return op;
	}

	public void setOp(Orange op) {
		this.op = op;
	}
	
	
}
class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}

public class 제네릭이해 {	

	public static void main(String[] args) {

		Box aBox=new Box();//사과
		Box oBox = new Box();//오렌지
		
		aBox.setObj(new Apple());//사과박스 사과 담는다.
		oBox.setObj(new Orange());//오렌지박스 오렌지 담는다.
		
		Apple ap = (Apple)aBox.getObj();//error 발생
		Orange op = (Orange)oBox.getObj();//error 발생

		System.out.println(ap);
		System.out.println(op);
		
		
		
	}

}
