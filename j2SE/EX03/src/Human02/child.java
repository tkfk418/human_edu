package Human02;

public class child extends Parent{
	
	public child() {
		super();
		System.out.println("child() 생성자 호출");
	}
	public child(int i) {
		super(i);
		System.out.println("child(i) 생성자 호출");
	}
}
