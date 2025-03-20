package ex02;

public class GuGuDanExpr extends Multiplication{
GuGuDanExpr() {}
GuGuDanExpr(int dan){super(dan);};
GuGuDanExpr(int dan,int number){super(dan,number);};
public static void printAll() {
	Multiplication[] gugu = new Multiplication[9];
	for(int i=1;i<=gugu.length;i++) {
		gugu[i-1]=new Multiplication(i,0);
		gugu[i-1].printPart();
	}
	
	
}
}
