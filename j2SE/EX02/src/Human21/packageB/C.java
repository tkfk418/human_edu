package Human21.packageB;

import Human21.packageA.A;

public class C {
	public static void main(String[] args) {
		
		A a = new A();
		
		a.field1=10;
		//필드1은 퍼블릭 이므로 다른 패키지,다른 클래스에서 접근 가능 단 임포트 필요
		a.field2=20;
		//필드2는 디폴트이고 다른 패키지라서 접근 불가. 임포트해도 해결안됨
		a.field3=30;
		//필드3은 프라이빗이므로 다른 패키지에서 접근 불가
		}

}
