package ch01.ex04;
/*
 * 사람 클래스
 * 사람 특징 - name,age,...
 * 사람 동작 - run,sleep,eat,study,work...
 * 간추려 내는 과정을 추상화...
 */
public class Person {

	private String name;
	private int age;
	Person(){
		this("남산",1);
//		name = "남산";
//		age = 1;
	}
	public Person(String name) {
		this(name, 1);
//		this.name = name;
//	    age = 1;
	}
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("뷁");
	}
	String displayInfo() {
		return name + " : "+age;
	}
	void run() {
		System.out.println("run----------");
	}
	void eat() {
		System.out.println("eat----------");
	}
	
	
}
