package day02;

public class RefType {

	public static void main(String[] args) {
		//참조형 변수
		RefType ref = new RefType();
		//메인 안쪽이니 지역변수 (stack)에 쌓임->heap 100번지에
		RefType ref2 = new RefType();
		//힙메모리에 할당하고 객체 나중에 생성
		//!! new는 heap에 비어있는 새로운 공간에 할당  (속성,메소드)
		//서로 다른 오브젝트 객체 2개 생성
		if(ref == ref2) {
			System.out.println("동일한 주소를 갖는 객체이다");
		}else {
			System.out.println("서로 다른 주소를 갖는 객체입니다");
		}
		String name = new String("강현우");
		System.out.println(name);
		//참조변수처럼 사용하는 String
		
		String name2 = "오늘도 수고했어요";
		System.out.println(name2.length());
		//기본형처럼 사용하는 String
		
		int[] score = new int[5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
				//배열 과 for 반복은 ex ++ 중요관계
		
		int sum=0;
		for(int i = 0; i<score.length; i++) {
			sum=sum+score[i];
		}
 				System.out.println("총합:"+sum);
	}

}
