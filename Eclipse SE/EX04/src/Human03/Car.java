package Human03;

public class Car {

	public static void main(String[] args) {
		Tire t = new Htire();
		//위의 한 줄 코드는 아래의 두 줄 코드와 같음.
		//Htire ht=new Htire(); 
		// Tire t1=ht;
		//Tire 인터페이스에 H사 타이어를 대입시킨 형태
		//Tire 인터페이스 t1은 Htire로 구현됨.
		t.roll();
		
		
		Tire t2 = new Ktire();
		//Htire를 Ktire로 바꾸기만 하면 Tire인터페이스는 케이 타이어를 가르키게 됨.
		// 객체를 부품화하여 붙였다 떼었다를 자유자재로 할 수 있음.
		t2.roll();
	}

}
