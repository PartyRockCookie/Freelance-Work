/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Assignment5 {
	public static void main(String anythingIsPossible[]) {
		// Since we are only using the third constructor,
		// Did not see a point in useless code.
		Car one = new Car("Lamborghini", "Diablo", "1998", 530.0, 2, "MT",
				"Black", true, 380000);
		Car two = new Car("Lamborghini", "Galardo", "2013", 550.0, 2, "MT",
				"Yellow", true, 655000.00);
		Car three = new Car("Lamborghini", "Reventon", "2015", 700.0, 2, "MT",
				"Red", true, 1000000.00);

		Car[] carArray = { one, two, three }; // As you add more cars, you must
												// add them to this array.

		Car.print(carArray); // Made method static since we want the array as an
								// argument not a reference.
		Car.userInput(carArray);

	}

}

class Car {
	private static int numberOfCars = 0; // This is your global variable. see
											// the static after private.
	private String company;
	private String modelName;
	private String modelYear;
	private String gears; // either AT (Auto Transmission)or MT (Manual
							// Transmission)
	private String color;
	private int doors;
	private double hp; // horsepower
	private double price;
	private boolean racingCar; // default must be false

	public Car() // First constructor
	{
		this.company = "--EMPTY--";
		this.modelName = "--EMPTY--";
		this.modelYear = "--EMPTY--";
		this.hp = -1;
		this.doors = -1;
		this.gears = "--EMPTY--";
		this.color = "--EMPTY--";
		this.racingCar = false;
		this.price = -1;
		numberOfCars++;
	}

	public Car(String companyName, String modelName, String modelYear) // Second
																		// constructor
	{
		this.company = companyName;
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.hp = -1;
		this.doors = -1;
		this.gears = "--EMPTY--";
		this.color = "--EMPTY--";
		this.racingCar = false;
		this.price = -1;
		numberOfCars++;

	}

	public Car(String companyName, String modelName, String modelYear,
			double horsepower, int numberOfDoors, String typeOfGearBox,
			String color, boolean racingCar, double price) // Third constructor
	{
		this.company = companyName;
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.hp = horsepower;
		this.doors = numberOfDoors;
		this.gears = typeOfGearBox;
		this.color = color;
		this.racingCar = racingCar;
		this.price = price;
		numberOfCars++;

	}

	public void setCompanyName(String companyName) {
		this.company = companyName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public void setHorsepower(double horsepower) {
		this.hp = horsepower;
	}

	public void setNumberOfDoors(int quantity) {
		this.doors = quantity;
	}

	public void setTypeOfGearBox(String type) {
		this.gears = type;
	}

	public void setColorOfCar(String color) {
		this.color = color;
	}

	public void setTypeOfCar(boolean typeOfCar) {
		this.racingCar = typeOfCar;
	}

	public void setPriceOfCar(double price) {
		this.price = price;
	}

	public String getTypeOfCar() {
		String result = "";
		if (this.racingCar == false && !this.company.equalsIgnoreCase("empty")) {
			result = "family car";
		} else if (this.racingCar == true) {
			result = "racing car";
		} else {
			result = "--EMPTY--";
		}

		return result;
	}

	public String getCompanyName() {

		return this.company;
	}

	public String getModelName() {

		return this.modelName;
	}

	public String getModelYear() {
		return this.modelYear;
	}

	public double getHorsepower() {

		return this.hp;
	}

	public int getNumberOfDoors() {

		return this.doors;
	}

	public String getGearsType() {

		return this.gears;
	}

	public String getColor() {
		return this.color;
	}

	public boolean isRacingCar() {

		return this.racingCar;
	}

	public double getPriceCar() {

		return this.price;
	}

	public int getTotalNumberOfCars() {
		return numberOfCars;
	}

	public String toString() {
		DecimalFormat printDollar = new DecimalFormat("$0,000.00");
		String yourObject = "";
		String asking = getTypeOfCar();
		yourObject = "****************************************************\n"
				+ "*Here is the whole information for your desire car *\n"
				+ "****************************************************\n"
				+ "Total Number of cars to show:"
				+ numberOfCars
				+ " *\n"
				+ "********************************\n"
				+ "   -Car Company: "
				+ this.company
				+ "\n"
				+ "   -Name and Model of the car: "
				+ this.modelName
				+ "\n"
				+ "   -Model Year of the car: "
				+ this.modelYear
				+ "\n"
				+ "   -With the horsepower of: "
				+ this.hp
				+ "\n"
				+ "   -This car has "
				+ this.doors
				+ " number of doors\n"
				+ "   -This car has the "
				+ this.gears
				+ " type of gearbox\n"
				+ "   -The color of this car is: "
				+ this.color
				+ "\n"
				+ "   -The type of this car is "
				+ asking
				+ "\n"
				+ "   -This car is for the price of: "
				+ printDollar.format(this.price)
				+ "\n"
				+ "****************************************************\n\n\n";
		numberOfCars--;
		if (numberOfCars == 0) // You can also write this as a method and call
								// it here.
		{
			yourObject = yourObject + "There is no more case to show\n";
		}
		return yourObject;
	}

	public static void print(Car[] myArr) // Static so we can call it without
											// using a object.
	{
		for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] != null) {
				System.out.println(myArr[i].toString());
			}
		}
	}

	public static void userInput(Car[] myArr) {
		boolean flag = false;
		String response = JOptionPane
				.showInputDialog("Are you interested to buy any of the listed cars? Yes or No please.");
		if (response.equalsIgnoreCase("yes")) {
			String model = JOptionPane
					.showInputDialog("What model are you interested in?");
			for (int i = 0; i < myArr.length; i++) {
				if (myArr[i].getModelName().equalsIgnoreCase(model)) {
					JOptionPane.showMessageDialog(null, model
							+ " has been found and sold!", "Success!",
							JOptionPane.INFORMATION_MESSAGE);
					flag = true;
					break;

				}
			}
			if (flag) {
				numberOfCars = 0;
				for (int i = 0; i < myArr.length; i++) {
					if (!myArr[i].getModelName().equalsIgnoreCase(model)) {
						numberOfCars++;
					}
				}
				Car tempCar[] = new Car[numberOfCars];
				int count = 0;
				for (int i = 0; i < myArr.length; i++) {
					if (!myArr[i].getModelName().equalsIgnoreCase(model)) {
						tempCar[count] = myArr[i];
						count++;
					}
				}
				myArr = tempCar;

				if (numberOfCars > 0) {
					print(myArr);
					userInput(myArr);
				} else {
					JOptionPane.showMessageDialog(null,
							"All cars have been sold! Have a great day!",
							"Error", JOptionPane.ERROR_MESSAGE);
				}

			}
			else {
				JOptionPane.showMessageDialog(null,
						"Car not found.",
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		}

		else {
			JOptionPane.showMessageDialog(null, "Goodbye.", "Goodbye.",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
