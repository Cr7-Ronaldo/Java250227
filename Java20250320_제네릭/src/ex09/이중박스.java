package ex09;

class Box<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
class BoxFactory1{
	public static <T> Box<Box<T>> makeBox(Box<T> box){
		Box<Box<T>> outerBox = new Box<>();
		outerBox.setObj(box);
		return outerBox;
	}
}




public class 이중박스 {

	public static void main(String[] args) {
        Box<String>box=new Box<>();
        box.setObj("홍길동");
        Box<Box<String>> doubleBox = BoxFactory1.makeBox(box);
        System.out.println(doubleBox.getObj().getObj());
	}

}
