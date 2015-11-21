/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */
package brother;

import java.util.Random;

public class selectionSort {

	public static void main(String[] args)
	{
		int[] myArr = randomIntArray(50);
		for(int i = 0;i<myArr.length;i++)
		{
			System.out.println(myArr[i]);
		}
	}
	
	
	
	public static int randomInt(int low, int high)
	{
		Random rn = new Random();
		return rn.nextInt((high - low)+1) + low;
	}
	
	public static int[] randomIntArray(int size)
	{
		int[] myArr = new int[size];
		for(int i = 0;i<myArr.length;i++)
		{
			myArr[i] = randomInt(-5, 15);
		}
		return myArr;
	}
	
	public static int indexOfMaxRange(int[] rand, int high, int low)
	{
		int max = 0;
		int index = 0;
		for(int i = 0;i<rand.length;i++)
		{
			if(rand[i] <= high)
			{
				max = rand[i];
				index = i;
				break;
			}
		}
		
		for(int i = 0;i<rand.length;i++)
		{
			if(rand[i] > max && rand[i] <= high)
			{
				max = rand[i];
				index = i;
			}
		}
		
		return index;
	}
}
