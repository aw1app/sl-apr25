
public class DataTypesDemo {

	static boolean isStockAvailable;
	
	static char c1 = '\u0AA8';
	
	static long distanceToMars = 10000000000000000L;
	
	static String greeting; // null
	
	static int[] intArr1;
	static int[] intArr2 = { 23, 56 } ;

	public static void main(String[] args) {

		System.out.println("isStockAvailable = " + isStockAvailable);
		
		System.out.println("c1 = " + c1);
		
		
		// print the values of non-primitives	
		
		System.out.println("greeting = " + greeting);
		System.out.println("intArr1 = " + intArr1);
		
		System.out.println("intArr2 = " + intArr2);
		for (int i=0 ; i < intArr2.length; i++) {
			System.out.println("intArr2[" + i + " ] = " + intArr2[i]);
		}

	}

}
