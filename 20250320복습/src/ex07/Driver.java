package ex07;

public class Driver {
  public void drive(Vehicle v) {
	  v.run();
	  if(v instanceof Taxi) {
		  Taxi t = (Taxi)v;
		  t.t();
	  }else if(v instanceof Bus) {
		  Bus b = (Bus)v;
		  b.b();
	  }
  }
}
