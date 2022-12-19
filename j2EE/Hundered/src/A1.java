
public class A1 extends A {
	A1(){
		super(0);	//부모클래스의 생성자를 가장 먼저 호출해야한다.
		i+=1;
	}
	
	@Override
	public int getI() {	//메소드 재정의
		return super.getI()+1;
	}
	
	
}
