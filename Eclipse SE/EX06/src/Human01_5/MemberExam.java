package Human01_5;

public class MemberExam extends Object{

	public static void main(String[] args) {
			Member m1 = new Member("Blue");
			Member m2 = new Member("Blue");
			Member m3 = new Member("Red");
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
			System.out.println(m1==m2);
			System.out.println(m1==m3);
			String m4 =new String("Red");
			String m5 =new String("Red");
			System.out.println("--------------");
			System.out.println(m4.equals(m3));
			System.out.println(m4.equals(m5));
			System.out.println(m1.equals(m2));
			System.out.println(m1.equals(m3));
	}

}
