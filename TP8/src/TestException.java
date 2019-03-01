
public class TestException {
	
	public static void main(String[] args) {		
		//double z = 3/0;
		//int tab[] = new int [3];
		//tab[3] = 2
		//Rational rat = null;
		//int val = rat.getDenominator();
		
		try 
		{
			Rational rat = null;
			int val = rat.getDenominator();
			//double a = 5/0;
			//int tab[] = new int [3];
			//tab[4] = 2;
			Rational r1 = new Rational(5,0);
		}
		catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("C'est pas bien d'essayer de faire une division par 0 !!!");
		}
		catch(IndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("C'est pas bien d'essayer d'acceder � un index inexistant du tableau !!!");
		}
		catch(DivisionParZeroException e) {
			//e.printStackTrace();
			System.out.println("chouette c'est notre objet exception qui est lev�");
		}
		catch(RuntimeException e) {
			System.out.println("C'est toujours pas bien de diviser par z�ro");
		}
		finally {
			System.out.println("Attention la prochaine fois");
		}
		
		/*Rational r1 = new Rational(5,0);		
		System.out.println(r1);*/				
	}
}
