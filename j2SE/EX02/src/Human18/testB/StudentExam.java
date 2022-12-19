package Human18.testB;

import Human18.testA.Student;

public class StudentExam {

	public static void main(String[] args) {
		// 다른 패키지의 클래스를 사용하는 방법
//		case1. 패키지 명을 붙임.
		
		Human18.testA.Student s1 = new Human18.testA.Student("강현준",88);
		s1.showInfo();
		

		//case2. import사용
		Student s2 = new Student("강우혁",95);
		s2.showInfo();
	}

}
