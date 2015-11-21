class TwoVehicles {
    public static void main(String args[]) {
        
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range, range2;  

        // assign values to fields in minivan
        minivan.passengers = 7; 
        minivan.fuelcap = 16; 
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14; 
        sportscar.mpg = 12;

        // compute the range assuming a ful tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minican can carry " + minivan.passengers + " with a range of " + range);
    
        range2 = sportscar.fuelcap * minivan.mpg; 
        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of" + range2);
    }
}