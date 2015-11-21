
public class TestDate {
	public static void main(String[] args)
	{
		Date birthday = new Date(10,26,1996);
		Date today = new Date();
		today.setDay(10);
		today.setMonth(4);
		today.setYear(2015);
		System.out.println("My Birthday is:\n" +birthday.printDate(birthday));
		System.out.println("Today's date is:\n"+today.printDate(today));
	}
}
