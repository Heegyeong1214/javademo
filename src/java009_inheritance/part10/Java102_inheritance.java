package java009_inheritance.part10;

/*
---TV 현재 상태---
전원:true
채널:8
볼륨:10
****************************************
---TV 현재 상태---
전원:true
채널:10
볼륨:15
IP:192.68.24.1
* 
*/

public class Java102_inheritance {

	public static void main(String[] args) {
		BasicTv bTv = new BasicTv();
		bTv.isPowerOn = true;
		bTv.channel = 8;
		bTv.volume = 10;
		bTv.display();

		System.out.println("****************************************");

		SmartTv sTv = new SmartTv();
		sTv.isPowerOn = true;
		sTv.channel = 10;
		sTv.volume = 15;
		sTv.ip = "192.68.24.1";
		sTv.display();
	}// end main()

}// end class





