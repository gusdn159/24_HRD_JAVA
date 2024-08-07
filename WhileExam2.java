package day02;

public class WhileExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20; 
		while(i>10) { 
			System.out.println(i--);
		}
		boolean flag = true;
		while(flag) {
			i--;
			if(i==3) {
				System.out.println("i=3 종료");
				flag=false;
			}
		}
		
	}
}
