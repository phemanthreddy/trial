package Question3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankAccountController {
	@Autowired
	private BankAccountServiceImpl bankAccountServiceImpl;

	public BankAccountController(BankAccountServiceImpl bankAccountServiceImpl) {
		this.bankAccountServiceImpl = bankAccountServiceImpl;
	}

	public double withdraw(int accountId, double balance) {
		return bankAccountServiceImpl.withdraw(accountId, balance);
	}

	public double deposit(int accountId, double balance) {
		return bankAccountServiceImpl.deposit(accountId, balance);
	}

	public double getBalance(int accountId) {
		return bankAccountServiceImpl.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return bankAccountServiceImpl.fundTransfer(fromAccount, toAccount, toAccount);
	}
}