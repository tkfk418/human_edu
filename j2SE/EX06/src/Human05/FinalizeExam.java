package Human05;

public class FinalizeExam {

	public static void main(String[] args) {
		Counter cnt = null;
		
		for (int i=0; i<=50; i++) {
			cnt = new Counter(i);
	
		cnt = null;
		
		System.gc();
		//gc는 garbagecollector를 의미하고 gc메서드 호출에 의해서 finalize가 호출됨.
		
		}

	}

}
