import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		//person Ŭ������ �ν��Ͻ��� ����
		Person person1 = new Person();
		//setter�� ȣ���ؼ� ������ ����
		person1.setName("�輺��");
		person1.setAge(27);
		person1.setHeight(176.4);
		//getter�� �̿��ؼ� �����͸� ���
		System.out.println("�̸�:" + person1.getName());
		System.out.println("����:" + person1.getAge());
		System.out.println("Ű:" + person1.getHeight());
		
		//���ڿ��� �Ű������� �޴� �����ڸ� �̿��ذ� �ν��Ͻ��� ����
		Person person2 = new Person("noname");
		System.out.println("�̸�:" + person2.getName());
		
		Scanner sc = new Scanner(System.in);
	}
}
