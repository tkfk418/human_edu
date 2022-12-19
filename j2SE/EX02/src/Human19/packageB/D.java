package Human19.packageB;

import Human19.packageA.B;

public class D {
	//public 클래스는 어디에서나 접근가능.
	//A a = new A();
	//a는 default이면서 다른 패키지이므로 접근 불가.
	B b = new B();
	//b는 패키지명을 붙여서 사용하거나 import를 활용하여 접근가능.
	C c = new C();
	//c는 동일 package 이므로 접근 가능.
	D d = new D();
	//d는 나 자신이므로 접근 가능.
}
