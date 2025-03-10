package ch01.ex01;
public class CarMain {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.displayInfo();
		System.out.println();
		Car car2 = new Car("현대","소나타","흰색",300);
		car2.displayInfo();
		System.out.println();
		Car car3 = new Car("현대","그랜저");
		car3.displayInfo();
        System.out.println();
        car3.setColor("흰색");
        car3.displayInfo();
        
        
	}

}
