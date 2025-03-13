package ch01.ex02;


	class GrandParent{
		
		
		GrandParent(){}
		private String 할아버지이름;
		int 아버지나이;
		 String 나의취미;
		
	    GrandParent(String name){
	    	this.할아버지이름=name;
	    }
	    String get할아버지이름() {
	    	return 할아버지이름;
	    }
	}
	class Parent extends GrandParent{
		
		Parent(){}
		Parent(String 할아버지이름,int 아버지나이){
		super(할아버지이름);
		this.아버지나이=아버지나이;
	}
	
	}
	class Child extends Parent{		
	   
		Child(){}
		
		Child(String 할아버지이름,int 아버지나이, String like) {
			super(할아버지이름,아버지나이);
			this.나의취미=like;
		}
		
	
	}
	public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child child = new Child("김철수",50,"야구");
    System.out.print("할아버지이름 : "+child.get할아버지이름()+"\n"+"아버지나이 : "+child.아버지나이+"\n"+"나의 취미 : "+child.나의취미);
    
	}
	}

