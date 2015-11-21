/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */
package brother;

public class Date {
	private int year;
	private int month;
	private int day;
	
	Date()
	{
		this.setYear(2015); //Sets the dates to default value
		this.setMonth(1);
		this.setDay(1);
	}
	
	Date(int month, int day, int year)
	{
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
		
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
	public String printDate(Date date)
	{

		String str = "";
		str += "The day is "+day;
		str += "\nThe month is "+month;
		str += "\nThe year is "+year;
		return str;
		
	}
	
}
