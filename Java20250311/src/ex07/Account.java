package ex07;

public class Account {
	private int balance;
	private int MIN_BALANCE=0;
	private int MAX_BALANCE=1000000;
	
	private static Account ac = new Account();
	private Account() {
		
	}
	static Account getInstance() {
		return ac;
	}
    int getBalance() {
    	return balance;
    }
	void setBalance(int balance) {
		if(balance>=MIN_BALANCE&&balance<=MAX_BALANCE)
		this.balance = balance;
		else return;
	}
	
}

