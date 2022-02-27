package Question3;
import org.springframework.stereotype.Component;

@Component
public class BankAccountServiceImpl implements BankAccountService {

	BankAccountepositoryImpl bankAccountepositoryImpl = null;

	public BankAccountServiceImpl(BankAccountepositoryImpl bankAccountRepositoryImpl) {
		this.bankAccountepositoryImpl = bankAccountRepositoryImpl;
	}

	public double withdraw(long accountId, double balance) {
		return bankAccountepositoryImpl.updateBalance(accountId, balance, "withdraw");
	}

	public double deposit(long accountId, double balance) {
		return bankAccountepositoryImpl.updateBalance(accountId, balance, "deposit");
	}

	public double getBalance(long accountId) {
		return bankAccountepositoryImpl.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		double account1 = withdraw(fromAccount, amount);
		System.out.println(account1);
		if (account1 != 0) {
			double account2 = deposit(toAccount, amount);
			if (account2 != 0) {
				return true;
			}
			deposit(fromAccount, amount);
		}

		return false;
	}

}