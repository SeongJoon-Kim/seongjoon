
public class Main {

	public static void main(String[] args) {
		//Sample 클래스의 cav 라는 메소드와 car이라는 메소드를 사용
		
		int n = 10;
		int [] br = {10,20,30};
		
		//cav 메소드와 car 메소드를 호출
		//static 메소드가 아니므로 인스턴스를 먼저 생성
		Sample sample = new Sample();
		//n 데이터를 가지고 메소드 호출
		sample.cav(n);
		//n은 value 형이므로 값이 변경되지 않습니다.
		System.out.println("n:" + n);
		
		//br 데이터를 가지고 메소드 호출
		sample.car(br);
		//br은 reference 형이므로 값이 변경될 수 있습니다.
		System.out.println("br[0]:" + br[0]);
		
		
		
		//double을 return 메소드를 호출
		double result = sample.doubleAdd(10.3, 20.8);
		System.out.println("결과:" + result);
		
		//메소드의 수행결과도 데이터이므로
		//메소드 안에서 메소드를 매개변수로 사용할 수 있습니다.
		result = sample.doubleAdd(sample.doubleAdd(20.3, 17.6), 30.6);
		System.out.println("결과:" + result);
		
		//static 변수나 메소드는 클래스 이름으로 호출이 가능합니다.
		Sample.staticMethod();
		
		sample.sameName(20);
	}

}
