package Vecteurs;

import découverte.UtilMethodes;

public class Inverse {

	public static void main(String[] args) {
		// Ecrire un programme qui crée un tableau de 10 éléments entiers et initialise ce tableau avec 10 nombres entiers entrés par l'utilisateur.
		//Inverse l'ordre des éléments dans le tableau et afficher ensuite le résultat (ne pas utiliser de tableau intermédiaire).
		//Exemple :
		//Tableau : 1 3 2 4 8 0 10 5 9 7
		//Tableau : 7 9 5 10 0 8 4 2 3 1

		int [] tab = new int [10];
		int temp=0; int n=tab.length;//n = taille du tableau
		
		for (int i=0; i<tab.length; i++) {//Remplissage Tableau par User
			System.out.print("Entrez le nombre n° " + (i+1) + " : ");
			tab[i]=UtilMethodes.saisieInt();
		}
		System.out.print("Tableau 1 : " );//Affichage Tableau 1
		for (int i=0; i<tab.length; i++) { 
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		
		for (int i=0; i<n/2; i++) {//J'inverse les données du Tabaleau 1
			temp =tab[i];
			tab[i]=tab[n-1-i];
			tab[n-1-i]=temp;
		}
		System.out.print("Tableau Inversé : " );//Affichage Tableau 2 inversé
		for (int i=0; i<tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		
		System.out.println();
		
	}

}


