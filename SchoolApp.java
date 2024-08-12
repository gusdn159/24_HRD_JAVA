package day05;
import java.util.ArrayList;
import java.util.Scanner;
public class SchoolApp {
	
	public void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Person person;
		ArrayList<Person> personList = new ArrayList<Person>();
		person = new Student("202401","자바","홍길동",20);
		personList.add(person);
		personList.add(new Staff("200801","보안","김사업",25));
		personList.add(new Teacher("199006","네트워크","킴교사",38));
		
		//person.inputPerson();
		
		for(Person p:personList) {
			if(p instanceof Student) 
				System.out.println(((Student) p).getId());
		    else if(p instanceof Staff) {
			    System.out.println(((Staff) p).getId());
		    }else if(p instanceof Teacher) {
				System.out.println(((Teacher) p).getId());
			}

	}

	}
}

