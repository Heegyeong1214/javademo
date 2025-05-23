package java007_class.part03;

//10  +  3 = 13
//3  -  2 =  1
//5  *  4 = 20
public class Java077_class {

	public static void main(String[] args) {
		Calc[] info = new Calc[3];
		info[0] = new Calc(10,3,'+');
		info[1] = new Calc(3,2,'-');
		info[2] = new Calc(5,4,'*');
		
		display(info);
	}
	public static void display(Calc[] info) {
			
			for(int i =0; i < info.length; i++) {
				System.out.println(info[i].toString());
			}

	}//end display

}//end class





//for(int i=0; i <info.length; i++) {
//	System.out.println(info[i].toString());