package Human20.packageA;

public class B {

	public static void main(String [] args) {
		A a1 = new A(true);
		//public은 어디에서든 접근 가능
		A a2 = new A(10);
		//default는 동일 패키지내에서 접근가능. 
		A a3 = new A(5.1);
		//a3는 private이므로 다른 클래스에서는 접근 불가.
	}
}
