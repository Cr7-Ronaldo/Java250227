package ex02;

public class GradeExpr {
     int[] jumsu;
     GradeExpr(int jumsu[]){
    	this.jumsu=jumsu;
     }
     int sum=0;
     GradeExpr(){}
     int getTotal() {
    	 
    	 for(int i=0;i<jumsu.length;i++) {
    		sum+=jumsu[i]; 
    	 }System.out.printf("총점 : %d 입니다\n",sum);
    	 return sum;}
   
     
     double getAverage() {
    System.out.printf("평균 : %.2f 입니다\n",(double)sum/jumsu.length);
    return (double)sum/jumsu.length;
    }
     
    int getGoodScore() {
    	int max=jumsu[0];
    	for(int i=0;i<jumsu.length;i++) {
    		if(max<jumsu[i])max=jumsu[i];
    	}
    	System.out.printf("최고 : %d입니다\n",max);
    	return max;
    }
    int getBadScore() {
    	int min=jumsu[0];
    	for(int i=0;i<jumsu.length;i++) {
    		if(min>jumsu[i])min=jumsu[i];
    	}
    	System.out.printf("최저 : %d입니다\n",min);
    	return min;
    }    
     
}
