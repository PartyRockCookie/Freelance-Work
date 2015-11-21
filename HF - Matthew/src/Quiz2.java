/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 * Student Number: 7804922
 * Assignment: 
 * Section: ITI1121 - A
 */

public class Quiz2 {
	public static void resize(int[] array, int newSize) {
	    int[] result = new int[newSize];
	    for (int i = 0; i < newSize; i++) {
	        result[i] = array[i];
	    }
	    array = result;
	}
	
	public static void main(String[] args)
	{
		int[] a = { 1, 2, 3};
		resize(a, 2);
		for (int i = 0; i < a.length; i++) {
		    System.out.print(a[i]);
		}
		
		String[] temp = {};
		if(temp[0] == "i")
		{
			int test = 1;
		}
	}
}
