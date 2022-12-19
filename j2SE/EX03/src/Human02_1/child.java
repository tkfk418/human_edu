package Human02_1;

public class child extends Parent{
	
	public child() {
		//super(); super는 인자가 없을때만 생략가능 코드상에서만 생략 컴파일하면 자동으로 만들어냄
		//super는 생성자 생성시 절대적으로 있어야함.
		System.out.println("child() 생성");
	}
	public child(int i) {
		super(i); //인자가 있는 부모의 생성자를 호출시에는 생략불가
		System.out.println("child(i) 생성");
	}
}
