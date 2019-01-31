
public class Sample {
	//call by value: 값에 의한 매개변수 전달
	//매개변수의 자료형이 value 타입
	//매개변수로 대입된 원본 데이터를 메소드 안에서 변경할 수 없음
	public void cav(int n) {
		n = n + 1;
	}
	
	//call by reference: 참조에 의한 매객변수 전달
	//매객변수의 자료셩이 reference 타입
	//매개변수로 대입된 원본 데이터를 매개변수 안에서 변경할 수 있습니다.
	//이런 종류의 메소드를 호출할 때는 도큐먼트를 확인해보거나
	//메소드를 호출한 후 전달한 데이터를 확인해보는 것이 좋습니다.
	public void car(int [] ar) {
		ar[0] = ar[0] + 1;
	}
	
	
	//메소드의 수행결과를 호출한 곳으로 넘겨주고 싶은 경우에는
	//return을 이용합니다.
	//메소드 이름 앞에 void 대신에 return 하고자 하는 데이터의
	//자료형을 기재하고 메소드 내에서 return 데이터;의 형식을 
	//만들어주면 됩니다.
	//메소드에서 void(리턴이 없으면) type이면 메소드를 호출하고
	//수행한 후 흐름이 끊어지게 됩니다.
	//데이터를 return 하면 그 return 된 데이터를 가지고 다른 작업을 
	//연속해서 수행할 수 있습니다.
	//메소드 호출구문 안에서 메소드를 호출하는 chaining 형식도
	//가능합니다.
	public double doubleAdd(double a, double b) {
		return a+b;
	}
	
	//인스턴스 생성
	public int x = 8;
	
	//static 메소드
	public static void staticMethod() {
		System.out.println("static method");
		//static 메소드에서는 인스턴스 변수를 호출하면 에러
		//x = 9;
	}
	
	//인스턴스 메소드에서 지역변수와 인스턴스 변수 또는
	//static 변수의 이름이 같을 때 인스턴스 변수나 static 변수를
	//호출하려면 앞에 this.을 붙여야 합니다.
	public void sameName(int x) {
		//가까이 에서 만든 x가 호출됩니다.
		System.out.println("x:" + x);
		//인스턴스 변수 x가 호출됩니다.
		//this가 붙으면 메소드 외부에서 먼저 찾습니다.
		System.out.println("this.x:" + this.x);
	}
	
}
