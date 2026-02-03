package Vecteurs;

import découverte.UtilMethodes;
import découverte.UtilTab;

public class DoubleNombre {

	public static void main(String[] args) {
		// Ecrire un programme qui crée un tableau de 10 éléments entiers et initialise ce tableau avec 10 nombres entiers entrés par l'utilisateur.
		//Afficher les éléments du tableau.
		//Ensuite il faut doubler la valeur de chaque élément du tableau et afficher le résultat.
		//Exemple : 
		//Tableau :       1 3 2 4 8 0 10 5 9 7
	   //Tableau doublé : 2 6 4 8 16 0 20 10 18 14
		
		int [] tab = new int [10]; 
		
		for (int i=0; i<tab.length; i++) {
			System.out.print("Entrez le nombre n° " + (i+1) + " : ");
			tab[i] =UtilMethodes.saisieInt();
		}
		System.out.print("Tableau : "); //Affichage Tableau original
		for (int i=0; i<tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		
		for (int i=0; i<tab.length; i++) {
			tab[i]=tab[i]* 2 ; // je double les cases
		}
        System.out.print("Tableau doublé : "); //Affichage Tableau doublé
        for (int i=0; i<tab.length; i++) {
        	System.out.print(tab[i] + " ");
        }
        System.out.println();
	}

}
 
        
 