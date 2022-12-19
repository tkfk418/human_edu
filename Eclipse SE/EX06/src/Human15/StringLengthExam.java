package Human15;

public class StringLengthExam {

	public static void main(String[] args) {
		String ssn="7600000100000";
		int len = ssn.length();
		System.out.println(len);
		
		if(len==13) {
			System.out.println("주민번호 자리수는 맞다");
		}
		else { 
			System.out.println("주민번호 자리수는 안맞으니 확인해라");
		}
		
		
		
		
	}

}
