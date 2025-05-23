package java014_api;

public class Java159_System_arraycopy {

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 2 ,4};
		int[] arr2 = { 6, 3, 9, 7, 8 };
		int[] arr3 = { 4, 2 };
		int[] arr4 = process(arr1, arr2, arr3);
		for (int data : arr4)
			System.out.printf("%4d", data);

	}// end main()

	public static int[] process(int[] arr1, int[] arr2, int[] arr3) {
		int[] data = new int[arr1.length + arr2.length + arr3.length];
		//System.out.println(data.length);
//		for(int i =0; i <arr1.length; i++)
//			data[i] = arr1[i]; 
//		
//        for(int i=0; i<arr2.length; i++)
//        	data[arr1.length + i] =arr2[i];
//        
//        for(int i=0; i<arr3.length; i++)
//        	data[arr1.length + arr2.length + i] = arr3[i];
		
//      System.arraycopy(Object src, int srcPos, Object dest, int destPost,  int length)
		System.arraycopy(arr1, 0, data, 0, arr1.length);
		System.arraycopy(arr2, 0, data, arr1.length, arr2.length);
		System.arraycopy(arr3, 0, data, arr1.length + arr2.length, arr3.length);
		return data;
	}// end process()

}// end class

