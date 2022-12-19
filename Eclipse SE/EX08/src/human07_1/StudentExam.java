package human07_1;

import java.util.HashMap;
import java.util.Map;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student(1,"moon");
		Student s2 = new Student(2,"sun");
		Student s3 = new Student(3,"star");
		Student s4 = new Student(1,"moon");
		
		Map<Student,Integer> map = new HashMap();
		map.put(s1, 80);
		map.put(s2, 90);
		map.put(s3, 100);
		map.put(s3, 95);	//s3라는 객체의 값을 100에서 95로 변경
		map.put(s4, 91);
		//put 메서드 호출시 key값 기준으로 동일한 것이 있는지를 확인
		//확인방법
		//1. hashCode()호출 : 다르면 다른 key이므로 map 추가
		//2.equals 메서드를 호출 : 이때에도 같으면 같은 key 이므로 map에 추가하지 않음
		
		System.out.println(map);
		System.out.println(map.get(s1));
		// System.out.println(map.get(s4));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
