import java.util.Scanner;

/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */

public class MathTablesSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int choice;
		System.out.println("1. Log Tables.\n2. Addition Tables.\n3. Sin Tables.\n4. Cos Tables.\n5. Tan Tables.");
		System.out.println("Enter the option you would like:");
		choice = scan.nextInt();
		switch(choice) {
		case 1:
			printCommonLogTable();
			break;
		case 2:
			printAdditionTable();
			break;
		case 3:
			printSinTable();
			break;
		case 4:
			printCosTable();
			break;
		case 5:
			printTanTable();
			break;
		default:
			System.out.println("Invalid choice.");
			break;
		}
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
	
	public static void printSinTable(){
		double degree = 0;
		System.out.println("Angle:\t\t\tSin:");
		while(degree <= 360)
		{
			double radian;
			radian = degree *(Math.PI/180);
			System.out.print(degree + "\t\t");
			if (degree == 0 || degree == 90 || degree == 270)
			{
				System.out.println("\t"+Math.sin(radian));
			}
			else
			{
				System.out.println(Math.sin(radian));
			}
			degree += 30;
		}
	}
	
	public static void printCosTable(){
		double degree = 0;
		System.out.println("Angle:\t\t\tCos:");
		while(degree <= 360)
		{
			double radian;
			radian = degree *(Math.PI/180);
			System.out.print(degree + "\t\t");
			if (degree == 0 || degree == 180 || degree == 360)
			{
				System.out.println("\t"+Math.cos(radian));
			}
			else
			{
				System.out.println(Math.cos(radian));
			}
			degree += 30;
		}
	}
	
	public static void printTanTable(){
		double degree = 0;
		System.out.println("Angle:\t\t\tTan:");
		while(degree <= 360)
		{
			double radian;
			radian = degree *(Math.PI/180);
			System.out.print(degree + "\t\t");
			if (degree == 0)
			{
				System.out.println("\t"+Math.tan(radian));
			}
			else
			{
				System.out.println(Math.tan(radian));
			}
			degree += 30;
		}
	}

}
