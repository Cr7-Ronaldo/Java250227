package ex02;

public class GuGuDanApp {

	public static void main(String[] args) {
    int dan = (int)(Math.random()*20)+1;
    int number = (int)(Math.random()*20)+1;
    if(dan<10&number<10) {
    	GuGuDanExpr gugu = new GuGuDanExpr(dan,number);
    	System.out.print(dan+" * "+number+" = ");
    	gugu.printPart();
    }
    if(dan<10&number>=10) {
    	
    	GuGuDanExpr gugu= new GuGuDanExpr(dan);
    	System.out.print(dan+"단: ");
    	gugu.printPart();
    	
    }else if(dan>=10) {
    	GuGuDanExpr.printAll();
   
    }
	}
	

}
