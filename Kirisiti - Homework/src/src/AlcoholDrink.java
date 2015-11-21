package src;

public abstract class AlcoholDrink implements Drink {

    private String type;
    private static int drinks = 0;
    private double percLevel;

   public AlcoholDrink()
   {
       setType(type);
       setPercLevel(percLevel);
       drinks++;
   }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setPercLevel(double percLevel) {
        this.percLevel = percLevel;
    }
    public double getPercLevel()
    {
        return this.percLevel;
    }
    public String getType()
    {
        return this.type;
    }
    public int getDrinks()
    {
        return drinks;
    }
    public String toString()
    {
        String str = "";
        str += "The drink you have is "+this.getType() +" and you have had "+this.getDrinks();
        return str;
    }
}
