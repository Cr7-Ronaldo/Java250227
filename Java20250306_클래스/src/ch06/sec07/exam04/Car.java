package ch06.sec07.exam04;

public class Car {
   private String company="현대자동차";
   private String model;
   private String color;
   private int maxSpeed;
   
   Car(){}
   
   void setModel(String model) {
	   this.model=model;
   }
   void setColor(String color) {
	   this.color=color;
   }
   void setMaxspeed(int maxSpeed) {
	   this.maxSpeed=maxSpeed;
   }
   String getCompany() {
	   return company;
   }
   String getModel() {
	   return model;
   }
   String getColor() {
	   return color;
   }
   int getMaxSpeed() {
	   return maxSpeed;
   }
   Car(String model){
	   this.model = model;
   }
   Car(String model,String color){
	   this.model = model;
	   this.color = color;
   }
   Car(String model,String color,int maxSpeed){
	   this.model = model;
	   this.color = color;
	   this.maxSpeed = maxSpeed;
   }
   
   
   
   
   
   
}
