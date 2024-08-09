package day04;

public class SmartPhone extends Phone {
	//필드 선언
	public boolean wifi;
	public SmartPhone(String model, String color) {
		super(model,color);
		//부모생성자 호출 코드 super
		//this는 자기자신

		
	}
	
	
	
	
	
	@Override
	public void bell() {
		System.out.println("링딩동");
	}





	public void setWifi(boolean wifi) {
		this.wifi=wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}

}
