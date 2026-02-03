package Vecteurs;

import découverte.UtilMethodes;

public class ZeroALaFin {

	public static void main(String[] args) {
		// Ecrire un programme qui demande 10 fois à l'utilisateur d'entrer un chiffre compris entre 0 et 5.
		//Vérifiez que le chiffre est bien compris entre 0 et 5. 
		//Créez et initialisez un tableau de 10 éléments avec les chiffres que l'utilisateur a entrés.
		//Ensuite triez le tableau en mettant tous les zéros à la fin du tableau.
		//Exemple : Tabelau : 10 0 9 3 0 5 7 0 9 0
		//le tableau deviendra : 10 9 3 5 7 9 0 0 0 0 
		
		
		int [] tab = new int [10];
		int index=0;
		
		for (int i=0; i<tab.length; i++) {//remplissage du tableau avec vérification nombre entre 0 et 5.
			int nombre;
			do {
				System.out.println("Veuillez entrer 10 fois un nombre compris entre 0 et 5. " + "n°" + (i +1 ) + " : " );
				nombre=UtilMethodes.saisieInt();
		    }while (nombre<0 || nombre>5); // vérification 
			tab[i] = nombre;
		}
		System.out.println("Tableau initial : " );//Affichage Tableau initial
		
		for (int i=0; i<tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		
		//Réorganisation mettre les zéros à la fin 
		
		index =0; //position pour les non-zéros
		
		for (int i=0; i<tab.length; i++) {
			if (tab[i] != 0 ) {
				tab[index] = tab[i];
				if (index !=i) {
					tab[i]=0;//on met zéro à la place
				}
				index++;
			}
	    }
		System.out.print("Tableau avec zéros à la fin : " );//Affichage Tableau modifié
		for (int i=0; i<tab.length; i++) {
			System.out.print(tab[i] + " " );
		}
		System.out.println();

   }
}

       
