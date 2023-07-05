
// abstact window toolkit
import java.awt.event.WindowAdapter;	// 윈도우 이벤트를 위한 추상 클래스
import java.awt.event.WindowEvent;

class EventHandler extends WindowAdapter {
	
	@Override
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}

