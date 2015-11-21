public class CallCentre {

	private Call[] calls;
	private int total;

	public CallCentre(int sizeIn) {
		calls = new Call[sizeIn];
		total = 0;
	}

	public boolean addCall(Call CallIn) {
		if (!isFull()) { // if there is unused space left in the array
			calls[total] = CallIn;
			total++;
			return true;
		} else {
			return false;
		}
	}

	public boolean remove(String callId) {
		int num = search(callId);
		if (num == -999) {
			return false;
		} else {
			for (int i = num; i < this.total; i++) {
				this.calls[i] = this.calls[i + 1];
			}
			this.total--;
			return true;
		}
	}

	public boolean isFull() {
		if (total >= calls.length) {
			return true;
		} else
			return false;
	}

	public boolean isEmpty() {
		if (total == 0) {
			return true;

		} else
			return false;

	}

	public void listCallsAboveSuggestedLength() {
		String callOver = "";

		if (!isEmpty()) {
			for (int i = 0; i < total; i++) {
				if (this.calls[i].getNumOfMinutes() > Call
						.getSuggestedLengthOfCall()) {
					callOver = callOver + this.calls[i].toString() + "\n";
				}
			}
		}
		System.out.println(callOver);
	}

	private int search(String callId) {
		for (int i = 0; i < total; i++) {
			Call myCall;
			myCall = this.calls[i];

			String myCallId = myCall.getCallId();

			if (myCallId.equals(callId)) {
				return i;
			}
		}
		return -999;
	}

	public String listCalls() {
		StringBuilder listOfCalls = new StringBuilder();
		for (int record = 0; record < total; record++) {
			listOfCalls.append(calls[record].toString());
		}
		return listOfCalls.toString();
	}

	public int getTotal() {
		return total;
	}

	public Call getItem(String callID) {
		int num = search(callID);
		if (num != -999) {
			return calls[num];
		} else {
			return null;
		}
	}

	public Call checkLongestCall() {
		Call longest = this.calls[0];
		for (int i = 0; i < calls.length; i++) {
			if (calls[i] != null) {
				if (calls[i].getNumOfMinutes() > longest.getNumOfMinutes())
					longest = calls[i];
			} else {
				break;
			}
		}
		return longest;
	}

	public Call checkShortestCall() {
		Call shortest = calls[0];
		for (int i = 0; i < calls.length; i++) {
			if (calls[i] != null) {
				if (calls[i].getNumOfMinutes() < shortest.getNumOfMinutes()) {
					shortest = calls[i];
				}
			}
		}
		return shortest;
	}

	public void updateSuggestedLengthOfCall(int time) {
		Call.setSuggestedLengthOfCall(time);
	}
}
