package lec609;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff() {
		// (1) isPowerOn true false , false true . 의 값이 면 로 면 로 바꾼다

	}

	void volumeUp() {
		if (volume < MAX_VOLUME) {
			volume++;
		}
	}

	void volumeDown() {
		if (volume < MIN_VOLUME) {
			volume--;
		}
	}

	void channelUp() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		channel++;
	}

	void channelDown() {
		if (channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		} else {
			channel--;
		}
	}

}