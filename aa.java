package day04;

import static java.lang.System.out;

public class Account {

	String acNum;
	String acOwner;
	int firstMoney;
	int money;
	
	private int balance;
	
	static final int MIN_BALANCE=0;
	static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance<Account.MIN_BALANCE||balance>Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;

}
	void Acshow1() {
		out.println("계좌번호:"+this.acNum);
		out.println("계좌주:"+this.acOwner);
		out.println("초기입금액:"+this.firstMoney);
		out.println("결과:계좌가 생성되었습니다.");
	}
	void Acshow2() {
		out.println("계좌번호:"+this.acNum);
		out.println("예금액:"+this.firstMoney);
	}

}
