package Boucles;

public class Moyenne {
    public static void main(String[] args) {

        int somme = 0, compteur = 0, nbre=0;

        System.out.println("Entrez des nombres :");

        while (true) {
            nbre =UtilMethodes.saisieInt();

            if (nbre == 0) {
                break; // on sort de la boucle
            }

            somme += nbre;
            compteur++;
        }

        if (compteur == 0) {
            System.out.println("Aucun nombre saisi, pas de moyenne.");
        } else {
            double moyenne = (double) somme / compteur;
            System.out.println("La moyenne des nombres est : " + moyenne);
        }
    }
}



