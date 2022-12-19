package Human15;

public class StringToLowerToUpperExam {

	public static void main(String[] args) {
		String str1= "java Programing";
		String str2= "JAVA Programing";

		System.out.println(str1.equals(str2));
		//문자열은 대소문자를 구분함
		//대소문자를 가리지 않는 문자열 비교함수 : equalsIgnoreCase
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String lowerstr1 = str1.toLowerCase();//java programing
		String lowerstr2 = str1.toLowerCase();//java programing
		
		System.out.println(lowerstr1);
		System.out.println(lowerstr2);
		System.out.println(lowerstr1.equals(lowerstr2));
	}

}
