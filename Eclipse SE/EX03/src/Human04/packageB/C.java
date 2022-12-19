package Human04.packageB;

import Human04.packageA.A;

public class C {
	public static void main(String[] args) {
		A a =new A(); //클래스는 public이므로 접근가능. 생성자는 다른 패키지 이므로 접근 불가
		 a.field = 1;  //다른 패키지이므로 접근 불가
		   a.method();  //다른 패키지이므로 접근 불가
	}

}
