
public class BankAccount 
{
	private String name;
	private int accNum;
	private double balance;
	
	public BankAccount()
	{
		name = "MatthewTo";
		accNum = 1719;
		balance = 0;
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
