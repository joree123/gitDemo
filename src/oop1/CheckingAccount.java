package oop1;

public class CheckingAccount extends BankAccount implements Interest {

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("interest in checking account is x");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit in Checking account is x");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw in Checking account is x");
	}

}
