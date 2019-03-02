package co.simplon.exception;

public class Rational {
	//Attributs
	private int numerator;
	private int denominator;

	//Mes constructeurs
	public Rational(int numerator, int denominator) /* throws DivisionParZeroException*/ {
		this.numerator = numerator;
		setDenominator(denominator);
	}
	public Rational() {
		numerator = 0;
		denominator = 1;		
	}	
	public Rational(int numerator) /*throws DivisionParZeroException*/ {
		this.numerator = numerator;
		setDenominator(1);
	}

	//Mes accesseurs (getters & setters)
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	/* version insatisfaisante !!!
	 * public void setDenominator(int denominator) {
		if ( denominator == 0 ) this.denominator = 1;
		else this.denominator = denominator;
	}*/
	
	// un petit peu mieux
	public void setDenominator(int denominator) {
		if ( denominator == 0 ) throw new RuntimeException("division par O non permise !");		
	}
	
	// encore mieux
	/*public void setDenominator(int denominator)  throws DivisionParZeroException {
		if ( denominator == 0 ) throw new DivisionParZeroException();		
	}*/

	//mes methodes
	public String toString() {
		return "[" + this.getNumerator() + "/" + denominator + "]";		 
	}
	
	public Rational add(Rational r) throws DivisionParZeroException {
		Rational t = new Rational();		
		t.setNumerator((this.getNumerator() * r.getDenominator()) + (this.getDenominator()*r.getNumerator()));		
		t.setDenominator(this.getDenominator() * r.getDenominator());					
		return t;
	}
}
