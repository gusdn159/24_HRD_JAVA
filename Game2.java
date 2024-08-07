package day02;
public class Game2 {
	
	public static void main(String[] args) {
		// 문제2:continue문: 369 게임하기
		//1부터 10까지의 정수 출력 중 3,4,9 일때 박수 소리를 출력하는 프로그램작성
		//-------------------
		//실행결과
		//-------------------
		//1 2 짝 4 5 짝 7 8 짝 10
		for(int i=1;i<=10;i++) {
			if(i==3 || i==4 || i==9){
				System.out.printf(" 짝");
				continue;
			}
			System.out.print(" "+i);
			
			
			
		

	}

}
}