package ex04;

import java.beans.IndexedPropertyDescriptor;

public class ProductMain {

	public static void main(String[] args) {
		Product[] p = new Product[5];
		p[0]=new Product();
		p[1]=new Product("연필",5,1000);
		p[2]=new Product("빨대",10,100);
		p[3]=new Product("노트",8,500);
		p[4]=new Product("사전",3,5500);
		
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
			if(p[i].price>=1000) {
				System.out.printf("%s %d개 %d,%03d원%n", p[i].name, p[i].balance, p[i].price / 1000, p[i].price % 1000);
                   			
	    	}else System.out.println(p[i].name+" "+p[i].balance+"개 "+p[i].price+"원");
		}

	}

}
