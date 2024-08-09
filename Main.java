package day04;
import java.util.ArrayList;
public class Main {
	//클래스 구성 요소
	//필드: 객체 의 데이터를 저장하는 역할을 한다.
	//생성자: 기본 생성자,인자 생성자  (인자 생성자를 만들면 기본 생성자를 호출 안해줌)
	//메소드:반환타입(리턴문),아니다(보이드 시스아웃)

	public static void main(String[] args) {
		House house1 = new House("강현우",3,"대전동구용운동");
		//외부 접근할때는 .찍어줘야됨
		house1.showOwner(house1.ownerName);
		System.out.println("방의갯수:"+ house1.getRoomNum());
		System.out.println("\n집의 정보\n" + house1.showInfo());
		house1.showInfo2();
		//배열 ArrayList ->객체들만 담을수 있음 integer,double 같은 참조형 제외
		ArrayList<House> arrList = new ArrayList<House>();
		//위 형태 기억
		arrList.add(house1);
		arrList.add(new House("김현우",2,"대전 서구 달마동"));
		//위 형태는 익명 리스트
		arrList.add(new House("이현우",1,"대전 중구 대흥동"));
		
		for(House house: arrList) {
			house.showInfo2();
		}

	}

}



//별도 클래스 집 클래스 모델

class House {
//has~a~~	

	String ownerName;
	int roomNum;
	String address;
	public House() {
		
	}
		
//인자 생성자...(이름이 같으니 this로한번)
public House(String ownerName, int roomNum, String address ){
	this.ownerName=ownerName;
	this.roomNum=roomNum;
	this.address=address;
}
//1.반환없고, (주인 이름을 매개변수로 전달 받아 이름)을 같이 출력하는 메소드 showOwner()정의

void showOwner(String name) {
	System.out.println("현재 집 주인이름은" +name+ "입니다.");
	
}
	
	
//2.방의갯수를 반환하는 getRoomNum()메소드 정의
int getRoomNum() {
	return roomNum;
}
//3.모든 멤버 변수의 값을 반환하는 showInfo()메소드 정의
String showInfo() {
	String result="집주인이름:"+ownerName+"\n방의 갯수:"+roomNum+"\n집 주소:"+address;
	return result;
}
//showInfo2() ->보이드
void showInfo2() {
	System.out.println("집주인이름:"+ownerName+"\n방의 갯수:"+roomNum+"\n집 주소:"+address);
}
}