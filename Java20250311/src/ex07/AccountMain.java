package ex07;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Account acc = Account.getInstance();
       
      acc.setBalance(10000);
      System.out.println(acc.getBalance());
      System.out.println(acc);
      
      Account acc2 = Account.getInstance();
      System.out.println(acc2);
      System.out.println(acc2.getBalance());
	
      
      
	
	
	
	
	}

}