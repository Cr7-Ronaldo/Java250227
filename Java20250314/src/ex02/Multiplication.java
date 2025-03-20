package ex02;

public class Multiplication {
private int dan;
private int number;
public Multiplication() {}
Multiplication(int dan){
	this.dan=dan;
}
Multiplication(int dan,int number){
	this.dan=dan;
	this.number=number;
}
void printPart() {
	if(number==0) {
		for(int i=1;i<=9;i++)
System.out.print(dan+"*"+i+"="+dan*i+"  ");
	System.out.println();
	}else {
		System.out.print(dan*number);
	}
}
}
