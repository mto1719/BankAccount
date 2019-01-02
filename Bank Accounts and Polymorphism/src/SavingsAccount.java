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
	
}
