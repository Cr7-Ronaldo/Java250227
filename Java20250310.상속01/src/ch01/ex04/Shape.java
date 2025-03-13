package ch01.ex04;

abstract public class Shape {
 
	abstract double calculateArea();
	Shape(){}
	public void info() {
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(2,4);
		double c=circle.calculateArea();
		double b=rectangle.calculateArea();
		
		System.out.printf("원의 면적은:%.2f\n사각형의 면적은:%.2f",c,b);
	}
	
}
class Circle extends Shape{
	private double r;
	Circle(){};
	public Circle(double r) {
		this.r = r;
	}
		double calculateArea() {
			return Math.PI*r*r;
		}
		
	
}
class  Rectangle extends Shape{
	private double a,b;
	public Rectangle(double a,double b) {
		this.a=a;
		this.b=b;		
	}
	double calculateArea() {
		return a*b;
	}	
}
