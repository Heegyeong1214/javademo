package java019_inner.part05;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WinTest_2 extends Frame {
	public WinTest_2() {
		setSize(500, 500);
		setVisible(true);
		// 대상.addXXXListener(이벤트객체)
		this.addWindowListener(new AdapterExit());
	}
	
	//내부클래스
	class AdapterExit extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}// end WinTest_2

public class Win_2 {

	public static void main(String[] args) {
		new WinTest_2();
	}
}
