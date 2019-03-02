package co.simplon.vehicles;

import java.util.Scanner;

public class Test {		
	private static int id = 1;
	public static void main(String[] args) {						
		Scanner scan = new Scanner( System.in );
		boolean exit = true;
		
		Concessionaire conces = new Concessionaire();
		
		conces.addVehicle(new Car(id++,"Renault","Clio","Diesel",3));
		conces.addVehicle(new Car(id++,"Renault","Megane","Diesel",5));
		conces.addVehicle(new Car(id++,"Peugeot","307 SW","Essence",5));
		conces.addVehicle(new Motorbike(id++,"Aprilia","750","Essence"));
		conces.addVehicle(new Boat(id++,"SuperYacht","Explorer","Fuel",4));
		
		System.out.println("\nBienvenu dans votre programme de gestion de vos véhicules ");
		
		do {
			System.out.println("Choisissez une action : ajouter vendre afficher exit ");
			
			String read = scan.next();
			
			if(read.equalsIgnoreCase("ajouter"))			ajouterVehicule(scan,conces);	
			else if (read.equalsIgnoreCase("vendre"))		vendreVehicule(scan,conces);
			else if (read.equalsIgnoreCase("afficher"))		conces.displayStock();
			else exit = false;
			
		}while(exit);	
		System.out.println("Au revoir !");
	}
	
	public static void ajouterVehicule(Scanner scan,Concessionaire conces) {
		System.out.println("Que souhaitez vous ajouter : voiture moto bateau");
		String vehicule = scan.next();
		Vehicle v = null;
		
		System.out.println("Saisissez la marque du véhicule à ajouter : ");	
		String brand = scan.next();
		System.out.println("Saisissez le type : ");	
		String type = scan.next();
		System.out.println("Saisissez les infos sur le moteur : ");	
		String engine = scan.next();
		
		if(vehicule.equalsIgnoreCase("voiture")) {
			System.out.println("Saisissez le nombre de porte : ");	
			int nbDoor = scan.nextInt();			
			v = new Car(id++,brand,type,engine,nbDoor);
		}
		else if(vehicule.equalsIgnoreCase("bateau")) {
			System.out.println("Saisissez le nombre d'étages : ");	
			int nbFloor = scan.nextInt();			
			v = new Boat(id++,brand,type,engine,nbFloor);
		}
		else if(vehicule.equalsIgnoreCase("moto")) {			
			v = new Motorbike(id++,brand,type,engine);
		}
		conces.addVehicle(v);
	}
	
	public static void vendreVehicule(Scanner scan,Concessionaire conces) {
		System.out.println("\n \t Saisissez le numéro du véhicule à supprimer :  ");
		int del = scan.nextInt(); 
				
		if(conces.sellVehicle(del) == false)		System.out.println("numéro de véhicule non présent dans le stock !");
		else System.out.println("véhicule vendu !");
	}
}
