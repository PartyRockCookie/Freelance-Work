import java.util.Scanner;

/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */

public class Prog6_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();
		System.out.println("The result is "+factorial(n));

	}
	
	public static int factorial(int n)
	{
		for(int i = n-1;i>0;i--)
		{
			n *= i;
		}
		return n;
	}

}
