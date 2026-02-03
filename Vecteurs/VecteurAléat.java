package Vecteurs;

import java.util.Random;

public class VecteurAléat {

	public static void main(String[] args) {



        int[] tab = new int[10]; // tableau de 10 éléments
        Random r = new Random();

        // Remplissage du tableau
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(31); // génère un entier entre 0 et 30 inclus
        }

        // Affichage en une seule ligne
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}

