package day05;

public class PrintText implements Printable{

	public static void main(String[] args) {
		
		PrintText pt = new PrintText();
		pt.printMe();
//인터페이스나 추상은 객체 생성 불가
	}

	@Override
	public void printMe() {
		System.out.println("텍스트파일 출력합니다..");
	}

}
