/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */
package brother;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class writeToFile {

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		System.out.println("Enter a name for a file:");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		writeToFile(name);
		processFile(name);
		scan.close();
	}
	
	
	public static void writeToFile(String fileName) throws IOException, FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		BufferedWriter outputWriter = new BufferedWriter(new FileWriter(fileName));
		System.out.println("Enter 10 scores 1 at a time.");
		int count = 1;
		String str = "";
		while(count <= 10)
		{
			str = scan.next();
			outputWriter.write(str);
			outputWriter.newLine();
			count++;
		}
		outputWriter.flush();
		outputWriter.close();
		System.out.println("\n\nThe numbers you entered are:");
		scan.close();
	}
	
	public static void processFile (String fileName) throws IOException, FileNotFoundException
	{
		BufferedReader inputReader = new BufferedReader (new InputStreamReader(new FileInputStream(fileName)));
		String line;
		int counter = 0;
		int mean = 0;
		while((line = inputReader.readLine()) != null)
		{
			System.out.println(Integer.parseInt(line));
			counter++;
			mean += Integer.parseInt(line);
		}
		inputReader.close();
		System.out.println("The mean is: "+mean/counter);
	}
}
