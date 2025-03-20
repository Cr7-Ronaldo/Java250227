package ex02;

class Student{
	private int no;
	private String name;
	
	public Student(int no,String name) {
		this.no=no;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		Student s= (Student)obj;
		return this.no==s.no&&this.name==s.name;
	}
	public int hashCode() {
		System.out.println("---------------");
		int result = name != null?name.hashCode():0;
		//자바에서는 객체 해시를 생성할때 필드들의 해시를 혼합할 목적으로 주로 31 소수값을 곱해줌
		result = 31*result+no;
		return result;
}
}



public class StudentTest {

	public static void main(String[] args) {
		
		Student student1=new Student(1,"홍길동");
		Student student2=new Student(1,"홍길동");
		
       System.out.println(student1.equals(student2));
	}

}
