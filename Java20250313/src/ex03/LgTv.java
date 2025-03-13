package ex03;

public class LgTv extends Tv{
     
       LgTv(){}	
	
      void powerOn(){
    	  System.out.println("전원 on");
    	  power = true;
      }
      void powerOff(){
    	  System.out.println("전원 off");
    	  power = false;
      }
      void volumeUp() {
    	  if(power==true) {
    	  volume++;
    	  
    	  if(volume>100) {
    		  volume=100;
    		  System.out.println("max");
    	  }
    	  }
      }
      void volumeDown() {
    	  if(power==true) {
    		  volume--;
    		  if(volume<0) {
    			  volume=0;
    			  System.out.println("음소거");
    		  }
    	  }
      }
      
}
