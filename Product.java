package day06;

public abstract class Product {
	String pname;
	int price;
	
	public void printDetail() {//템플릿 메소드패턴 (안쪽에 추상메소드호출)
		System.out.println("상품명: "+pname+" , ");
		System.out.println("가격: "+price+" , ");
		printExtra();
	}
	//추상 메소드 기울어져있음 중괄호 x
	public abstract void printExtra();

}
