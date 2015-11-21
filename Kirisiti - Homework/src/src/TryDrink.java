package src;
import java.util.Scanner;

public class TryDrink {

    public static void main(String[] args) {
        // Creating an array with room for four drinks
        Drink[] myDrinks = new Drink[4];
        Scanner scan = new Scanner(System.in);
        // Populating the array with alternating types of drinks
        myDrinks[0] = new Vodka();
        myDrinks[1] = new Whiskey();
        System.out.println("What drink would you like? Whiskey or Vodka?");
        String drink = scan.nextLine();
        if(drink.equalsIgnoreCase("Whiskey"))
        {
            myDrinks[2] = new Whiskey();
        }
        else{
            myDrinks[2] = new Vodka();
        }
        System.out.println("What drink would you like? Whiskey or Vodka");
        String secondDrink = scan.nextLine();
        if(secondDrink.equalsIgnoreCase("Whiskey"))
        {
            myDrinks[3] = new Whiskey();
        }
        else {
            myDrinks[3] = new Vodka();
        }
        // Printing the array to System.out for verification
        for(int i = 0; i < myDrinks.length; i++) {
            System.out.println("The drink at index " + i + " of myDrinks[] is " + myDrinks[i] + " and the percentage level is "+myDrinks[i].getPercLevel());
        }
    }
}
