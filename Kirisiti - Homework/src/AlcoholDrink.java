public abstract class AlcoholDrink implements Drink {

    private String type = "Alcoholic Drink";
    private int drinks = 0;

    AlcoholDrink() {
        setType(type);
        drinks += 1;
    }

    public int getDrinks() {
        return drinks;
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}
