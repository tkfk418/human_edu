package Human05;

public class HumanExam11 {

	public static void main(String[] args) {
		//1부터 10까지 출력을 하면서 5보다 작으면 "5이하입니다"라는 것을 출력할 예정.
		
		int cnt = 0;
		boolean z = true;
		while (z) { 
			cnt++;
			System.out.printf("cnt = %d \n", cnt);
			
			
			if (cnt > 10) {
				break;  // z = false;	
			}
			// if (cnt <=5) {
			// System.out.printf("현재의 수치가 5이하입니다.");
			//}
			if (cnt > 5) {
				continue; //반복문의 시작
			}
			 System.out.println("현재의 수치가 5이하입니다.");
		}

	}

}
