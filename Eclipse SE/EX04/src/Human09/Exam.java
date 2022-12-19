package Human09;

public class Exam {

	public static void main(String[] args) {
		ClassC c3 =new ClassC();
		InterfaceC ic3 = c3;

			
			
		
		//InterfaceC ic3 = new ClassC();
		
		ic3.methodA();
		ic3.methodB();
		ic3.methodC();
	
		InterfaceA ic1 = ic3;
				ic1.methodA();
				
				// ic1.methodB();
				// InterfaceA 를 구현한 ic1은 methodB가 없기때문에 실행 불가
				//methodB는 InterfaceB에 정의한 것이므로
				
				
	}

}
