package Human19.packageA;

import Human19.packageB.D;

class A {
	//default 클래스는 동일 package 에서만 접근가능.
	A a = new A();
	//a는 default 클래스는 나 자신이므로 default라도 접근 가능.
	B b = new B();
	//b는 public이므로 그리고 동일 package이므로 접근 가능
	//C c = new C();
	//c는 default이면서 다른 패키지이므로 접근 불가
	D d = new D();
	//d는 패키지명을 붙여서 사용하거나 import를 활용하여 접근가능.
}
