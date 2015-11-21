
public class Booking {
	private int id;
	private String month;
	private int day;
	private int numOfDays;
	private String typeOfRoom;
	private int amount;
	private String name;
	private int roomNum;
	
	public Booking(int id, String month, int day, int numOfDays, String typeOfRoom, int amount, String name, int roomNum)
	{
		this.setId(id);
		this.setMonth(month);
		this.setDay(day);
		this.setNumOfDays(numOfDays);
		this.setTypeOfRoom(typeOfRoom);
		this.setAmount(amount);
		this.setName(name);
		this.roomNum = roomNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}

	public String getTypeOfRoom() {
		return typeOfRoom;
	}

	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
