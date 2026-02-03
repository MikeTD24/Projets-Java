package Vecteurs;

import java.util.Random;

public class VecteurInit2 {

	public static void main(String[] args) {
		// Ecrire le programme qui remplit un vecteur de 20 éléments avec les nombres pairs de 0 à 38 et qui l'affiche sur 4 lignes (5 éléments par ligne).
		
		int[] tab = new int[20]; // tableau de 20 éléments
        

        // Remplissage avec les nombres pairs de 0 à 38
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i * 2; // car i=0→0, i=1→2, ..., i=19→38
        }

        // Affichage sur 4 lignes de 5 éléments
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "\t"); // tabulation pour aligner 
            if ((i +1) % 5 ==0) { //tous les 5 éléments, on passe à la ligne
            	System.out.println();
            	
        }
            
            
            
            
     }
   }
}
