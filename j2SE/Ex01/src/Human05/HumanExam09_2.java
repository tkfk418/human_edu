package Human05;

public class HumanExam09_2 {

	public static void main(String[] args) {
		//이중for문을 사용할 것이고, System.out.print("*"), System.out.println()
		for (int a=1; a<=5; a++) {
			for(int b=1; b<=5+1-a; b++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		

	}

}
