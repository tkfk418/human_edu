package Human21.packageA;


public class A {
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		this.field1=1;
		this.field2=2;
		this.field3=3;
		
		//모든 멤버변수는(필드는) 자기자신에 대해서는 접근 가능.
	}
	public static void main() {
		A a = new A();
		a.field1 = 1;
		a.field2=2;
		a.field3=3;
		//위의 생성자랑 마찬가지 효과
	}
	
}
