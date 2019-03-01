import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestCarsObj {
	public static int id = 1;
	public static ArrayList<CarsObj> conces = new ArrayList<CarsObj>();
	
	public static void main(String[] args) {						
		Scanner scan = new Scanner( System.in );
		boolean exit = true;
		
		conces.add(new CarsObj(id++,"Renault","Clio","Diesel"));
		conces.add(new CarsObj(id++,"Renault","Megane","Diesel"));
		conces.add(new CarsObj(id++,"Peugeot","307","Essence"));
		
		System.out.println("Bienvenu dans votre programme de gestion de vos véhicules ");
		
		do {
			System.out.println("Choisissez une action : ajouter vendre afficher exit ");
			
			String read = scan.next();
			
			if(read.equalsIgnoreCase("ajouter"))			ajouterVehicule(scan);	
			else if (read.equalsIgnoreCase("vendre"))		vendreVehicule(scan);
			else if (read.equalsIgnoreCase("afficher"))		affichStock();
			else exit = false;
			
		}while(exit);	
		System.out.println("Au revoir !");
	}
	
	public static void ajouterVehicule(Scanner scan) {
		System.out.println("Saisissez la marque du véhicule à ajouter : Renault / Peugeot / ...");	
		String brand = scan.next();
		System.out.println("Saisissez le type : Clio / 207 / ... ");	
		String type = scan.next();
		System.out.println("Saisissez le moteur : diesel / essence / ... ");	
		String engine = scan.next();
		conces.add(new CarsObj(id++,brand,type,engine));
	}
	
	public static void vendreVehicule(Scanner scan) {
		affichStock();
		System.out.println("\n \t Saisissez le numéro du véhicule à supprimer :  ");
		int del = scan.nextInt();
		boolean ok = false;
		
		Iterator<CarsObj> it = conces.iterator();
		while(it.hasNext()) {
			if(it.next().getId() == del) {
				it.remove();
				ok = true;
				break;
			}
		}
		if(ok == false)		System.out.println("numéro de véhicule non présent dans le stock !");
		else System.out.println("véhicule vendu !");
	}
	
	public static void affichStock() {
		Iterator<CarsObj> it = conces.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
