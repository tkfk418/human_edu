package Human20.packageB;

import Human20.packageA.A;

public class C {
	public static void main(String [] args) {
		A a1 = new A(true);
		//패키지명을 붙여서 사용하거나 import를 활용하여 접근가능
		A a2 = new A(10);
		//default는 다른 패키지내에서 접근불가. 
		A a3 = new A(5.1);
		//a3는 private이므로 다른 클래스에서는 접근 불가.
	}
}
