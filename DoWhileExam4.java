package day02;
import java.util.Scanner;
public class DoWhileExam4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		boolean run = true;
		String messi;
		do {
			messi = scan.next();
			System.out.println(">"+messi);
			
		}while(!messi.equals("q"));
		run=false;
		System.out.println("프로그램 종료");

	}

}
