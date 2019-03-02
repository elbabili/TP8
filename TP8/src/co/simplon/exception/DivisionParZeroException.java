package co.simplon.exception;


public class DivisionParZeroException extends RuntimeException {
	
	public DivisionParZeroException() {		
		System.out.println("Interdiction de diviser par z�ro !");
	}
}
