package Human22.packageB;

import Human22.packageA.A;

public class C {
	public static void main(String[] args) {
		A a = new A();
		//다른 패키지, 다른 클래스
		a.method1();
		//퍼블릭이므로 접근 가능 단 임포트 조건하에서만
		a.method2();
		//디폴트는 다른 패키지에서 어떤 조건이라도 접근 불가
		a.method3();
		//프라이빗이기때문에 다른 클래스에서는 어떠한 경우라도 접근 불가
		
	}

}
