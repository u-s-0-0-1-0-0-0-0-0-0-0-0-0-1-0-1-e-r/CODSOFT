package atm;

public class Account implements AtmInterface{
	
	public int balance=1000;
	@Override
	public int withdraw(int amount) {
		
		return balance=balance-amount;
	}

	@Override
	public int deposit(int amount) {
		
		 return balance=balance+amount;
		
	}

	@Override
	public int checkbalance(int x) {
		
		return x;
	}

}


//AtmMachine atm2=new AtmMachine();
