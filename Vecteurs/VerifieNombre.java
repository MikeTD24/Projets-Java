package Vecteurs;

import découverte.UtilMethodes;

public class VerifieNombre {

    public static void main(String[] args) {
        int[] tab = new int[10];
        boolean trouve;
        int nombre;

        // Remplissage du tableau
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Veuillez entrer le nombre n° " + (i + 1) + " : ");
            tab[i] = UtilMethodes.saisieInt();
        }

        // Boucle de recherche
        do {
            System.out.print("Entrez un nombre à rechercher : ");
            nombre = UtilMethodes.saisieInt();

            trouve = false; // réinitialisation
            System.out.print("Résultat : ");
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] == nombre) {
                    System.out.print(" trouvé à la position " + i + " ; ");
                    trouve = true;
                }
            }

            if (!trouve) {
                System.out.println("Faux - ce nombre n'est pas dans le tableau, essayez encore.");
            } else {
                System.out.println(); // retour à la ligne après les positions
            }

        } while (!trouve); // on redemande tant que le nombre n'est pas trouvé
    }
}
