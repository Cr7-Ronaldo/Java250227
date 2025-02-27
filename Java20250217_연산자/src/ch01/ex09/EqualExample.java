package ch01.ex09;

public class EqualExample {
	public static void main(String[] args) {
		
		int num1 = 10;
	    int num2 = 10;
        String str1 = "korea";
		String str2 = "korea";
		int hashCode1 = System.identityHashCode(str1);
		int hashCode2 = System.identityHashCode(str2);
		
		System.out.println(num1 == num2);
		System.out.println(str1 == str2);
		System.out.println(hashCode1);
		System.out.println(hashCode2);
		
		
		String str3 = new String("korea");
		String str4 = new String("korea");
		int hashCode3 = System.identityHashCode(str3);
		int hashCode4 = System.identityHashCode(str4);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3 == str4);
		System.out.println(hashCode3);
		System.out.println(hashCode4);
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str4));//객체를 비교할때는 == 말고 equals()를 쓴다.
		
		System.out.println(5>2 || 3>1);
		System.out.println(5>2 || (3<1));
		System.out.println(5<2 || 3>1);
		System.out.println(5<2 || 3<1);
		System.out.println(!(5<2));
		
		
		
	}
}
