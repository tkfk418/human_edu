package Human22.packageA;

public class B {
	public static void main() {
	A a = new A();
	//동일 패키지, 다른 클래스
	a.method1();
	//퍼블릭이므로 접근 가능
	a.method2();
	//디폴트이나 동일 패키지이기 때문에 다른 클래스에서 접근 가능
	a.method3();
	//프라이빗이기때문에 다른 클래스에서는 어떠한 경우라도 접근 불가
	
}

}
