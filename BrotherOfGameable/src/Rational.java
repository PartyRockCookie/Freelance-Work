

public class Rational {
	private int numerator;
	private int denominator;

	Rational() {
		this.setNumerator(0);
		this.setDenominator(denominator);
	}

	Rational(int numerator, int denominator) {
		this.setNumerator(numerator);
		this.setDenominator(denominator);
	}

	public String printRational(Rational rat) {
		String str = "";
		str += "The numerator is: " + rat.getNumerator();
		str += "The denominator is: " + rat.getDenominator();
		return str;
	}

	/**
	 * @return the numerator
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * @param numerator
	 *            the numerator to set
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	/**
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * @param denominator
	 *            the denominator to set
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public void negate() {
		this.setNumerator(-this.getNumerator());
		this.setDenominator(-this.getDenominator());
	}

	public void invert() {
		int temp = this.getNumerator();
		this.setNumerator(this.getDenominator());
		this.setDenominator(temp);
	}

	public double toDouble() {
		return (double) this.getNumerator() / this.getDenominator();
	}

	private int gcd(int a, int b) {
		while (a != b)
			if (a > b)
				a = a - b;
			else
				b = b - a;
		return a;
	}

	public void reduce() {
		int common = gcd(Math.abs(this.getNumerator()), this.getDenominator());
		this.setNumerator(numerator / common);
		this.setDenominator(denominator / common);

	}

	private Rational add(Rational other) { //Helper method.
		int newDenominator = denominator * other.denominator;
		int newNumerator = numerator * other.denominator;
		int newOtherNumerator = other.numerator * denominator;
		int sum = newNumerator + newOtherNumerator;
		return new Rational(sum, newDenominator);
	}

	public static Rational plus(Rational a, Rational b) {
		return a.add(b);
	}

}
