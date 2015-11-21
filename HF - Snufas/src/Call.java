
public class Call {

	private String callId;
	private int numOfMinutes;
	private String callStatus;
	private boolean callBackCustomer;
	private String callAnsweredBy;
	private int customerSatisfactionRating;
	private static int suggestedLengthOfCall;

	public Call(String callId, int numOfMinutes, String callStatus,
			boolean callBackCustomer, String callAnsweredBy,
			int customerSatisfactionRating) {
		this.callId = callId;
		this.numOfMinutes = numOfMinutes;
		this.callStatus = callStatus;
		this.callBackCustomer = callBackCustomer;
		this.callAnsweredBy = callAnsweredBy;
		this.customerSatisfactionRating = customerSatisfactionRating;
	}

	public String getCallId() {
		return callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
	}

	public int getNumOfMinutes() {
		return numOfMinutes;
	}

	public void setNumOfMinutes(int numOfMinutes) {
		this.numOfMinutes = numOfMinutes;
	}

	public String getCallStatus() {
		return callStatus;
	}

	public void setCallStatus(String callStatus) {
		this.callStatus = callStatus;
	}

	public boolean isCallBackCustomer() {
		return callBackCustomer;
	}

	public void setCallBackCustomer(boolean callBackCustomer) {
		this.callBackCustomer = callBackCustomer;
	}

	public String getCallAnsweredBy() {
		return callAnsweredBy;
	}

	public void setCallAnsweredBy(String callAnsweredBy) {
		this.callAnsweredBy = callAnsweredBy;
	}

	public int getCustomerSatisfactionRating() {
		return customerSatisfactionRating;
	}

	public void setCustomerSatisfactionRating(int customerSatisfactionRating) {
		this.customerSatisfactionRating = customerSatisfactionRating;
	}

	public static int getSuggestedLengthOfCall() {
		return suggestedLengthOfCall;
	}

	public static void setSuggestedLengthOfCall(int suggestedLengthOfCall) {
		Call.suggestedLengthOfCall = suggestedLengthOfCall;
	}

	public String toString() {
		String str = "";

		str +=("Caller ID: "+this.getCallId());
		str +=("\nLength of call: "+this.getNumOfMinutes());
		str +=("\nCall status: "+this.getCallStatus());
		str +=("\nMust call customer back: "+this.isCallBackCustomer());
		str +=("\nCall answered by: "+this.getCallAnsweredBy());
		str +=("\nCustomer satisfaction rating: "+this.getCustomerSatisfactionRating() +"\n\n");
		return str.toString();
	}

}