/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */

public class BottlesOfBeer {
	public static int bottlesOfBeer(int n)
	{

		if(n == 0)
		{
			System.out.println("No bottles of beer on the wall, no bottles of beer, ya' can't take one down, ya' can't pass it around,\n'cause there are no more botles of beer on the wall!");
			return 0;
		}
		else
		{
			System.out.println(n +" bottles of beer on the wall, "+n+" bottles of beer, ya' take one down, ya' pass it around, "+(n-1)+" bottles of beer on the wall");
			return bottlesOfBeer(n-1);
		}
	}

	public static void main(String[] args)
	{
		bottlesOfBeer(99);
	}
}
