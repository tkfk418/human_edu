package Human02_1;

public class ChildExam {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Parent(10);

		
		
		child c1 = new child();
		//c1객체는 super 생성자를 통해서 부모의 기능을 수행할 수 있음. 
		child c2 = new child(10);
	}

}
