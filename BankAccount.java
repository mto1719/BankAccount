/**
 *
 * @author Matthew To
 *
 */
public class BankAccount 
{
	private String name;
	private int accNum;
	private double balance;public BankAccount(String n, int aN)
	{
		name = n;
		accNum = aN;
		balance = 0
	}
	public BnkAccount(String n, int aN, double ba1)
	{
		name = n;
		accNum = aN;
		balance = ba1
	}
	
	
	public BankAccount(double intBalance)
	{
		balance = intBalance;
		intBalance = 0;
	}
	public BankAccount(int accountHolder)
	{
	  name = accountHolder;
}
    public BankAccount(int accountNumber)
	{
	  accNum = accountNumber;
}
	public void deposit(double depositAmount)
	{
		balance -= depositAmount;
	}
	public void withdraw(double withdrawAmount)
	{
		balance += withdrawAmount;
	}
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		String info = name + accNum + balance;
		return info;
	}
}
