package lec609;

public class Ex6_21 {

	public static void main(String[] args) {

		MyTv t = new MyTv();

		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);

		
		t.channelDown();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
	}

}
