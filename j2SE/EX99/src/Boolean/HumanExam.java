package Boolean;

public class HumanExam {

 public static void main(String[] args) {
		String human1;
		human1 = "휴먼교육센터";
		String human2 = "휴먼교육센터";
		String human3 = new String("휴먼교육센터");
		
		System.out.println(human1);
		System.out.println(human2);
		System.out.println(human3);
		System.out.println(human1==human2);
		System.out.println(human1.equals(human3));
}

}
