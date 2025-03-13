package ex03;

public class TvMain {

	public static void main(String[] args) {
		Tv tv = new LgTv();
        tv.powerOff();
        tv.powerOn();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeDown();
        System.out.println(tv.volume);
	}

}
