/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */
package brother;
import java.io.*;
public class processFile {
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		processFile("scores.txt");
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
