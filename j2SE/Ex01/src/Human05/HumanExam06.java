package Human05;

public class HumanExam06 {

	public static void main(String[] args) {
		// 1~100까지의 정수 중 3의 배수 총합을 구하는 코드 작성
		
		// case 1 (나머지를 이용함)
/*		int total=0;
		for ( int a =0; a<=100; a++) {
			if (a%3 ==0) {
				

			total = total + a;
				
				System.out.printf("%d까지의 누적합 ==> %d \n", a, total);
			}				
			}
	*/
		// case 2 (증감을 3씩)
		int total=0;
		int a;
		for ( a =0; a<=100; a+=3) {
				

			total = total + a;
				
							
			}
		System.out.printf("%d까지의 누적합 ==> %d \n", a, total);
	}

}
