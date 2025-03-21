package ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lombok.AllArgsConstructor;


class Member{
	private String name;
	private int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("-----------hashCode------------");
		
		return name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("-----------equals--------------");
		Member m = (Member)obj;
		return this.name==(m.name)&&this.age==m.age;
	}
	
	
	
}


public class SetExam01 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));

        for(Member m : set)
        	System.out.println(m);
        
        
        
	}

}
