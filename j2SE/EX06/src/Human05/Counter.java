package Human05;

public class Counter {
	public int no;
	
	public Counter(int no) {
		this.no=no;
	}
	
	protected void finalize() throws Throwable{
		System.out.println(this.no+"번째 finalize가 실행됨");
    	super.finalize();
	}
	
	
	
	
}
