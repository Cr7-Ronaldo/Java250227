package ch01.ex02;

import java.util.Random;

public class CarMain {

	public static void main(String[] args) {
		
		//정적 메소드를 객체 생성하지 않고
		//클래스명.정적메소드 실행가능
		Car.runState();
		System.out.println(Car.companyState);
		
		
		
	  
	   Car car1=new Car(); 
	   car1.displayInfo(); 
	   Car.runState();
	   System.out.println(); 
	   Car car2 = new Car("현대","소나타","흰색",300);
	   car2.displayInfo(); 
	   System.out.println(); 
	   Car car3 = new Car("현대","그랜저");
	   car3.displayInfo(); 
	   System.out.println(); 
	   car3.setColor("흰색");
	   car3.displayInfo();
	 
    
	   Random random = new Random();
	   int num1 = random.nextInt(45)+1;//인스턴스메소드
       System.out.println(num1);
       int num2 = (int)(Math.random()*45)+1;//정적메소드       
       System.out.println(num2);
	}

}
