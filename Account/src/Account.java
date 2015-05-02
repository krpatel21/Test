//Kaushal Patel
//CS 207
import java.util.Date;

public class Account 
{	
	//this is a test
	//data members
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	//methods
	public Account()
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	public Account(int id, double balance)
	{
		this.id=id;
		this.balance=balance;
	}
	//set methods
	public void setId(int id)
	{
		this.id=id;	
	}
	public void setBalance(double balance)
	{
		this.balance=balance;	
	}
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate/100;	
	}
	public Date getDateCreated()
	{
		return dateCreated;
	}
	//get methods
	public int getId()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public double getMonthlyInterest()
	{
		return balance*(annualInterestRate/12);
	}
	public double getMonthlyInterestRate()
	{
		return (annualInterestRate/12);
	}
	// withdraw and deposit
	public void withdraw(double w)
	{
		balance = balance - w;
	}
	public void deposit(double d)
	{
		balance = balance + d;
	}
}
