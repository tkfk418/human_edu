package Human04.packageA;

public class B {
	public static void main(String[] args) {
		A a =new A(); // 동일 패키지이므로 가능
	   a.field = 1;  //동일 패키지이므로 가능
	   a.method();  //동일 패키지이므로 가능
	}
	
}
