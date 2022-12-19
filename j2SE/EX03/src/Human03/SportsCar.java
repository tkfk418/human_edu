package Human03;

public class SportsCar extends Car{
// 멤버변수 ==> 작성하지 않아도 부모의 currentSpeed 사용가능
// 생성자 ==> 부모의 생성자를 강제로 만들어야 함.
//	메서드 ==>부모의 메서드를 활용할 수 있되 자식의 메서드를 추가적으로 더 잘 활용할 수 있다.
	
	
	
	public SportsCar(int currentSpeed) { //SportsCar 생성과정
		super(currentSpeed); //부모(Car)의 생성자를 만드는 과정
	//아래 코드는 할 필요가 없음.
		//	this.currentSpeed = currentSpeed;
	}
	
	public void speedUp() {
		//메서드 오버라이딩
		//부모가 가지고 있는 기능을 새로이 정의해서 쓰고 싶음.
		this.currentSpeed+=10;
	}

}
