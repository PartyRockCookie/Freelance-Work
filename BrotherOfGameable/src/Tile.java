
public class Tile {
	private char letter;
	private int value;
	Tile(char letter, int value)
	{
		this.setLetter(letter);
		this.setValue(value);
	}
	/**
	 * @return the letter
	 */
	public char getLetter() {
		return letter;
	}
	/**
	 * @param letter the letter to set
	 */
	public void setLetter(char letter) {
		this.letter = letter;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	public String printTile(Tile tile)
	{
		String str = "";
		str += "The letter of this tile is "+tile.getLetter();
		str += "\nThe value is "+tile.getValue();
		return str;
	}
}
