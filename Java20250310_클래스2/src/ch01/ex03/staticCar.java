package ch01.ex03;

public class staticCar {

	int speed;
	void run() {
		speed = 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           staticCar car = new staticCar();
	  car.speed=20;
	  car.run2();
	}
   void run2() {
	   System.out.println(speed);
   }
	
}

