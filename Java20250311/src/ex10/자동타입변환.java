package ex10;


	class Parent {
		int a=1;
	    void display() {
	        System.out.println("Parent 클래스의 display 메서드");
	    }
	}

	class Child extends Parent {
		int a=2;
	    void display() {
	        System.out.println("Child 클래스의 display 메서드");
	    }

	    void childMethod() {
	        System.out.println("Child 클래스의 고유 메서드");
	    }
	}

	public class 자동타입변환 {
	    public static void main(String[] args) {
	        Parent p = new Child(); // Upcasting: 자동 변환
	        p.display(); // Child의 display() 실행 (오버라이딩된 메서드)

	        // p.childMethod(); // 에러 발생: Parent 타입으로 변환되어 자식 클래스의 메서드 접근 불가

	        // Downcasting: 명시적 변환
	        if (p instanceof Child) {
	            Child c = (Child) p;
	            c.childMethod(); // 정상 실행
	        }
	    }
	}


