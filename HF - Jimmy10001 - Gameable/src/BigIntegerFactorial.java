import java.math.BigInteger;

/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */

public class BigIntegerFactorial {
	/**
	 * Since we are only using a int, the numbers to get to large and therefor to prevent crashing,
	 * Java will turn them into neg numbers.
	 */
	public static void factorial() {
		int n = 1;
		int count = 1;
		while (n <= 30) {
			if (n == 1) {
				System.out.println(count);
			} else {
				for (int i = n - 1; i > 0; i--) {
					count *= i;
				}
				System.out.println(count);
			}
			n++;
			count = 1;
		}

	}
	
	public static BigInteger factorialBig(int n)
	{
		BigInteger result = BigInteger.valueOf(n);
		for(int i = n-1;i>0;i--)
		{
			result = BigInteger.valueOf(n *= i);
		}
		return result;
	}

	public static void main(String[] args) {
		//factorial();
		System.out.println(factorialBig(30));
		//You can make the BigInt extremely large as there is no cap on it.
		//From research I have done, I believe the max value is around (2^32)^Integer.MAX_VALUE;
		System.out.println(BigInteger.valueOf((long) Math.pow(Math.pow(2, 32), Integer.MAX_VALUE))); 
		//Thus this is the max value of BigInteger.
	}
}
