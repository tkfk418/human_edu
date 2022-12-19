package Human21.packageA;

public class B {
	public static void main(String[] args) {
		
	A a = new A();
	
	a.field1=10;
	//필드1은 퍼블릭 이므로 동일 패키지,다른 클래스에서 접근 가능
	a.field2=20;
	//필드2는 디폴트이지만 동일 패키지라서 다른 클래스에서 접근 가능
	a.field3=30;
	//필드3은 프라이빗이므로 다른 클래스에서 접근 불가
	}
}
