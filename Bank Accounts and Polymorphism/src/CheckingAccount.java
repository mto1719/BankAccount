/**
 * 
 * @author Matthew To
 *
 */
public abstract class CheckingAccount extends BankAccount
{
	final double OVER_DRAFT_FEE;
	final double TRANSACTION_FEE;
	final double FREE_TRANS;
	//fields
	private int numTransactions;
	//constructors
	public CheckingAccount(String n, double b, double odf, double tf, int freeTrans)
	{
		name = n;
		balance = b;
		OVER_DRAFT_FEE = odf;
		FREE_TRANS = freeTrans;
		TRANSACTION_FEE = tf;
	}
	public CheckingAccount(String n, double odf, double tf, int freeTrans)
	{
		name = n;
		balance = 0;
		OVER_DRAFT_FEE = odf;
		FREE_TRANS = freeTrans;
		TRANSACTION_FEE = tf;
	}
	//methods
	public void deposit(double amt)
	{
		if(amt < 1)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			numTransactions++;
			balance -= TRANSACTION_FEE;
			balance += amt;
		}
	}
	public void withdraw(double amt)
	{
		if(balance<=0)
		{
			throw new IllegalArgumentException();
		}
		else if(amt>balance)
		{
			balance -= OVER_DRAFT_FEE;
		}
		else
		{
			balance -= amt;
		}
	}
	public void transfer(BankAccount other, double amt)
	{
		if(GetName().equals(other.GetName()))
		{
			if(balance>0) 
			{
			GetName().withdraw(amt);
			other.deposit(amt);
			other.withdraw(TRANSACTION_FEE);
			}
			else
			{
			throw IllegalArgumentException;
			}
		}
	}
}
