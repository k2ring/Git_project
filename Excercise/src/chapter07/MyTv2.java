package chapter07;

public class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	private int prevChannel; // (previous channel) 
	
	
	
	
	
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	void setChannel(int channel) {

		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
			return;
		}
		prevChannel=this.channel;
		this.channel = channel;
	}

	int getChannel() {
		return channel;
	}

	void gotoPrevChannel(){
		setChannel(prevChannel);
	}


}

