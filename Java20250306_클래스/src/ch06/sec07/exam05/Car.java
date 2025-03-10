package ch06.sec07.exam05;

public class Car {
/*
 * 1.brand,model,year을 필드로 가짐.
 * 2.생성자를 통해 brand,model,year를 설정할 수 있음
 * 3.startEngine()메서드를 구현하여"[brand][model]의 엔진이 시작되었습니다!"를 출력
 * 4.displayinfo()메서드를 구현하여"자동차 정보:[year]년식[brand][model]"을 출력하도록 함
 * 5.main메서드에서Car객체를 생성하고 startEngine()과displayinfo()를 호출하여 실행 결과를 확인할 것.
 */
	private String brand,model;
    private int year;
  Car(){}
  Car(String brand,String model,int year){
	  this.brand=brand;
	  this.model=model;
	  this.year=year;
  }
  
  
   void setBrand(String brand){
	this.brand=brand;
}
   void setModel(String model) {
	this.model=model;
}
   void setYear(int year) {
	this.year=year;
}
   void startEngine(){
	System.out.printf("[%s][%s]의 엔진이 시작되었습니다!\n",brand,model);
}
   void displayinfo() {
	   System.out.printf("자동차 정보:[%d]년식[%s][%s]\n",year,brand,model);
   }





}
