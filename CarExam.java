package day03;

public class CarExam {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car myCar2 = new Car("기아","k7","검정",200);
		myCar.color = "노랑";
		myCar.company = "현대";
		myCar.model = "제네시스";
		myCar.maxSpeed = 200;
		

		//메소드 호출
		myCar.CarInfo();
		myCar2.CarInfo();

	}

}
