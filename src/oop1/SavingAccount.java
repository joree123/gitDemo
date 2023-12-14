package oop1;

public class SavingAccount extends BankAccount implements Interest {

	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("Interest in Savings account is y");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit in Savings account is y");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Wihtdraw in Savings account is y");
	}

}
