package human02;

public class Box {
	//object는 모든 클래스의 상위 클래스 
	//object는 string의 상위클래서, integer의 상위클래스
	private Object t;
	


	public Box() {
		
	}
	
	public Object getT() {
		return this.t;
	}


	public void setT(Object t) {
		//object t = "human1"(string을 상위인 object에 대입)-자동타입변환
		
		
		//object t =20 
		//integer을 상위인 object에 대입 - 자동타입변환
		this.t = t;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
