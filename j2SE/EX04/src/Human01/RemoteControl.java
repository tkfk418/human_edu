package Human01;

public interface RemoteControl {
	//1. 추상메서드
	public void turnOn();
	//인터페이스와 인터페이스 내의 메서드는 abstract라는 키워드가 생략되어 있다.
	//컴파일 과정에서 자동으로 생성된다.
	public void turnOff();
	public void setVolume(int volume);
	
	//2. 상수를 관리할 수 있다. (static final)
	public static int MIN_VOL=0;
	public static int MAX_VOL=10;
	
	//3.디폴트메서드 (자바8버젼 이후의 기능)
	//인터페이스로 구현된 구현클래스 (tv,audio 같은 것)둘이 공통으로 쓸수있는 기능
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		}
		else {
			System.out.println("무음해제");
		}
	
	}
	//4.static 메서드 (인터페이스차원의 메서드)
	//자바8버젼 이후의 기능
	static void changeBatt() {
		System.out.println("배터리를 교체하다");
		
	}
}
