package Human01;

public class TVExam {

	public static void main(String[] args) {
		//RemoteControl rc = new Television();
		Television tv = new Television();
		Audio au = new Audio();
		RemoteControl rc = tv;
		//rc는 구현객체이고 tv는 구현클래스의 객체
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setVolume(RemoteControl.MIN_VOL);
		//RemoteControl.MIN_VOL ==>0 그래서 rc.setVolume와 같은 동작을 함
		rc.turnOff();
		RemoteControl.changeBatt();
	}

}
