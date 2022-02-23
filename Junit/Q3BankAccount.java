
package junit;
class InsufficientFundException extends Exception{
	public InsufficientFundException(String message)
	{
		super(message);
	}
}
public class Q3BankAccount {
	int bal=2000;
void withdraw(int amt) throws InsufficientFundException{
	if(bal<amt)
	{ 
		throw new InsufficientFundException("Enter valid amount");
	}
}
}