import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Matthew To
 *
 */
public class mainClass 
{
	ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	public static void main(String[] args) 
	{	//constants
		final int OVER_DRAFT_FEE = 15;
		final double RATE = .0025;
		final double TRANSACTION_FEE = 1.5;
		final int MIN_BAL = 300;
		final int MIN_BAL_FEE = 10;
		final int FREE_TRANSACTIONS = 10;
	}
	private static boolean isNumeric(String str) 
	{ 
		try 
		{ 
			Double.parseDouble(str); 
			return true; 
		} 
		catch(IllegalArgumentException e) 
		{ 
			return false; 
		} 
	}
	Scanner in = new Scanner(System.in);
	while(System.in != "terminate the program")
	{
		while(System.in != "add an acccount " || "make a transaction "+"or "+"terminate the program");
		in.next();"terminate the program")
	System.out.println("Would you like to "+"add an acccount "+"make a transaction "+"or "+"terminate the program");
	in.next();
	
	}
}
}
