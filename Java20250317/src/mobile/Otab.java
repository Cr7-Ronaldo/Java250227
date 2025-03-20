package mobile;

public class Otab extends Mobile{
public Otab() {}
public Otab(String moblieName,int batterySize,String osType) {
       super(moblieName,batterySize,osType);
}
@Override
public void operate(int time) {
	this.setBatterySize(getBatterySize()-time*12);
	
}
@Override
public void charge(int time) {
	this.setBatterySize(getBatterySize()+time*8);
	
}
}