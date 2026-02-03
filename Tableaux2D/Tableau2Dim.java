package Tableaux2D;

import java.util.Random;

import découverte.UtilTab;

public class Tableau2Dim {

	public static void main(String[] args) {
		// Ecrire le programme qui initialise un tableau de 5 colonnes et 4 lignes avec des nobres compris entre 10 et 20 et qui affiche tous les éléments du tableau.

		
	int [][] tab = new int [4][5];//tableau 4 lignes et 5 collones.
    Random rand = new Random();

	// Initialisation avec des nombres entre 10 et 20 inclus
	for (int i = 0; i < tab.length; i++) {              // lignes
		for (int j = 0; j < tab[i].length; j++) {       // colonnes
			tab[i][j] = 10 + rand.nextInt(11); // 0..10 → +10 → 10..20
	     }
	    }

	// Affichage du tableau
	System.out.println("Tableau 4x5 :");
	for (int i = 0; i < tab.length; i++) {
		for (int j = 0; j < tab[i].length; j++) {
			System.out.print(tab[i][j] + "\t"); // tabulation pour aligner
	    }
	   System.out.println();
	  }
   }
}
