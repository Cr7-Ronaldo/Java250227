package ex05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetExam01 {

	public static void main(String[] args) {
		Set<String> list = new HashSet<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		list.add("Robot");
		
	
        for(String str : list) {
        	System.out.println(str);
        }
        System.out.println();
		System.out.println("----------------------------");
		
        Iterator<String> itr=list.iterator();
        
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
     
        
        
	}

}
