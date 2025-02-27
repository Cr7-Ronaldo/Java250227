package ch01.ex10;

public class OperationExample {
	public static void main(String[] args) {
		
	int a = 1;
	a += 1;
		
	System.out.println(a);
		
		a++;
		++a;
		System.out.println(a);
		
		a *= 3;
		System.out.println(a);
		
		a -= 10;
		System.out.println(a);
		
		a -= 1;
		System.out.println(a);
		while(true) {
			a *= 2;
			System.out.println(a);
			
			if(a > 1000000000) {;
			break;
			}
		}
		while(true) {
				a /= 2;
				System.out.println(a);
				
				if(a == 1 ) {;
				break;
				}
		
		
		
	}}}
