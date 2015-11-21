public class CallCentreTester {
	
	public static void main(String[] args) {

		int choice;
		char subChoice;
		int num;

		System.out.println("Enter maximum  number of calls to add in to the system.");
		num = EasyScanner.nextInt();
		CallCentre caller = new CallCentre(num);
		do {
			System.out.println("\nCall Centre System");
			System.out.println("1. Add a call: ");
			System.out.println("2. Remove a call: ");
			System.out.println("3. Update call status: ");
			System.out.println("4. Check if the call list is empty: ");
			System.out.println("5. Check if the call list is full: ");
			System.out.println("6. Call details...");
			System.out.println("7. Update suggested length of call: ");
			System.out.println("8. Quit System:");
			System.out.println();
			System.out.println("Please enter choice [1-8 only]:");
			choice = EasyScanner.nextInt();
			switch (choice) {
			case 1:
				option1(caller);
				break;
			case 2:
				option2(caller);
				break;
			case 3:
				option3(caller);
				break;
			case 4:
				option4(caller);
				break;
			case 5:
				option5(caller);
				break;
			case 6:
				System.out.println("Call Centre System");
				System.out.println("1. Add a call: ");
				System.out.println("2. Remove a call: ");
				System.out.println("3. Update call status: ");
				System.out.println("4. Check if the call list is empty: ");
				System.out.println("5. Check if the call list is full: ");
				System.out.println("6. Call details...");
				System.out.println("\t\ta. Display Details of a specific call");
				System.out.println("\t\tb. Display All calls");
				System.out.println("\t\tc. Display longest call");
				System.out.println("\t\td. Display shortest call");
				System.out.println("\t\te. Display all calls above the suggested length of a call");
				System.out.println("7. Update suggested length of call: ");
				System.out.println("8. Quit System:");
				System.out.println();
				System.out.println("Enter choice [a - e]");
				subChoice = EasyScanner.nextChar();
				switch(subChoice) {
				case 'a':
					option6a(caller);
					break;
				case 'b':
					option6b(caller);
					break;
				case 'c':
					option6c(caller);
					break;
				case 'd':
					option6d(caller);
					break;
				case 'e':
					option6e(caller);
					break;
				default:
					System.out.println("Invalid choice.");
					break;
				}
				break;
			case 7:
				option7(caller);
				break;
			case 8:
				System.out.println("System exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice, please enter 1 - 8 only: ");
			}
		} while (choice != 8);
	}
	
	private static void option1(CallCentre caller)
	{
		System.out.println("Enter the caller ID:");
		String callID = EasyScanner.nextString();
		System.out.println("Enter the number of minutes:");
		int min = EasyScanner.nextInt();
		
		//Checking to make sure the user inputs correct status.
		System.out.println("Enter call status: (Open, Pending, Closed)");
		String status = EasyScanner.nextString().toLowerCase();
		while((!status.equals("open")) && (!status.equals("pending")) && (!status.equals("closed"))) { //Loop will repeat until the user inputs
			System.out.println("Invalid option. Please choose Open, Pending, or Closed.");             //until input is correct.
			status = EasyScanner.nextString().toLowerCase();                                           //Making sure that input is always in lower case to avoid
																									   //Mistakes in loop.
		}
		
		System.out.println("Would you like to call this customer back? (Y/N)");
		String callBackTemp = EasyScanner.nextString();
		while((callBackTemp.equalsIgnoreCase("y")) && (callBackTemp.equalsIgnoreCase("n")))
		{
			System.out.println("Invalid option. Please try again.");
			System.out.println("Would you like to call this customer back? (Y/N)");
			callBackTemp = EasyScanner.nextString().toLowerCase();
		}
		boolean callBack;
		if(callBackTemp.equalsIgnoreCase("y")) {
			callBack = true;
		}
		else if(callBackTemp.equalsIgnoreCase("n")) {
			callBack = false;
		}
		else
		{
			System.out.println("Invalid option. Default set to false.");
			callBack = false;
		}
		
		System.out.println("Who answered the call?");
		String employee = EasyScanner.nextString();
		
		System.out.println("Enter a customer satisfaction rating between 1 - 5:");
		int rating = EasyScanner.nextInt();
		while(rating < 1 || rating > 5)
		{
			System.out.println("Invalid rating.");
			System.out.println("Enter a customer satisfaction rating between 1 - 5:");
			rating = EasyScanner.nextInt();
		}
		
		Call callTemp = new Call(callID, min, status, callBack, employee, rating);
		boolean sucess = caller.addCall(callTemp);
		if(sucess)
		{
			System.out.println("Caller added succesfully.");
		}
		else
		{
			System.out.println("Call center is full.");
		}
	}
	
	private static void option2(CallCentre caller) {
		System.out.println("Enter a caller ID:");
		String ID = EasyScanner.nextString();
		boolean delete = caller.remove(ID);
		if(delete)
		{
			System.out.println("Caller ID " + ID + " succesfully removed.");
		}
		else
		{
			System.out.println("Caller ID was not valid.");
		}
	}

	private static void option3(CallCentre caller) {
		System.out.println("Enter a new call status:");
		String status = EasyScanner.nextString().toLowerCase();
		while((!status.equals("open")) && (!status.equals("pending")) && (!status.equals("closed"))) { //Loop will repeat until the user inputs
			System.out.println("Invalid option. Please choose \"Open, Pending, or Closed\" Thank you.");             //until input is correct.
			status = EasyScanner.nextString().toLowerCase();                                           //Making sure that input is always in lower case to avoid
																									   //Mistakes in loop.
		}
		
		System.out.println("What Call ID would you like to edit?");
		String callID = EasyScanner.nextString();
		Call temp = caller.getItem(callID);
		if(temp == null)
		{
			System.out.println("Caller ID not found. Nothing changed.");
		}
		else {
			temp.setCallStatus(status);
			System.out.println("Call status changed.");
		}
	}
	
	private static void option4(CallCentre caller) {
		
		if(caller.isEmpty())
		{
			System.out.println("Queue is empty.");
		}
		else {
			System.out.println("There is callers waiting.");
		}
	}
	
	private static void option5(CallCentre caller) {
		if(caller.isFull())
		{
			System.out.println("Call centre is full.");
		}
		else {
			System.out.println("Call centre is not full.");
		}
	}
	
	private static void option6a(CallCentre caller) {
		
		System.out.println("What Call ID would you like to view?");
		String callID = EasyScanner.nextString();
		Call temp = caller.getItem(callID);
		if(temp == null)
		{
			System.out.println("Caller ID not found.");
		}
		else {
			System.out.println(temp.toString());
		}
	
	}
	
	private static void option6b(CallCentre caller) {
		System.out.println(caller.listCalls());
	}
	
	private static void option6c(CallCentre caller) {
		Call call = caller.checkLongestCall();
		System.out.println("The longest call was "+call.getCallId() +" the details are as followed.");
		System.out.println(call.toString());
	}
	
	private static void option6d(CallCentre caller) {
		Call call = caller.checkShortestCall();
		System.out.println("The shortest call has ID "+call.getCallId() + " the details are as follow.");
		System.out.println(call.toString());
	}
	
	private static void option6e(CallCentre caller) {
		System.out.println("The calls above the suggested call time are as following:");
		caller.listCallsAboveSuggestedLength();
	}
	
	private static void option7(CallCentre caller) {
		System.out.println("How long should the call be?");
		int num = EasyScanner.nextInt();
		caller.updateSuggestedLengthOfCall(num);
	}

}