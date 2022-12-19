package Human08;

public class HashCodeExam {
	public static void main(String[] args) {
		Student s1 = new Student(101,"sun");
		Student s2 = new Student(102,"sun");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//hashcode는 객체를 유일하게 비교해주는 코드임.
		//object 클래스에 그 기능이 있음.
		
		System.out.println(s1.hashCode()==s2.hashCode());
		
	}

}
