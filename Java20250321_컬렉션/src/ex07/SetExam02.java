package ex07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lombok.AllArgsConstructor;

class Num{
	private int num;
	public Num(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return num + "";
	}
	@Override
	public int hashCode() {
		
		return num;
	}
	@Override
	public boolean equals(Object obj) {
		Num num1 = (Num)obj;
		return this.num==num1.num;
	}
	
	
}

public class SetExam02 {

	public static void main(String[] args) {
		
        Set<Num> set = new HashSet<Num>();
        
        set.add(new Num(1234));
        set.add(new Num(1357));
        set.add(new Num(1395));
        set.add(new Num(1234));
        set.add(new Num(1357));
        
        for(Num n : set)
        	System.out.println(n);
	}

}
