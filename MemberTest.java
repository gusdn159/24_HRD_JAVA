package day03;
import java.util.ArrayList;
public class MemberTest { 
	
public static void main(String[] args) {
Member member = new Member("강현우","kang");

ArrayList<Member> memlist = new ArrayList<Member>();	
memlist.add(member);
memlist.add(new Member("김현우","kim"));

for(Member m:memlist) {
	System.out.println(m.name+"\t"+m.id);
}
MemberService memberService	= new MemberService();

boolean result = memberService.login("kang", "1105");

if(result) {
	System.out.println("로그인 되었습니다.");
	memberService.logout("kang");
}else {
	System.out.println("id 또는 password가 올바르지 않습니다.");
}
}
}