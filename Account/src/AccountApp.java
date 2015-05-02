//Kaushal Patel
//CS 207
public class AccountApp 
{
	public static void main(String[] args)
	{		
		
		///this is a test
		// two argument constructor
		Account account1 = new Account(1122, 20000);
		//set method for interest rate
		account1.setAnnualInterestRate(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);		
		System.out.println("output for account 1");
		System.out.printf("The balance is $%.2f.%n",account1.getBalance());
		System.out.printf("The interest is $%.2f.%n",account1.getMonthlyInterest());
		System.out.println("The date is "+account1.getDateCreated());
		// my own tests
//		Account account2 = new Account(0000, 99999);
//		account2.setAnnualInterestRate(11);
//		account2.withdraw(50000);
//		account2.deposit(90000);
//		System.out.println("\noutput for account 2");
//		System.out.printf("The balance is $%.2f.%n",account2.getBalance());
//		System.out.printf("The interest is $%.2f.%n",account2.getMonthlyInterest());
//		System.out.println("The date is "+account2.getDateCreated());
	}	
}
//sample output
/*output for account 1
The balance is $20500.00.
The interest is $76.88.
The date is Thu Jan 29 13:20:28 CST 2015

output for account 2
The balance is $139999.00.
The interest is $1283.32.
The date is Thu Jan 29 13:20:28 CST 2015
*/