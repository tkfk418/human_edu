package Human15;

public class StringEqualsExam {

	public static void main(String[] args) {
		String strVal1 = new String("sun");
		String strVal2 = new String("sun");
		System.out.println(strVal1==strVal2);
		System.out.println(strVal1.equals(strVal2));
		
		//string 클래스는 최상위 클래스인 object 클래스를 상속받았고 equals란 메서드는 object가 가지고 있는 메서드이는 주소값을 비교하는 메서드이지만
		//string클래스에서 멤버변수 값을 비교하도록 오버라이딩 하였기 때문에 equals메서드를 사용하면 true 가 나온다

	}

}
