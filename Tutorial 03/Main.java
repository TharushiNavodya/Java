import java.util.Scanner;

abstract class Account
{
	String accountNo;
	String name;
	double balance;
	
	public Account(String accountNo,String name,double balance)
	{
		this.accountNo= accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void Deposit(double amount)
	{
		this.balance = this.balance + amount;
	}
	
	abstract public double calculateInterest();

	abstract public void display();
}

class FixedDepositAccount extends Account
{
	private double interestRate;
	private double interest;
	
	public void setinterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	
	public double getinterestRate()
	{
		return this.interestRate;
	}
	
	public FixedDepositAccount(String accountNo,String name,double balance)
	{
		super(accountNo,name,balance);
	}
	public double calculateInterest()
	{
		interest = balance * interestRate/100;
		return interest ;
	}
	
	public void display()
	{
		System.out.println("= Account Details =");
		System.out.println("Account No :"+this.accountNo);
		System.out.println("Name    :"+this.name);
		System.out.println("Balance   :"+this.calculateInterest());
	}
	public void withdraw(double amount)
	{
		this.balance = this.balance + amount;
	}
}

class SavingsAccount extends FixedDepositAccount
{

	public SavingsAccount(String accountNo, String name, double balance) 
	{
		super(accountNo, name, balance);
	}
}

public class Main {

	public static void main(String[] args) {
		

	}

}
