public class Whiskey extends AlcoholDrink  {

    private String liquor = "Whiskey";
    private double percAlcohol = 0.35d;
    private int beverage = 2;

    @Override
    public String toString() {
        return liquor;
    }

    public int getCount() {
        return beverage;
    }
}
