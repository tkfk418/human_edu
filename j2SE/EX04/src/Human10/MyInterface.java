package Human10;

public interface MyInterface {
	public void method1();
	public default void method2() {
		System.out.println("MyInterface가 method2를 호출했다 ");
		
	}
	//default 메서드는 구현클래스에 공통적으로 적용할 기능
	//default 메서드는 특정구현클래스에서 다르게 사용하고 싶다면 그 클래스에서 오버라이딩하면됨 

	
	
}
