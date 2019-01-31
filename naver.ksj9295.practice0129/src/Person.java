
//�̸��� ���̿� Ű�� ��� ������ �� �ִ� Ŭ����
public class Person {
	//Ŭ������ ����� �Ű������� ���� �⺻������ �����˴ϴ�.
	//public Person() { }
	
	//�⺻������ �����Ǵ� �����ڴ� �ٸ� �����ڸ� ����� �������ϴ�.
	//�� �����ڰ� ������ �����ڸ� ȣ���� �� �ݵ�� �Ű������� �����ؼ�
	//�ν��Ͻ��� ����
	public Person() {
		System.out.println("�Ű������� ���� ������ - defalt constructor");
	}
	
	//������ �����ε�: �޼ҵ� �̸��� ���� �Ű������� ������ �ڷ����� �ٸ� ���
	//�����ڸ� �����ε��ϰ� �Ǹ� �ν��Ͻ��� ����� ����� �پ��ϰ� �˴ϴ�.
	public Person(String name) {
		this.name = name;
		System.out.println("�Ű������� 1�� �ִ� ������");
	}
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	//�ν��Ͻ� ������ private ���� �����ؼ� �ν��Ͻ���
	//����� �� ������ ����
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
