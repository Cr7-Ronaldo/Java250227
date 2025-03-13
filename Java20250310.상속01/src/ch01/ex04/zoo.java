package ch01.ex04;

class Animal {
private String name;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
void makeSound() {
	System.out.println("동물이 소리를 냅니다");
}
}
class Dog extends Animal{
	void makeSound() {
		super.makeSound();
		System.out.println("강아지가 멍멍 소리를 냅니다");
	}
}
class Cat extends Animal{
	void makeSound() {
		super.makeSound();
		System.out.println("고양이가 야옹 소리를 냅니다");
	}
}
public class zoo{
	public static void main(String[] args) {
	Dog dog = new Dog();
	Cat cat = new Cat();
	dog.makeSound();
	cat.makeSound();
	
}
}