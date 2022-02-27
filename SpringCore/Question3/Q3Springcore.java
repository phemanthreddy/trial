package Question3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q3Springcore {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Question3.xml");
		BankAccountController B1 = (BankAccountController) context.getBean("BankAccountController");
		BankAccountServiceImpl B2 = (BankAccountServiceImpl) context.getBean("BankAccountServiceImpl");
		System.out.println(B1.getBalance(123456));
		System.out.println(B1.deposit(123456, 900));
		System.out.println(B1.withdraw(123456, 1000));
		System.out.println("to account balance " + B1.getBalance(456789));
		System.out.println(B1.fundTransfer(123456, 456789, 15000));
		System.out.println("from account balance " + B1.getBalance(123456));
		System.out.println("to account balance " + B1.getBalance(456789));

		System.out.println(B2.fundTransfer(123456, 456789, 15000));

	}

}