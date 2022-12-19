package human04_2;

import java.util.HashSet;
import java.util.Set;

public class MemberExam {

	public static void main(String[] args) {
		Member m1 = new Member("moon",10);
		Member m2 = new Member("sun",20);
		Member m3 = new Member("moon",15);
		
		Set<Member> set = new HashSet<Member>();
		boolean result1 = set.add(m1);
		//add메서드 안에는 해쉬코드를 호출하고 equals 메서드 호출
		//1. 해쉬코드가 다르면 다른 객체로 인지
		//2. 해쉬코드가 같고 equals를 통해서 같은 것이라고 인식한다면 같은 객체로 인지
		boolean result2 = set.add(m2);
		boolean result3 = set.add(m3);
		
		System.out.println(set.size());
		System.out.printf("m1(%b) /m2(%b)/m3(%b) \n",result1,result2,result3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
