package ex02;

public class Person {
  private String name;
  Person(){}
  Person(String name){
	  this.name=name;
  }
  public String getInfo() {
	  return name+" ";
  }
}
