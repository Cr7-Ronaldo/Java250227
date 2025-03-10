package ch01.ex03;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
	Person dog=new Person("도지",2000,"010-7777-7777");

    dog.나이출력();
    dog.이름출력();
    dog.전화번호출력();
    System.out.println("----------------------");

    Person dog2=new Person("시바",8,"010-8888-8888");
    dog2.나이출력();
    dog2.이름출력();
    dog2.전화번호출력();
    System.out.println("----------------------");
    
    
	}

}
