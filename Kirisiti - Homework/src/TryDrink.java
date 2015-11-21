public class TryDrink {

    public static void main(String[] args) {
        // Creating an array with room for four drinks
        Drink[] myDrinks = new Drink[4];

        // Populating the array with alternating types of drinks
        myDrinks[0] = new Vodka();
        myDrinks[1] = new Whiskey();
        myDrinks[2] = new Vodka();
        myDrinks[3] = new Whiskey();

        // Printing the array to System.out for verification
        for(int i = 0; i < myDrinks.length; i++) {
            System.out.println("The drink at index " + i + " of myDrinks[] is " + myDrinks[i] + " and is also an " + myDrinks[i].getType());
        }
    }
}
