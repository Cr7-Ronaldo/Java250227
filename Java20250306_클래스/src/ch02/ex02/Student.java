package ch02.ex02;

public class Student {
	
	private String name;
	private int grade;//학년
	private int age;
	
	
	public Student(String n,int g,int a) {
		name = n;
		grade = g;
		age = a;
	}
	public Student() {}
	
	void setName(String n) {
		name = n;
	}
	void setGrade(int g) {
		grade = g;
	}
	void setAge(int a) {
		age = a;
	}
	String getName() {
		return name;
	}
	int getGrade() {
		return grade;
	}
	int getage() {
		return age;
	}
	
	
	
	
	
	void printInfo() {
		System.out.println("이름 : "+name);
		System.out.println("학년 : "+grade);
		System.out.println("나이 : "+age);
	}

}
