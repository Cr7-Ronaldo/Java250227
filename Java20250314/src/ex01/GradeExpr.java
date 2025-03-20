package ex01;

public class GradeExpr {
	
	GradeExpr() {}

    private int[] jumsu;
    private int sum;
	public GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;
	}
	int getTotal() {
		sum=0;
		for(int i=0;i<jumsu.length;i++) {
			sum +=jumsu[i];
		}return sum;
	}
	double getAverage() {
		return (double)sum/jumsu.length;
	}
	int getGoodScore() {
		int max=jumsu[0];
		for(int i=0;i<jumsu.length;i++) {
			if(max<jumsu[i]) max= jumsu[i];
		}return max;
		}
     int getBadScore() {
			int min=jumsu[0];
			for(int i=0;i<jumsu.length;i++) {
				if(min>jumsu[i]) min= jumsu[i];
			}return min;
			}
				
		
	}

