package ch01.ex04;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car car = new Car();
       car.setBrand("toyota");
       car.setSpeed(100);
       car.accelerate(50);
       car.refuel(100);
       car.displayInfo();
       Shape shape = new Shape() {
    	  
    	  public double calculateArea() { return 0;}
    	 
       };
       shape.info();
       
	}

}
