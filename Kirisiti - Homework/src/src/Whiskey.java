package src;

public class Whiskey extends AlcoholDrink {

    private String liquor = "Whiskey";
    private double percAlcohol = 0.35;
    private int beverage = 2;

    @Override
    public String toString() {
        return liquor;
    }

    public int getDrinks() {
        return beverage;
    }

    public String getType() {
        return this.liquor;
    }


    public double getPercLevel() {
        return this.percAlcohol;
    }
}
