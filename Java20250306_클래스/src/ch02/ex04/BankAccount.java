package ch02.ex04;


public class BankAccount {
private String owner;
private double balance;

 public BankAccount() {}
 public BankAccount(String owner, double balance) {
	this.owner = owner;
	this.balance = balance;
 }
	
 
  double getBalance() {
	  return balance;
  }
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("잔액부족");
		}else
		balance -= amount;		
	}
	
}
/*
 * 수정 요구사항
 * 1.withdraw()메서드를 개선하여 잔액보다 많은 금액을 출금할 경우"잔액부족"출력하고 출금을 방지
 * 2.getBalance()메서드를 추가하여 현재 잔액을 반환
 * 3.main메서드에서 BankAccount객체를 생성하고 입금,출금을 테스트할것.
 */ 
