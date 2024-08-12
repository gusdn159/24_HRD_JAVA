package day05;


interface Soundable{
	public String sound();
	
	
}
//abstract class Animal{
	//추상 클래스.. 적어도 한개 이상의 추상 메소드를 갖는 클래스
	//추상 메소드: {} 바디가 없는 메소드 ;로 끝남
	
	//abstract void sound();	
//}
class Dog implements Soundable{

	@Override
	public String sound() {
		return "멍멍";
	}
	//무조건 오버라이딩 해야됨 sound 
	
}
class Cat implements Soundable{

	@Override
	public String sound() {
		return "야옹";
	}
}
public class AnimalTest {
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
    printSound(new Dog());
    printSound(new Cat());
		//printSound(new Cat());
		//printSound(new dog());
		
		//Animal animal = new Dog();
		//Animal animal2 = new Cat();
		//animal.sound();
		//animal2.sound();
	}

}
