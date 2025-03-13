package ch01.ex04;

public class Vehicle {
private String brand;
private int speed;
	
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
void accelerate(int amount) {
	this.speed=this.speed+amount;
	}
	void displayInfo() {
		System.out.println(brand+" "+speed+"km/h");
	}
}
class Car extends Vehicle{
	
	int fuelLevel;
	void refuel(int fuel) {
		this.fuelLevel=this.fuelLevel+fuel;
	}
	
	void displayInfo() 
	{
		super.displayInfo();
		System.out.println(": "+fuelLevel);
	}
}


