/**
 * @author Willie Ausrotas <wausrotas@gmail.com> Student Number: 7804922
 *         Assignment: Section: ITI1121 - A
 */

public class Quiz {
	private int data;

	public Quiz(int newData) {
		data = newData;
	}

	public void setData(int value) {
		data = value;
	}

	public String toString() {
		return "data=" + data;
	}

	public static void main(String[] args) {
		Quiz data1 = new Quiz(1);
		Quiz data2 = new Quiz(2);
		Quiz data3 = data1;
		data1.setData(3);
		System.out.println(data1.toString());
		System.out.println(data2.toString());
		System.out.println(data3.toString());
		Quiz quiz = null;
		System.out.println(quiz);
	}
}