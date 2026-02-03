package Tableaux2D;

import java.util.Scanner;

import découverte.TabChar;
import découverte.UtilMethodes;
import découverte.UtilSaisie;
import découverte.UtilTab;

public class TableauChar {

	public static void main(String[] args) {
		// Un tableau de caractères de 5 lignes et 4 colonnes est initialisé de la manière suivante : 
		// 1ère ligne: nous avons que lettre a;
		//2ème ligne : nous avons que des lettres b;
		//3ème ligne: nous avons que des lettres c;
		//4ème ligne: nous avons que des lettres d
		//5lignes: nous avons que des lettres e.
		//Ensuite, le programme affiche le tableau.
		//le programme demande à l'utilisateur d'entrer un caractère et remplace la 1ère ligne, 2ème colone et la 4ème colone avec ce caractère.
		
		
		char [][] tab=new char [5][4];
        // Initialisation du tableau avec a, b, c, d, e
        for (int i = 0; i < tab.length; i++) { 
            char lettre = (char) ('a' + i);   
            for (int j = 0; j < tab[i].length; j++) { 
                tab[i][j] = lettre;  
            }
        }

        // Affichage initial
        System.out.println("Tableau initial :");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        // Demande d'un caractère à l'utilisateur

        //System.out.print("Entrez un caractère : ");
        //Scanner sc = new Scanner(System.in);
        char c =UtilSaisie.saisieChar("Entrez un caractère : ");

        // Remplacement :
        // 1) Toute la première ligne
        for (int j = 0; j < tab[0].length; j++) {
            tab[0][j] = c;
        }

        // 2) Dans les autres lignes, colonnes 2 et 4 (indices 1 et 3)
        for (int i = 1; i < tab.length; i++) {
            tab[i][1] = c;
            tab[i][3] = c;
        }

        // Affichage après modification
        System.out.println("\nTableau modifié :");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

   
    }
}

