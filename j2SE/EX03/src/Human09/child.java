package Human09;

public class child extends Parent{
	
	private String name;
	
	public child() {
	 //super(); 이는 생략된것이 아닌 아예 없는 것임 생략된 것이라고 한다면 this를 통해 다른 생성자에서 super가 호출될 것인데 그러면 2번 super가 호출되는 효과가 있어서 문법적인 로직에 어긋남.
	  this("홍길동");
		System.out.println("child() call");
	}
	public child(String name) {
		//super(); //생략된 것임.
		this.name=name;
		System.out.println("child(String name) call");
	}
}