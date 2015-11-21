import java.io.*;

public class Rectangle2 {
	public static void main(String args[]) throws IOException {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int a, b;
		System.out.println("Enter the two unequal positive numbers");
		a = Integer.parseInt(in.readLine());
		b = Integer.parseInt(in.readLine());
		
		if(a < 0 || b < 0)
		{
			System.out.println("Can't sqaure root neg nums.");
		}
		else if(Math.round(Math.sqrt(a))==Math.sqrt(a) && Math.round(Math.sqrt(b))==Math.sqrt(b)) {
			System.out.println("Both "+a+" & "+b+" are perfect sqaures.");
		}
		else if(Math.round(Math.sqrt(a))==Math.sqrt(a)) {
			System.out.println("The number "+a+" is a perfect sqaure but "+b+" is not.");
		}
		else if(Math.round(Math.sqrt(b))==Math.sqrt(b)) {
			System.out.println("The number "+b+" is a perfect square but "+a+" is not.");
		}
		else {
			System.out.println("Neither are perfect sqaures.");
		}
	}
}