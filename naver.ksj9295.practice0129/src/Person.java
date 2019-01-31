
//이름과 나이와 키를 묶어서 저장할 수 있는 클래스
public class Person {
	//클래스를 만들면 매개변수가 없는 기본적으로 제공됩니다.
	//public Person() { }
	
	//기본적으로 제공되는 생성자는 다른 생성자를 만들면 없어집니다.
	//이 생성자가 없으면 생성자를 호출할 때 반드시 매개변수를 대입해서
	//인스턴스를 생성
	public Person() {
		System.out.println("매개변수가 없는 생성자 - defalt constructor");
	}
	
	//생성자 오버로딩: 메소드 이름은 같고 매개변수의 개수나 자료형이 다른 경우
	//생성자를 오버로딩하게 되면 인스턴스를 만드는 방법이 다양하게 됩니다.
	public Person(String name) {
		this.name = name;
		System.out.println("매개변수가 1개 있는 생성자");
	}
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	//인스턴스 변수는 private 으로 생성해서 인스턴스가
	//사용할 수 없도록 생성
	private String name;
	private int age;
	private double height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
