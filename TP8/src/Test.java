
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c1 = new City("TOULOUSE" , "FRANCE" , 500000);
		City c2 = new City("London","UK",1000000);
		
		System.out.println(c1.getName() + " " + c1.getState() + " " + c1.getNbInhabitant());		
		c1.setNbInhabitant(200);
		System.out.println(c1.getName() + " " + c1.getState() + " " + c1.getNbInhabitant());
		
		c1.setNbInhabitant(c1.getNbInhabitant() + 2000);
		c1.display();	
		c2.display();
		
		System.out.println("Il y a " + City.nbInstance + " instances de notre classe City");
		
		Person p1 = new Person("dupont","henri",51,"3 rue des rosiers à Nice"); 
		p1.display();	
		Person p2 = new Person("durant","robert",73,"2 rte de grenoble",c1);
		p2.display();
	}
}
