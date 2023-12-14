package oop1;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckingAccount cd=new CheckingAccount();
		cd.deposit();
		cd.withdraw();
		cd.calculateInterest();
SavingAccount sd=new SavingAccount();
sd.deposit();
sd.calculateInterest();
sd.withdraw();

	}
	
}

