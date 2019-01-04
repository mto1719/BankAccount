/**
 * 
 * @author Matthew To
 *
 */
public class SavingsAccount extends BankAccount
{
	//fields
	private double intRate;
	final double MIN_BAL; 
	final double MIN_BAL_FEE;
	//constructors
	public SavingsAccount(String n, double b, double r, double mb, double mbf)
	{
		name=n;
		balance=b;
		intRate=r;
		MIN_BAL_FEE=mbf;
	}
	public SavingsAccount(String n, double r, double mb, double mbf)
	{
		name=n;
		balance=0;
		intRate=r;
		MIN_BAL=mb;
		MIN_BAL_FEE=mbf;
	}
	public void withdraw(double amt)
	{
		if(balance==MIN_BAL)
		{
			balance-=MIN_BAL_FEE;
		}
		if(balance<0)
		{
			throw IllegalArgumentException;
		}
	}
	public void transfer(BankAccount other, double amt)
	{
		
	}
	public static void addInterest()
	{
		double interest = 0;
		interest=balance*intRate;
		balance+=interest;
	}
	public endOfMonthUpdate
	{
		SavingsAccount.addInterest();
	}
}
