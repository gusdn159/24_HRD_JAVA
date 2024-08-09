package day04;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;
import day04.Account;


	public class BankApplication {
		static Account ac1=new Account();
		ArrayList<Account> arraylist = new ArrayList<Account>();
		BankApplication bank=new BankApplication();
	
		
		
		public void showMenu() {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성2|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>");	
	}
		public  void inputNum() {
			Scanner sc=new Scanner(System.in);
			ac1=new Account();
			
			out.println("계좌생성");
			out.println("계좌번호 입력=>");
			String t=sc.next();
			ac1.acNum=t;		
			out.println("계좌주 입력=>");
			String nm=sc.next();
			ac1.acOwner=nm;
			out.println("초기입금액 입력=>");
			int a=sc.nextInt();
			ac1.firstMoney=a;
			arraylist.add(ac1);			
}
			void showInfo() {
				for(Account p: arraylist) {
					p.Acshow2();
				}
			}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	BankApplication bank=new BankApplication();
	
	while(true) {
		bank.showMenu();
		int no=sc.nextInt();
		if(no==5) {
			System.out.println("종료합니다");
			System.exit(0);
		}else if(no==1) {
			bank.inputNum();
		//}else if(no==2 ) {
			//bank.inputPerson2();
		}else if(no==3) {
			bank.showInfo();
		//}else if(no==4) {
			//bank.showInfo2();
		}
	}
}
}