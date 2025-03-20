package mobile;

public class Ltab extends Mobile{
public Ltab() {}
public Ltab(String mobileName,int batterySize,String osType){
	super(mobileName,batterySize,osType);
}
@Override
public void operate(int time) {
	this.setBatterySize(getBatterySize()-time*10);
	
}
public void charge(int time) {
	this.setBatterySize(getBatterySize()+time*10);
	
}
}
