package mobile;

public class MobileTest {

	public static void main(String[] args) {
		Mobile l1=new Ltab("Ltab",500,"ABC-01");
		Mobile o1=new Otab("Otab",1000,"XTZ-20");
        printTitle();		
        printMobile(l1);
        printMobile(o1);
      System.out.println("\n[10분 충전]");
       printTitle();
        l1.charge(10);
        o1.charge(10);
        printMobile(l1);
        printMobile(o1);
        System.out.println("\n[5분 통화]");
        printTitle();
        l1.operate(5);
        o1.operate(5);
        printMobile(l1);
        printMobile(o1);
        
	}
public static void printMobile(Mobile mobile) {
	
	System.out.println(mobile.getMobileName()+"\t\t"+mobile.getBatterySize()+"\t\t"+mobile.getOsType());
}
public static void printTitle() {
	System.out.println("Moblie\t\tBattery\t\tOS");
	System.out.println("---------------------------------------");
}

}
