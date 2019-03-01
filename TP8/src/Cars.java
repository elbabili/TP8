import java.util.Scanner;

public class Cars {
	private static int nbElem = 0;
	private static String stock[] = new String[50];
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner( System.in );
		boolean exit = true;
		
		System.out.println("Bienvenu dans votre programme de gestion de vos véhicules ");
		
		do {
			System.out.println("Choisissez une action : ajouter vendre afficher exit ");
			
			String read = scan.nextLine();
			
			if(read.equalsIgnoreCase("ajouter"))			ajouterVehicule(scan);	
			else if (read.equalsIgnoreCase("vendre"))		vendreVehicule(scan);
			else if (read.equalsIgnoreCase("afficher"))		affichStock();
			else exit = false;
			
		}while(exit);	
		System.out.println("Au revoir !");
		scan.close();
	}
	
	public static void ajouterVehicule(Scanner scan) {
		System.out.println("Saisissez un véhicule à ajouter au stock : ");
		stock[nbElem++] = scan.nextLine().toString();		
	}
	
	public static void vendreVehicule(Scanner scan) {
		System.out.println("Saisissez le numéro du véhicule à supprimer ");
		stock[scan.nextInt()-1] = "" ;
	}
	
	public static void affichStock() {
		for(int i = 0 ; i<nbElem ; i++) {
			System.out.println(i+1 + " -> " + stock[i]);
		}			
	}
}
