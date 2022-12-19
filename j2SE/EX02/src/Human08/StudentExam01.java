package Human08;

public class StudentExam01 {

	public static void main(String[] args) {
		Student st1 = new Student("강현준",1,10,80,90,70);

		int total = st1.getTotal();
		double avg = st1.getAverage();
		System.out.printf("이름: %s \n",st1.name);
		System.out.printf("총점: %d \n",total);
		System.out.printf("평균: %f \n",avg);
		System.out.println("--------------------");
		
		Student st2 = new Student("강우혁",2,11,100,90,90);

		total = st2.getTotal();
		avg = st2.getAverage();
		System.out.printf("이름: %s \n",st2.name);
		System.out.printf("총점: %d \n",total);
		System.out.printf("평균: %f \n",avg);
		System.out.println("--------------------");
		
		Student st3 = new Student("강주혁",2,12,80,80,80);

		total = st3.getTotal();
		avg = st3.getAverage();
		System.out.printf("이름: %s \n",st3.name);
		System.out.printf("총점: %d \n",total);
		System.out.printf("평균: %f \n",avg);
		
		
	}

}
