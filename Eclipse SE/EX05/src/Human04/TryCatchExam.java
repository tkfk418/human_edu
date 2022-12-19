package Human04;

public class TryCatchExam {

	public static void main(String[] args) {
	//try/catch/finally 구문 실습
		
		try {
		TryCatch h1 = new TryCatch("강현준");
		h1 = null;
		h1.run(); //예외발생 포인트
		
		TryCatch h2 = new TryCatch("ju");
		h2.run();
		}
		// catch(NullPointerException ne) {
		 catch(Exception ne) {
			System.out.println("예외가 발생했습니다");
			System.out.println("ne: " +ne);
			System.out.println(ne.getStackTrace());
			System.out.println(ne.getMessage());
		}
		finally {
			System.out.println("Finally를 실행합니다");
		}
		System.out.println("시스템을 종료합니다");
		

	}
//catch는 try안에서 예외가 발생했을 때 처리하는 로직을 담아둘 수 있음
	//최상위인 exception을 catch문으로 처리하면 어떠한 예외도 처리될 수 있으나
	//예외별로 다르게 로직을 적용하고 싶을 때는 개별적인 예외의 종류를 선정해서 catch문에 담아야한다.
}
