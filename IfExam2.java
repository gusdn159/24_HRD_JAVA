package day02;
import java.util.Scanner;
public class IfExam2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("##메뉴 선택##");
		
		int a =0;
		System.out.println("[1]구매자 [2]판매자");
		a = scan.nextInt();
		
		String b ="";
		
		if(a==1) {
			b="구매자";
			
			
		}else if(a==2){
			b="판매자";
		}
		
		
		System.out.println("환영합니다!"+b+"로 로그인하셨습니다.");

	}

}