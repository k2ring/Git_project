package chapter7_3;


import java.awt.Frame;
//abstract window toolkit
import java.awt.event.WindowAdapter; //윈도우 이벤트를 위한 추상 클래스
import java.awt.event.WindowEvent;

//class EventHandler extends WindowAdapter {
//	@Override
//	public void windowClosing(WindowEvent e) {
//		e.getWindow().setVisible(false);
//		e.getWindow().dispose();
//		System.exit(0);
//	}
//}


public class Exercise7_28 {

	public static void main(String[] args) {
		Frame f=new Frame();
//		f.addWindowListener(new EventHandler());
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});

	}

}
