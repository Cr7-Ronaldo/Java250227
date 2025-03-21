package ex08;

import java.util.Set;
import java.util.TreeSet;

public class SetExam02 {

	public static void main(String[] args) {
		Set<Integer> iset = new TreeSet<>();
		iset.add(40);
		iset.add(20);
		iset.add(50);
		iset.add(100);
		iset.add(60);
		iset.add(30);
		iset.add(70);
		iset.add(80);
		iset.add(90);
		iset.add(10);
		System.out.println(iset);
	}

}
