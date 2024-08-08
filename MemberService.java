package day03;

public class MemberService {
	Member member;

	public boolean login(String id, String password) {
		boolean result;
		if(id.equals("kang")&& password.equals("1105")) {
			result = true;
			
		}else {
			result = false;
		}
		return result;
	}
	public void logout(String id) {
		System.out.println(id+"님이 로그아웃 되었습니다");
	}

}
