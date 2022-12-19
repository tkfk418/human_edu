package Human01;

public class Audio implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("audio를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("audio를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume=volume;
		System.out.printf("audio볼륨 : %d \n",this.volume);
	}
	
}
