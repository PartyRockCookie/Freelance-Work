
public class Hotel {
	private String name;
	private int roomNum;
	private int capacity;
	private int id;
	private String month;
	private int startDate;
	private int numOfDays;
	private String type;
	private boolean taken;
	
	public Hotel(String name, int roomNum, int capacity, boolean taken)
	{
		this.setName(name);
		this.setRoomNum(roomNum);
		this.setCapacity(capacity);
		this.setTaken(taken);
	}
	public Hotel(String name, int roomNum, int id, String month, int startDate, int numOfDays)
	{
		this.setName(name);
		this.setRoomNum(roomNum);
		this.setId(id);
		this.setMonth(month);
		this.setStartDate(startDate);
		this.setNumOfDays(numOfDays);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * @return the startDate
	 */
	public int getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the numOfDays
	 */
	public int getNumOfDays() {
		return numOfDays;
	}
	/**
	 * @param numOfDays the numOfDays to set
	 */
	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString()
	{
		String str = "";
		str += this.getName();
		str += " "+this.getRoomNum();
		str += " "+this.getMonth();
		str += " "+this.getStartDate();
		str += " "+this.getNumOfDays();
		return str;
	}
	/**
	 * @return the taken
	 */
	public boolean isTaken() {
		return taken;
	}
	/**
	 * @param taken the taken to set
	 */
	public void setTaken(boolean taken) {
		this.taken = taken;
	}
}
