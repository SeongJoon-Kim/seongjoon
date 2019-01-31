import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		//person 클래스의 인스턴스를 생성
		Person person1 = new Person();
		//setter를 호출해서 데이터 저장
		person1.setName("김성준");
		person1.setAge(27);
		person1.setHeight(176.4);
		//getter를 이용해서 데이터를 출력
		System.out.println("이름:" + person1.getName());
		System.out.println("나이:" + person1.getAge());
		System.out.println("키:" + person1.getHeight());
		
		//문자열을 매개변수로 받는 생성자를 이용해거 인스턴스를 생성
		Person person2 = new Person("noname");
		System.out.println("이름:" + person2.getName());
		
		Scanner sc = new Scanner(System.in);
	}
}
