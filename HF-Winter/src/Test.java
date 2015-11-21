import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        while(n < 5 || n > 10){ //While the number is below 5 or above 10 do this

            while(!input.hasNextInt()){ //while the input doesnt have an int, try next token
                System.out.println("Not an integer");
                input.next();
            }
            System.out.println("number is not in the range 5-10");
            n = input.nextInt();

    }
        System.out.println("number is " + n);
    }
}