
/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 *
 */
import java.util.Scanner;

public class Basics
{    
    public static void main(String[] args)
    {  
        Scanner obj = new Scanner(System.in);
        int a;
        
        System.out.println("1. Addition\n2. Subtraction \n3. Multiplication\n4. Division");
        System.out.print("Choose any one and enter the number : ");
        a=obj.nextInt();
        
        if(a < 1 || a > 4)       
        {
        	System.out.println("Invalid choice");   
        	System.exit(1);
        }
        
        else
        System.out.print("Enter 1st number : ");
        int b=obj.nextInt();
        
        System.out.print("Enter 2nd number : ");
        int c=obj.nextInt();
            
        switch(a)
        {                
            case 1:
            {
                System.out.println("Addition is "+(b+c));
                break;
            }
            case 2:
            {
                System.out.println("Subtraction is "+(b-c));
                break;
            }
            case 3:
            {
                System.out.println("Multiplication is "+(b*c));
                break;
            }
            case 4:
            {
                System.out.println("Division is "+(b/c));
                break;
            }
        }
    }
}