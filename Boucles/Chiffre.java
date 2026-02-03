package Boucles;

import java.util.Scanner;

public class Chiffre {

	public static void main(String[] args) {
		int nb; 
		
		System.out.println("Veuillez entrer un chiffre :");
		nb=UtilMethodes.saisieInt();
		
		
		while (!(nb==0 || nb==1 || nb==2 || nb==3)) {
			System.out.println("Veuillez recommencer :");
			nb=UtilMethodes.saisieInt();
		}
			
		System.out.println("Au revoir ; ");
  }
}
