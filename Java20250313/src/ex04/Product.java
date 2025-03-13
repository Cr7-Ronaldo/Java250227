package ex04;

import java.text.DecimalFormat;

public class Product {
	String name ;
	int balance ;
	int price ;
	
	public String toString() {
		DecimalFormat fmr = new DecimalFormat("#,###");
		return name+ " "+balance+"개 "+fmr.format(price)+"원";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	Product(){
		name =  "듀크인형";
		balance = 5;
		price = 10000;
	}
	Product(String name, int balance, int price){
	this.name=name;
	this.balance=balance;
	this.price=price;		
     }
	
	
	
}