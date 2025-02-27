package ch01.ex03;

public class IncraseExample {

	public static void main(String[] args) {
		//증감연산자 ++ 
		//감소연산자 --
		
		int a = 0;
		System.out.println(a);
		
		a = a+1;
		System.out.println(a);
		
		a = a+1;
		System.out.println(a);
		
		int b = 0;
		System.out.println();
		System.out.println(b);
		++b; //b = b+1,  전위
		System.out.println(b);
		b++; //b = b+1,  후위
		System.out.println(b);
		//전위와 후위의 차이는 동작하는 방식에 있다. 
	
	}

}
