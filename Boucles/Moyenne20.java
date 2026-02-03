package Boucles;

public class Moyenne20 {

	public static void main(String[] args) {
		int nbre, cpt=0; 
		int somme=0, diviseur=0;
		
		
		
		for (cpt=0; cpt <20; cpt++) {
			System.out.println("Veuillez entrer vos nombres :");
			nbre=UtilMethodes.saisieInt();
			
			
			if (nbre>=10 && nbre<=20) {
				somme+=nbre;
				diviseur++;
			}
		}
		    if (diviseur==0) {
			System.out.println("Pas de Moyenne");
		    }
			else {
				double moyenne = (double) somme/diviseur;
				System.out.println("La Moyenne est de " + moyenne);
			}

	}

}

