
public class Main {

	public static void main(String[] args) {
		//Sample Ŭ������ cav ��� �޼ҵ�� car�̶�� �޼ҵ带 ���
		
		int n = 10;
		int [] br = {10,20,30};
		
		//cav �޼ҵ�� car �޼ҵ带 ȣ��
		//static �޼ҵ尡 �ƴϹǷ� �ν��Ͻ��� ���� ����
		Sample sample = new Sample();
		//n �����͸� ������ �޼ҵ� ȣ��
		sample.cav(n);
		//n�� value ���̹Ƿ� ���� ������� �ʽ��ϴ�.
		System.out.println("n:" + n);
		
		//br �����͸� ������ �޼ҵ� ȣ��
		sample.car(br);
		//br�� reference ���̹Ƿ� ���� ����� �� �ֽ��ϴ�.
		System.out.println("br[0]:" + br[0]);
		
		
		
		//double�� return �޼ҵ带 ȣ��
		double result = sample.doubleAdd(10.3, 20.8);
		System.out.println("���:" + result);
		
		//�޼ҵ��� �������� �������̹Ƿ�
		//�޼ҵ� �ȿ��� �޼ҵ带 �Ű������� ����� �� �ֽ��ϴ�.
		result = sample.doubleAdd(sample.doubleAdd(20.3, 17.6), 30.6);
		System.out.println("���:" + result);
		
		//static ������ �޼ҵ�� Ŭ���� �̸����� ȣ���� �����մϴ�.
		Sample.staticMethod();
		
		sample.sameName(20);
	}

}
