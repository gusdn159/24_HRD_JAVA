package day02;
import java.util.Scanner;
import java.util.Random;
public class Game1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("##가위바위보 게임##");
		System.out.println("가위 바위 보!시작하려면 시작 종료하려면 종료");
		
		boolean run=true;
		
		while(run) {
			String galba = scan.next();
			int num = random.nextInt(3)+1;
			if(galba.equals("가위") && num==1) {
			    System.out.println("가위:가위 비겼습니다");
			}else if(galba.equals("가위") && num==2) {
			    System.out.println("가위:바위 졌습니다");
			}else if(galba.equals("가위") && num==3) {
			    System.out.println("가위:보 이겼습니다");
			}else if(galba.equals("바위") && num==1) {
			    System.out.println("바위:가위 이겼습니다");
			}else if(galba.equals("바위") && num==2) {
			    System.out.println("바위:바위 비겼습니다");
			}else if(galba.equals("바위") && num==3) {
			    System.out.println("바위:보 졌습니다");
			}else if(galba.equals("보") && num==1) {
			    System.out.println("보:가위 졌습니다");
			}else if(galba.equals("보") && num==2) {
			    System.out.println("보:바위 이겼습니다");
			}else if(galba.equals("보") && num==3) {
			    System.out.println("보:가위 졌습니다");
			}else if(galba.equals("종료")) {
			    System.out.println("종료합니다");
			    run=false;
			    
			
	}

}
}
}