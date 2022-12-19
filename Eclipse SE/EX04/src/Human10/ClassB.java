package Human10;

public class ClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("ClassB가 method1()를 호출했다 ");
		
	}
	@Override
	public void method2() {
		System.out.println("ClassB가 method2() 호출 - 오버라이딩 ");
	}
}
