package java019_inner.part05;


import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WinTest_1 extends Frame{
	public WinTest_1() {
		setSize(500, 500);
		setVisible(true);
		//대상.addXXXListener(이벤트객체)
		this.addWindowListener(new WindowExit());
	}
	
	//내부클래스
	class WindowExit implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			//시스템 종료
			System.exit(0);
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub		
		}
		
	}//end windowExit()
}//end WinTest_1



public class Win_1 {

	public static void main(String[] args) {
	 new WinTest_1();

	}//end main

}//end class
