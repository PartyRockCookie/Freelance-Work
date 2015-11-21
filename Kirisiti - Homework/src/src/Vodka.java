package src;

public class Vodka extends AlcoholDrink {

    private String liquor = "Vodka";
    private double percAlcohol = 0.40d;
    private int beverage = 2;

    @Override
    public String toString() {
        return liquor;
    }

    public int getDrinks() {
        return beverage;
    }
    public double getPercLevel()
    {
        return this.percAlcohol;
    }
    public String getType()
    {
        return this.liquor;
    }
}
