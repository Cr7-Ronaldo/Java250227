package ex02;

public class Friend extends Person{

	String phoneNum;
	String email;
	String name;
Friend(String name,String phoneNum,String email){
	super(name);
	this.name=name;
	this.phoneNum=phoneNum;
	this.email =email;
}
@Override
public String getInfo(){
	return super.getInfo()+phoneNum+" "+name+email;
}
}
