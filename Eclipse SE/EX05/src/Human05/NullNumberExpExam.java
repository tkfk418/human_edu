package Human05;



public class NullNumberExpExam {
//널포인트익셉션, 넘버포멧익셉션
	public static void main(String[] args) {
	try {
		String str = "a100";
		int intValue = Integer.parseInt(str);
		//정수로 변환할 수 없는 예외 발생
		System.out.printf("intValue : %d \n", intValue);
		
		NullNumberExp h1 = new NullNumberExp("강현준");
	h1 = null;
	h1.run(); //예외발생 포인트
	

		
	System.out.println("로직 정상 종료");
	}
	catch(NullPointerException ne) {
		System.out.println("NullPointerException 발생");
	}
	catch(NumberFormatException fe) {
		System.out.println("NumberFormatException 발생");
	}
	
	finally {
		System.out.println("Finally 출력됨");
	}
	System.out.println("프로그램 정상 종료");
	}
}
