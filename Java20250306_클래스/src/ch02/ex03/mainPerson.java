package ch02.ex03;

public class mainPerson {

	public static void main(String[] args) {
		Person dog = new Person("도지",10);
		System.out.println(dog.introduce());
		dog.setName("페페");
		dog.setAge(20);
	   System.out.println(dog.introduce());

	   /*
	    * 1.
	    */
	}

}
