import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelBookingSystem {

	private static List<Hotel> open = new ArrayList<Hotel>();
	private static List<Hotel> bookings = new ArrayList<Hotel>();

	public static void main(String[] args) {
		int counter = 0;
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader(args[0]));
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] details = line.split(" ");
				String command = details[0];
				if (command.equalsIgnoreCase("Hotel")) {
					String name = details[1];
					int roomNum = Integer.parseInt(details[2]);
					int capacity = Integer.parseInt(details[3]);
					Hotel hotel = new Hotel(name, roomNum, capacity, false);
					open.add(hotel);
				}
				else if(command.equalsIgnoreCase("Booking"))
				{
					int id = Integer.parseInt(details[1]);
					String month = details[2];
					int day = Integer.parseInt(details[3]);
					int length = Integer.parseInt(details[4]);
					String type = details[5];
					boolean flag = addBooking(id, month, day, length, type);
					boolean second = false;
					boolean third = false;
					System.out.println(flag);
					if(details[7].equalsIgnoreCase("Single") || details[7].equalsIgnoreCase("Double") || details[7].equalsIgnoreCase("Triple"))
					{
						second = addBooking(id,month,day,length,details[7]);
					}
					if(details[8].equalsIgnoreCase("Single") || details[8].equalsIgnoreCase("Double") || details[8].equalsIgnoreCase("Triple"))
					{
						third = addBooking(id,month,day,length,details[8]);
					}
					if(flag && !second)
					{
						System.out.println(open.get(counter).getName() + " " + open.get(counter).getRoomNum());
						counter++;
					}
					else if(flag && second && !third)
					{
						System.out.println(open.get(counter).getName() + " " + open.get(counter).getRoomNum() + " " +open.get(counter+1).getRoomNum());
						counter+=2;
					}
					else if(flag && second && third)
					{
						System.out.println(open.get(counter).getName() + " " + open.get(counter).getRoomNum()  + " "+open.get(counter+1).getRoomNum() + " "+open.get(counter+2).getRoomNum());
						counter+=3;
					}
					else
					{
						System.out.println("Booking rejected.");
					}
					
				}
				else if(command.equalsIgnoreCase("Change"))
				{
					int id = Integer.parseInt(details[1]);
					if(checkBookingId(id))
					{
						String hotelName = "";
						int roomNum = 0;
						for(int i = 0;i<bookings.size();i++)
						{
							int remove = bookings.get(i).getId();
							if(remove == id)
							{
								hotelName = bookings.get(i).getName();
								roomNum = bookings.get(i).getRoomNum();
								bookings.remove(i);
								counter--;
							}
						}
						freeSpace(hotelName, roomNum);
						
						String month = details[2];
						int day = Integer.parseInt(details[3]);
						int length = Integer.parseInt(details[4]);
						boolean flag = addBooking(id, details[2], Integer.parseInt(details[3]), Integer.parseInt(details[4]), details[5]);
						boolean second = false;
						boolean third = false;
						System.out.println(id);
						if(details[7].equalsIgnoreCase("Single") || details[7].equalsIgnoreCase("Double") || details[7].equalsIgnoreCase("Triple"))
						{
							second = addBooking(id,month,day,length,details[7]);
						}
						if(details[8].equalsIgnoreCase("Single") || details[8].equalsIgnoreCase("Double") || details[8].equalsIgnoreCase("Triple"))
						{
							third = addBooking(id,month,day,length,details[8]);
						}
						if(flag && !second)
						{
							System.out.println(open.get(counter).getName() + " " + open.get(counter).getRoomNum());
							counter++;
						}
						else if(flag && second && !third)
						{
							System.out.println(open.get(counter).getName() + " " + open.get(counter).getRoomNum() + " " +open.get(counter+1).getRoomNum());
							counter+=2;
						}
						else if(flag && second && third)
						{
							System.out.println(open.get(counter).getName() + " " + open.get(counter).getRoomNum()  + " "+open.get(counter+1).getRoomNum() + " "+open.get(counter+2).getRoomNum());
							counter+=3;
						}
						else
						{
							System.out.println("Booking rejected.");
						}
					}
				}
				else if(command.equalsIgnoreCase("Cancel"))
				{
					int id = Integer.parseInt(details[1]);
					String hotelName = "";
					int roomNum = 0;
					for(int i = 0;i<bookings.size();i++)
					{
						if(bookings.get(i).getId() == id)
						{
							hotelName = bookings.get(i).getName();
							roomNum = bookings.get(i).getRoomNum();
							bookings.remove(i);
							counter--;
							freeSpace(hotelName, roomNum);
						}
					}
				}
				else if(command.equalsIgnoreCase("Print"))
				{
					String name = details[1];
					for(int i = 0;i<bookings.size();i++)
					{
						if(bookings.get(i).getName().equalsIgnoreCase(name))
						{
							System.out.println(bookings.get(i).toString());
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
		} finally {
			if (sc != null)
				sc.close();
		}
	}
	
	private static boolean addBooking(int id, String month, int day, int length, String type)
	{
		int typeOfRoom = 0;
		boolean flag = false;
		if(type.equals("Single"))
		{
			typeOfRoom = 1;
		}
		else if(type.equalsIgnoreCase("Double"))
		{
			typeOfRoom = 2;
		}
		else if (type.equalsIgnoreCase("Triple"))
		{
			typeOfRoom = 3;
		}
		
		for(int i = 0;i<open.size();i++)
		{
			System.out.println("test");
			if(open.get(i).getCapacity() == typeOfRoom && !open.get(i).isTaken())
			{
				String name = open.get(i).getName();
				int roomNum = open.get(i).getRoomNum();
				open.get(i).setTaken(true);
				Hotel temp = new Hotel(name, roomNum, id, month, day, length);
				bookings.add(temp);
				flag = true;
				
			}
			else if(open.get(i).getCapacity() == typeOfRoom && (open.get(i).getStartDate()+open.get(i).getNumOfDays()) <= day)
			{
				String name = open.get(i).getName();
				int roomNum = open.get(i).getRoomNum();
				open.get(i).setTaken(true);
				Hotel temp = new Hotel(name, roomNum, id, month, day, length);
				bookings.add(temp);
				flag = true;
				
			}
		}
		return flag;
	}
	
	private static boolean checkBookingId(int id)
	{
		for(int i = 0;i<bookings.size();i++)
		{
			if(bookings.get(i).getId() == id)
			{
				return true;
			}
		}
		return false;
	}
	
	private static void freeSpace(String name, int roomNum)
	{
		for(int i = 0;i<open.size();i++)
		{
			if(open.get(i).getName().equalsIgnoreCase(name) && open.get(i).getRoomNum() == roomNum)
			{
				open.get(i).setTaken(false);
			}
		}
	}
}

























