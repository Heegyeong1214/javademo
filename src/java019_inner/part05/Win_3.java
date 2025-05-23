package java019_inner.part05;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class WinTest_3 extends Frame {
	public WinTest_3() {
		setSize(500, 500);
		setVisible(true);
		// 대상.addXXXListener(이벤트객체)
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}	
}// end WinTest_3

public class Win_3 {

	public static void main(String[] args) {
		new WinTest_3();
	}
}
