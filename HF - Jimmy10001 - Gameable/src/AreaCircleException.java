import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */

public class AreaCircleException {
	public static double distance(double x1, double y1, double x2, double y2) {
		double dy = y2 - y1; // int - int
		double dx = x2 - x1; // int - int
		double dsquared = dx * dx + dy * dy; // squared
		double result = Math.sqrt(dsquared);
		return result; // return
	}

	public static double distance(int x1, int x2, int y1, int y2) {
		double dy = y2 - y1; // int - int
		double dx = x2 - x1; // int - int
		double dsquared = dx * dx + dy * dy; // squared
		double result = Math.sqrt(dsquared);
		return result; // return
	}

	public static int getScannerInt(String promptStr)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(promptStr);
		boolean flag = false;
		boolean negNum = false;
		int result = 0;
		while(!flag)
		{
			try{
				result = Integer.parseInt(scan.next());
				flag = true;
			}catch(NumberFormatException e)
			{
				System.out.println("Enter a valid number.");
			}

		}
		return result;
	}
	public static void main(String[] args) {
		int x1 = getScannerInt("Enter x1");
		int x2 = getScannerInt("Enter x2");
		int y1 = getScannerInt("Enter y1");
		int y2 = getScannerInt("Enter y2");
		System.out.println(distance(x1,x2,y1,y2));
	}
}
