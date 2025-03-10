package ch02.ex03;

public class Person {
	/*
	 * 1.name,age를 필드로 가짐
	 * 생성자를 통해 name과 age를 설정할 수 있음
	 * introduce()메서드를 구현하여"안녕하세요,제 이름은 [name]이고 [age]살입니다"라는 문자열 반환
	 * main 메서드에서 Person객체를 생성하고 introduce()를 호출하여 결과를 출력할것
	 */
  private String name;
  private int age;
  
  public Person(String n,int a) {
	  name = n;
	  age = a;
  }
  public Person() {}
  void setName(String n){
	  name = n;
  }
  void setAge(int a){
	  age = a;
  }
  String getName() {
	  return name;
  }
  int getAge() {
	  return age ;
  }
	String introduce() {
		return "안녕하세요,제 이름은 [" + name + "]이고 [" + age + " ]살입니다";
	}
	
	
	
}
