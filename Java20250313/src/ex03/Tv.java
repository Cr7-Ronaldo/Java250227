package ex03;



/*
 * 클래스 내부에 추상클래스가 1개 이상
 * 존재하면 그 클래스는 추상 클래스이다.
 */
public abstract class Tv {
       boolean power;
       int volume;
         
       Tv(){
        	 power=false;
        	 volume=0;
       }
       abstract void powerOn(); 
   	   
   	   
       abstract void powerOff(); 
   	      
   	      	   
       abstract void volumeUp();
   	    
   	   
       abstract void volumeDown();
   	   
       void test() {
    	   
       }
   	   
}
