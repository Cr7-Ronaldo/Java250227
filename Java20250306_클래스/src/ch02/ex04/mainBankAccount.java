package ch02.ex04;

public class mainBankAccount {

	public static void main(String[] args) {
		BankAccount dog = new BankAccount("도지",50000);
		System.out.println(dog.getBalance());
		
        dog.withdraw(60000);
        
        System.out.println(dog.getBalance());
        
        dog.deposit(20000);
        
        System.out.println(dog.getBalance());
        
        dog.withdraw(50000);
        
        System.out.println(dog.getBalance());
	}

}
