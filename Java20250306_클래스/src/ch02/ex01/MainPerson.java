package ch02.ex01;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("도지");
//		p1.name="도지";
		
//		p1.run();//외부에서 접근 불가
		p1.eat();
		
		Person p2 = new Person("시바",20,"010-7777-7777");
		p2.eat();
		p2.sleep();
		
		Person p3 = new Person();
		p2.setName("페페");
		p2.setAge(100);
		p2.eat();
		
		String name = p2.getName();
		int age = p2.getAge();
		System.out.println(name+" "+age);
		System.out.println(p2.getName()+" "+p2.getAge());
		
		

	}
}
