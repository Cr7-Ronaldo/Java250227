package ex01;

public class SalaryExpr {
	int bonus;
    int grade;
	SalaryExpr(){
		bonus = 0;
		
	}
	SalaryExpr(int bonus){
		this.bonus=bonus;
	}
	 int getSalary(int grade) {
	     int a=0;
		 if(grade==1) {
	    	a = bonus+100;
	    }
	    if(grade==2) {
	    	a = bonus+90;
	    }
	    if(grade==3) {
	    	a = bonus+80;
	    }
	    if(grade==4) {
	    	a = bonus+70;
	    }
	    return a;
	}
	 int getSalary() {
		 int a=0;
		 if(grade==1) {
	    	a = bonus+100;
	    }
	    if(grade==2) {
	    	a = bonus+90;
	    }
	    if(grade==3) {
	    	a = bonus+80;
	    }
	    if(grade==4) {
	    	a = bonus+70;
	    }
	    return a;
	 }
}
