package day04;
import java.util.ArrayList;
/**
 * 상속을 이용하여 다음 요구사항(중복코드 제거)을 해결하시오.
 * 게임 캐릭터의 초기 작업을 위한 초심자(Novice) 클래스와
 * 초심자의 다음 직업인 마법사 (Wizard) 클래스를 다음과 같이 설계했다고 가정
 * Wizard 클래스가 Novice 클래스의 모든 필드와 메소드를 가지고 있고
 * 추가로 마력 필드 mp와 불 공격 메소드 fireball()이 더해져있음 
 */
class Novice {
	String name;
	int hp;
	void punch() {
		System.out.printf("%s(HP:%d)의 펀치!\n", name, hp);
	}

}
class Wizard extends Novice{
	int mp;
	
	public void fireball() {
		System.out.printf("%s(MP:%d)의 불공격!\n", name, mp);
	}
}
class Knight extends Novice{
	int stamina;
	public void PowerSwing() {
		System.out.printf("%s(HP:%d)의 강공격!\n", name, stamina);
	}
}



public class GameCharactorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard wizard = new Wizard();
		wizard.name = "간달프";
		wizard.hp = 100;
		wizard.mp = 80;
		
		Knight knight = new Knight();
		knight.name = "킹아서";
		knight.hp = 150;
		knight.stamina = 70;
		
		wizard.fireball();
		knight.PowerSwing();
		wizard.punch();
		knight.punch();
//////////////////////////////////////////////////////////////////////////////////
		ArrayList<Novice> gamelist = new ArrayList<Novice>();
//////////////////////////////////////////////////////////////////////////////////
		gamelist.add(wizard);
		gamelist.add(knight);
		//if instanceof 누구의 인스턴스니
		
		for(Novice n:gamelist) {
			if(n instanceof Wizard) {
				((Wizard) n).fireball();}
			if(n instanceof Knight) {
				((Knight) n).PowerSwing();
			}
		}
	}

}
