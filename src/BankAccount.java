/**
 *
 * @author Matthew To
 *
 */
public class BankAccount 
{
	private String name;
	private int accNum;
	private double balance;
	
	public BankAccount(String n, int aN)
	{
		name = n;
		accNum = aN;
		balance = 0;
	}
	
	public BankAccount(String n, int aN, double ba1)
	{
		name = n;
		accNum = aN;
		balance = ba1;
	}
	
	public void withdraw(double amt)
	{
		balance -= amt;
	}
	
	public void deposit(double amt)
	{
		balance += amt;
	}
	
	public BankAccount(double intBalance)
	{
		balance = intBalance;
		intBalance = 0;
	}
	
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		String info = "name: "+ name\n"accNum: "+ accNum\n"balance: "+balance;
		return info;
	}
}
