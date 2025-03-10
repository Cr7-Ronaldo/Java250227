package ch02.ex01;

public class Person {

	/*
	 * 멤버변수 -> 값 저장,읽기
	 * 1.생성자
	 * 2.setter
	 * 3.getter
	 */
	private String name;
	private int age;
	private String phone;
	//생성자
	public Person() {
		
	}
	//생성자
	public Person(String n) {
		System.out.println("Person(String n)");
		name = n;
	}
	//생성자
	public Person(String n,int a,String p) {
		name = n;
		age = a;
		phone = p;
		System.out.println(name +" "+ phone);
	}
	void setName(String n) {
		name = n;
	}
	void setAge(int a) {
		age = a;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	void sleep() {
		System.out.println(name+" 자다!");
	}
	private	void run() {
			System.out.println(name+" 달리다!");
		}			
			void eat() {
				run();
				System.out.println(name+" 먹다!");
		}
	
	
}
