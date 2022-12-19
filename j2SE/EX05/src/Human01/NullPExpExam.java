package Human01;

public class NullPExpExam {

	public static void main(String[] args) {
	//nullpointexception 사례 : 객체생성 후 객체가 가르키는 heap주소 null로 변경시
		
		NullPExp h1 = new NullPExp("강현준");
		h1.run();
		System.out.println(h1);
		
		h1 = null;
		System.out.println(h1);
		h1.run();
		
		//nullpointexception 사례 : 배열변수에 null로 초기화 한후 배열내의 값을 접근한 경우
		int [] intValue = null;
		System.out.printf("intValue[0] =%d \n",intValue[0]);
		
		

	}

}
