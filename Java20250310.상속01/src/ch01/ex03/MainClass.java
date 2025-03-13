package ch01.ex03;
/*this 2가지 용도
1.동일 클래스 내에서 필드와 메서드에 접근할때 사용된다.(현재 객체 참조)
2.다른 생성자를 호출할때 사용된다.
super의 2가지 용도
1.상속 클래스에서 오버라이딩을 할때 사용된다.(부모 클래스의 멤버 참조)
2.부모 클래스의 생성자를 호출할때 사용된다.
final 3가지 용도
1.변수 지정할때 사용된다.
2.클래스 상속을 방지할때 사용된다.
3.오버라이딩을 방지할때 사용된다.*/

	class GrandParent{
		
		
		GrandParent(){}
		private String 할아버지이름;
		
	    GrandParent(String name){
	    	this.할아버지이름=name;
	    }
	    String get할아버지이름() {
	    	return 할아버지이름;
	    }
	    void displayInfo() {
			System.out.println("할아버지 이름은 "+할아버지이름);
		}
	}
	class Parent extends GrandParent{
		
		private int 아버지나이;
		Parent(){}
		Parent(String 할아버지이름,int 아버지나이){
		super(할아버지이름);
		this.아버지나이=아버지나이;
	}
	int get아버지나이() {
		return 아버지나이;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("아버지 나이는 "+아버지나이+"세");
	}
	}
	class Child extends Parent{		
	   
		String 나의취미;
		Child(){}
		
		Child(String 할아버지이름,int 아버지나이, String like) {
			super(할아버지이름,아버지나이);
			this.나의취미=like;
		}
	    void displayInfo() {
			super.displayInfo();
			System.out.println("나의 취미는 "+나의취미);
		}
	
	}
	public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child child = new Child("김철수",50,"야구");
    System.out.print("할아버지이름 : "+child.get할아버지이름()+"\n"+"아버지나이 : "+child.get아버지나이()+"\n"+"나의 취미 : "+child.나의취미+"\n");
    child.displayInfo();
	}
	}

