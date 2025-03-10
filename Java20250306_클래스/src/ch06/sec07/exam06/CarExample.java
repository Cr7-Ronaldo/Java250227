package ch06.sec07.exam06;

import java.util.Random;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : "+car1.getCompany());
		System.out.printf("%s모델 %s색깔 최고속도:%dkm/h\n",car1.getModel(),car1.getColor(),car1.getMaxSpeed());
		System.out.println();
		
		Car car2 = new Car("아반떼");
		System.out.println("car2.company : "+car2.getCompany());
		System.out.println("car2.model : "+car2.getModel());
		System.out.println();

		Car car3 = new Car("소나타","빨강");
		System.out.println("car3.company : "+car3.getCompany());
		System.out.println("car3.model : "+car3.getModel());
		System.out.println("car3.color : "+car3.getColor());
		System.out.println();
		
		Car car4 = new Car("그랜져","노랑",300);
		System.out.println("car4.company : "+car4.getCompany());
		System.out.println("car4.model : "+car4.getModel());
		System.out.println("car4.color : "+car4.getColor());
		System.out.println("car4.maxSpeed : "+car4.getMaxSpeed()+"km/h");
		System.out.println();
		car1.info();
		car2.info();
		car3.info();
		car4.info();
		
		Random random=new Random();
		int num1=random.nextInt(100)+1;
		int num2=(int)(Math.random()*100+1);
		System.out.println(num1+" "+num2);
		
	}


}
