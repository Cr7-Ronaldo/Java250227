package ex03;

public class SamsungTv extends Tv {
	   
	   void powerOn() {
	      this.power = true;
	      System.out.println("전원이 켜졌습니다.");
	   }
	   void powerOff() {
	      this.power = false;
	      System.out.println("전원이 꺼졌습니다.");
	   }
	   
	   void volumeUp() {
	      this.volume++;
	   }
	   void volumeDown() {
	      this.volume--;
	   }
	}