package day06;

class Account {
	private int balance;
	public int getBalance() {
		return balance;
	}
	public void deposotont (int money) {
		balance += money;
	}
	
	public void withdraw (int money) throws InsufficientException {
		if(balance<money) {
			throw new InsufficientException("잔고 부족:" + (money-balance) + "모자람");
		}
		balance -= money;
	}
}
public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.deposotont(10000);
		System.out.println("예금액:" + account.getBalance());
		
		//출금하기
		try {
			account.withdraw(30000);
		}catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}

	}

}
