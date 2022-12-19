package Human28;

public class MyTvExam {

	public static void main(String[] args) {
		MyTv_final t = new MyTv_final();
		
		t.channel =100;
		t.volume =0;
		System.out.println("CH:"+t.channel+",VOL:"+t.volume);

	t.channelDown();
	t.volumeDown();
	System.out.println("CH:"+t.channel+",VOL:"+t.volume);

	t.volume=100;
	t.channelUp();
	t.volumeUp();
	System.out.println("CH:"+t.channel+",VOL:"+t.volume);

	t.channelUp();
	System.out.println("CH:"+t.channel+",VOL:"+t.volume);
	t.channelUp();
	System.out.println("CH:"+t.channel+",VOL:"+t.volume);

	
	}

}
