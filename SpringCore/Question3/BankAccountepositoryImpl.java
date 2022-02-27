package Question3;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BankAccountepositoryImpl implements BankAccountRepository {

	List<BankAccount> Account = null;
	// getters and setters

	public List<BankAccount> getAccount() {
		return Account;
	}

	public void setAccount(List<BankAccount> account) {
		Account = account;
	}

	// this method checks the account id and returns the account that matches the
	// account
	public BankAccount CheckAccountID(long accountID) {
		if (Account != null) {
			for (BankAccount ac : Account) {
				if (ac.getAccountId() == accountID) {
					return ac;
				}
			}
		}
		return null;
	}

	public double getBalance(long accountId) {
		BankAccount account = CheckAccountID(accountId);
		if (account != null)
			return account.getAccountBalance();
		return 0;

	}

	public double updateBalance(long accountId, double newBalance, String type) {
		BankAccount update = CheckAccountID(accountId);
		if (update != null) {
			if (type.equals("deposit")) {
				update.setAccountBalance(update.getAccountBalance() + newBalance);
			} else if (type.equals("withdraw")) {
				update.setAccountBalance(update.getAccountBalance() - newBalance);
			}
			return update.getAccountBalance();
		}

		return 0;
	}

}