package ch01.ex04;

public class MainPerson {
	public static void main(String[] args) {
	
     Person p1 = new Person("설악산",50);
     Person p2 = new Person("지리산",30);
     
     String result = p1.displayInfo();
     String result2 = p2.displayInfo();
     
     System.out.println(result);
     System.out.println(result2);
     
     Person p3 = new Person();
     System.out.println(p3.displayInfo());
     System.out.println();
     
     Person p4 = new Person("치악산");
     p4.setName("백두산");
     System.out.println(p4.displayInfo()+p4.getName()+p4.getAge());
}
}