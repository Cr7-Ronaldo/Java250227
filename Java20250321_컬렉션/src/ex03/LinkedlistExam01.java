package ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistExam01 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
        System.out.println();
        
        for(String str : list) {
        	System.out.println(str);
        }
        System.out.println();
		
        list.remove(0);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println();
        
        list.clear();
        
        
        
	}

}
