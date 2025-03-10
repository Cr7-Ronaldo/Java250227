package ch06.sec07.exam06;

public class Car {
   private String company="현대자동차";
   private String model;
   private String color;
   private int maxSpeed;
   
   void setCompany(String company) {
	   this.company=company;
   }
   

public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getMaxSpeed() {
	return maxSpeed;
}
public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}
public String getCompany() {
	return company;
}
Car(){
	   this("k8","검정",400,"기아");
   }
   Car(String model){
	   this(model,"빨강",400,"현대");
   }
   Car(String model,String color){
	   this(model,color,323,"현대");
   }
   Car(String model,String color,int maxSpeed){
	   this(model,color,maxSpeed,"현대");
   }
   Car(String model,String color,int maxSpeed,String company){
	   this.company=company;
	   this.model = model;
	   this.color = color;
	   this.maxSpeed = maxSpeed;
   }
   void info(){
	   System.out.printf("브랜드:%s 모델:%s 색상:%s 최고속도:%dkm/h\n",company,model,color,maxSpeed);
   }
   
   
   
   
}
