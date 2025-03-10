package ch02.ex02;

public class MainStudent {
  public static void main(String[] args) {
	  //1,Student 객체생성하면서 이름,학년,나이 입력
	  //2.printInfo 메소드 호출
	  //3.이름을 변경
	  //4.변경된 이름 출력
	  //5.학년 5로 변경
	  //6.변경된 학년만 출력
	  Student dog=new Student("도지",3,10);
	  dog.printInfo();
	  dog.setName("페페");
	  System.out.println("이름: "+dog.getName());
	  dog.setGrade(5);
	  System.out.println("학년: "+dog.getGrade());
	  
	  
	   
  }
	
	
}
