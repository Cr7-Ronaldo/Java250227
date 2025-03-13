package ex02;

public class UniversityStudent extends Student{
	
	   private String major;//전공
	  
	   UniversityStudent(){}
	  
	   UniversityStudent(String name,int age,String schoolName,int grade,String major){
		   super(name,age,schoolName,grade);
		   this.major = major;
	   }
	   
	   void registerCourse(){System.out.println("registerCourse().....");}//수강 신청
	   @Override
	 
	   void introduce() {
		   System.out.println("안녕하세요. 저는 "+ major+"을 전공하고 있는 "+getName()+"입니다.");
	   }

	@Override
	public String toString() {
		return "UniversityStudent [major=" + major + "]";
	}
	   
}
