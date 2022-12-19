package Human01_2;

public class MemberExam extends Object{

	public static void main(String[] args) {
			Member m1 = new Member(47);
			Member m2 = new Member(47);
			Member m3 = new Member(20);
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
			System.out.println(m1==m2);
			System.out.println(m1==m3);

;
			System.out.println(m1.equals(m2));
			System.out.println(m1.equals(m3));
	}

}
