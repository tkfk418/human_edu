package Human02;

public class NumberFExp {

	public static void main(String[] args) {
		// numberformatexception
		
		String strValue01 = "1000";
		int intValue01= Integer.parseInt(strValue01);
		//Integer 클래스의 static메서드인 parseInt는 숫자로 변환해주는 메서드
		int intPlus01 = intValue01+10;
		System.out.printf(" intPlus : %d \n", intPlus01);
		
		String strValue02 = "a1000";
		int intValue02= Integer.parseInt(strValue02);
		//strValue02는 숫자로 변환할 수 없는 형태이므로 예외 발생
		int intPlus02 = intValue01+10;
		System.out.printf(" intPlus : %d \n", intPlus02);
				
	
	}

}
