package ch01.ex02;

public class SwitchExample2 {
	public static void main(String[] args) {

		int grade = 100;
		
		switch(grade/10) {
		case 10:
			System.out.println("A");
          //break;
		case 9:
			System.out.println("A");
			//break;
		case 8:
			System.out.println("B");
			//break;
		case 7:
			System.out.println("C");
			//break;
		case 6:
			System.out.println("D");
			//break;
		case 5:
			System.out.println("F");
			//break;
		}
		System.out.println("종료");
	}
}