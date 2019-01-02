/**
 * 
 * @author Matthew To
 *
 */
public abstract class BankAccount 
{
	//myGuy
	static int nextAccNum;
	//fields
	String name;
	int acctNum;
	double balance;
	//constructors
	public BankAccount(String n)
	{
		name = n;
		acctNum = nextAccNum;
		balance = 0;
	}
	public BankAccount(String n, double b)
	{
		name = n;
		acctNum = nextAccNum;
		balance = b;
	}
	public void deposit(double amt)
	{
		balance += amt;
	}
	public void withdraw(double amt)
	{
		balance -= amt;
	}
	public String GetName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}
	public abstract void endOfMonthUpdate();
	public void transfer(BankAccount other, double amt)
	{
		withdraw(amt);
		other.deposit(amt);
	}
	public String toString()
	{
		return acctNum+"\t"+name+"\t"+balance;
	}
}
