package ex02;

public class MainPerson {

	public static void main(String[] args) {
		
	Person p1 = new Person();
	Student s1 = new Student();
	UniversityStudent u1 = new UniversityStudent();
	
	
	method(p1);
	method(s1);
    method(u1);	
	
	
		
		
	}
	//p가 참조하고 있는 대상은 Person객체 이거나 Person상속한 객체
	static void method(Person p) {
		//p가 참조하고 있는 객체가 University니?
		if(p instanceof UniversityStudent) {
			System.out.println("-------------");
			p.sleep();
		    ((UniversityStudent) p).study();
		    ((UniversityStudent) p).registerCourse();
		    //p가 참조하고 있는 객체가 Student니?
		}else if(p instanceof Student) {
			System.out.println("-------------");
	       p.sleep();
	       ((Student) p).study();
		}else {
			p.sleep();		
			
		}
	}
	
	
}
