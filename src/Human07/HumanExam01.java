package Human07;

public class HumanExam01 {

	public static void main(String[] args) {
		String human1;
		human1 = "휴먼교육센터";
		// human1에는 stack영역에서는 시작번지를 참조함.
		String human2 = "휴먼교육센터";
		String human3 = new String("휴먼교육센터");
		String human4 = new String("휴먼교육센터");
		
		boolean x1 = (human1 == human2); // true, false
		boolean x2 = (human1 == human3);
		boolean x3 = (human3 == human4);
		
		System.out.printf("(human1 == human2) ==> %b \n", x1); //참조가 같음
		System.out.printf("(human1 == human3) ==> %b \n", x2);	//참조가 다름
		System.out.printf("(human3 == human4) ==> %b \n", x3);	//참조가 다름
	
		boolean y1 = human1.equals(human3);   // 참조와 상관없이 문자열 비교
		System.out.printf("(human1.equals(human3)) ==> %b \n", y1); //문자열이 같음
		System.out.printf("(human3.equals(human4)) ==> %b \n", human3.equals(human4)); //문자열이 같음
		
	}

}
