/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */

public class MathTables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out
				.println("********************************************************");
		System.out.println("\t\tLog Table");
		System.out
				.println("********************************************************");
		printCommonLogTable();
		System.out
				.println("********************************************************");
		System.out.println("\t\tAddition Table");
		System.out
				.println("********************************************************");
		printAdditionTable();
		System.out
				.println("********************************************************");
		System.out.println("\t\tTrig Table");
		System.out
				.println("********************************************************");
		printTrigTable();
	}

	public static void printCommonLogTable() {
		double num = 0;
		System.out.println("Value of N:\t\tResult:");

		while (num <= 10) {
			System.out.println(num + "\t\t\t" + Math.log10(num));
			num += 0.5;
		}
	}

	public static void printAdditionTable() {
		int num = 0;
		printFirstRow(num);
		for (int i = 0; i <= 12; i++) {
			System.out.print(num + "\t");
			for (int j = 0; j <= 12; j++) {
				if (num + j >= 10 && num > 0) {
					System.out.print(num + j + " ");
				} else if (num == 0 && j >= 10) {
					System.out.print(num + j + " ");
				} else {

					System.out.print(num + j + "  ");
				}
			}
			System.out.println();
			num++;
		}

	}

	private static void printFirstRow(int n) {
		System.out.print("\t");

		for (int i = 0; i <= 12; i++) {
			if (n >= 10) {
				System.out.print(n + " ");
			} else {
				System.out.print(n + "  ");
			}
			n++;
		}
		System.out.println();
	}
	
	public static void printTrigTable()
	{
		double degree = 0;
		System.out.println("Angle:\t\t\tSin:\t\t\tCos:\t\t\tTan:");
		while(degree <= 360)
		{
			double radian;
			radian = degree *(Math.PI/180);
			System.out.print(degree + "\t\t");
			if(degree == 0)
			{
				System.out.println("\t"+Math.sin(radian) +"\t\t\t"+Math.cos(radian)+"\t\t\t"+Math.tan(radian));
			}
			else if(Math.sin(radian) == 1.0 || Math.sin(radian) == -1.0 || Math.sin(radian) == 0.0)
			{
				System.out.println("\t"+Math.sin(radian) +"\t\t"+Math.cos(radian)+"\t"+Math.tan(radian));
			}
			else if(Math.cos(radian) == 1.0 || Math.cos(radian) == -1.0)
			{
				System.out.println(Math.sin(radian) +"\t\t"+Math.cos(radian)+"\t\t"+Math.tan(radian));
			}
			else
			{
			System.out.println(Math.sin(radian) +"\t"+Math.cos(radian)+"\t"+Math.tan(radian));
			}
			degree += 30;
		}
	}

}
