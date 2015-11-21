import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author Willie Ausrotas <wausrotas@gmail.com> 
 * Student Number: 7804922
 * Assignment: HF
 * Section: ITI1121 - A
 */

class Assignment4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car1 c2 = new Car1("Toyota", "Camry", "2015");
		Car1 c3 = new Car1("Lamborghini", "Diablo", "1998", 530.0, 2, "MT", "Black", true, 380000.00);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	}

}

class Car1 {
	private  static int numberOfCars = 0;
	private String company;
	private String modelName;
	private String modelYear;
	private double hp;
	private int doors;
	private String gears;
	private String color;
	private boolean racingCar;
	private double price;

	/**
	 * Constructor 1 - Default values for everything
	 */
	public Car1() {
		setCompanyName("-EMPTY-");
		setModelName("-EMPTY-");
		setModelYear("-EMPTY-");
		setHorsepower(-1);
		setNumberOfDoors(-1);
		setTypeOfGearBox("-EMPTY-");
		setColorOfCar("-EMPTY-");
		setTypeOfCar(false);
		setPriceOfCar(-1);
		numberOfCars += 1;
	}

	/**
	 * Constructor 2 - Company name, model type and year will be declared.
	 * 
	 * @param companyName
	 * @param modelName
	 * @param modelYear
	 */
	public Car1(String companyName, String modelName, String modelYear) {
		setCompanyName(companyName);
		this.setModelName(modelName);
		this.setModelYear(modelYear);
		setHorsepower(-1);
		setNumberOfDoors(-1);
		setTypeOfGearBox("-EMPTY-");
		setColorOfCar("-EMPTY-");
		setTypeOfCar(false);
		setPriceOfCar(-1);
		numberOfCars += 1;
	}

	/**
	 * 
	 * @param companyName
	 * @param modelName
	 * @param modelYear
	 * @param horsepower
	 * @param numberOfDoors
	 * @param typeOfGearBox
	 * @param color
	 * @param racingCar
	 * @param price
	 */
	public Car1(String companyName, String modelName, String modelYear,
			double horsepower, int numberOfDoors, String typeOfGearBox,
			String color, boolean racingCar, double price) {

		setCompanyName(companyName);
		this.setModelName(modelName);
		this.setModelYear(modelYear);
		setHorsepower(horsepower);
		setNumberOfDoors(numberOfDoors);
		setTypeOfGearBox(typeOfGearBox);
		this.setColorOfCar(color);
		this.setTypeOfCar(racingCar);
		this.setPriceOfCar(price);
		numberOfCars += 1;
	}

	/**
	 * @return the company
	 */
	public String getCompanyName() {
		return company;
	}

	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * @return the modelYear
	 */
	public String getModelYear() {
		return modelYear;
	}

	/**
	 * @return the hp
	 */
	public double getHorsepower() {
		return hp;
	}

	/**
	 * @return the doors
	 */
	public int getNumberOfDoors() {
		return doors;
	}

	/**
	 * @return the gears
	 */
	public String getGearsType() {
		return gears;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the racingCar
	 */
	public boolean isRacingCar() {
		return racingCar;
	}

	/**
	 * @return the price
	 */
	public double getPriceCar() {
		return price;
	}

	/**
	 * @return the numberOfCars
	 */
	public int getTotalNumberOfCars() {
		return numberOfCars;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompanyName(String company) {
		this.company = company;
	}

	/**
	 * @param modelName
	 *            the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * @param modelYear
	 *            the modelYear to set
	 */
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	/**
	 * @param hp
	 *            the hp to set
	 */
	public void setHorsepower(double hp) {
		this.hp = hp;
	}

	/**
	 * @param doors
	 *            the doors to set
	 */
	public void setNumberOfDoors(int doors) {
		this.doors = doors;
	}

	/**
	 * @param gears
	 *            the gears to set
	 */
	public void setTypeOfGearBox(String gears) {
		this.gears = gears;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColorOfCar(String color) {
		this.color = color;
	}

	/**
	 * @param racingCar
	 *            the racingCar to set
	 */
	public void setTypeOfCar(boolean racingCar) {
		this.racingCar = racingCar;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPriceOfCar(double price) {
		this.price = price;
	}

	public String toString() {
		String result;
		NumberFormat f = new DecimalFormat("$###,###,###,###,#00.00");
		if (getTotalNumberOfCars() > 0) {
			String typeOfCar;
			if (this.isRacingCar()) {
				typeOfCar = "racing car";
			} else {
				typeOfCar = "family car";
			}
			StringBuilder str = new StringBuilder();
			str.append("****************************************************\n");
			str.append("*Here is the whole information for your desire car *\n");
			str.append("****************************************************\n");
			str.append("Total Number of cars to show:" + numberOfCars + " *\n");
			str.append("********************************\n");
			str.append("   -Car Company: " + this.getCompanyName()+"\n");
			str.append("   -Name and Model of the car: " + this.getModelName()+"\n");
			str.append("   -Model Year of the car: " + this.getModelYear()+"\n");
			str.append("   -With the horsepower of: " + this.getHorsepower()+"\n");
			str.append("   -This car has " + this.getNumberOfDoors()
					+ " number of doors.\n");
			str.append("   -This car has the " + this.getGearsType()
					+ " type of gearbox.\n");
			str.append("   -The color of this car is: " + this.getColor()+"\n");
			str.append("   -The type of car is " + typeOfCar+"\n");
			str.append("   -This car is for the price of: "
					+ f.format(this.getPriceCar())+"\n");
			str.append("****************************************************\n");
			result = str.toString();
			numberOfCars--;
		}
		else
		{
			result = ("There is no more cars to show.");
		}
		return result;
	}

}
