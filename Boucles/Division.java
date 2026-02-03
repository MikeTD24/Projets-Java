package Boucles;

public class Division {

	public static void main(String[] args) {
		
		int quotient, reste, nbre, diviseur, absnbre, absdiviseur; //abs pour définir les valeurs absolues.

		System.out.print("Entrez le nombre ou le dividende de votre choix : ");
		nbre =UtilMethodes.saisieInt();

		System.out.print("Entrez le diviseur : ");
		diviseur =UtilMethodes.saisieInt();

		if (diviseur == 0) {
			System.out.println("Erreur : division par zéro impossible !");
		     } 
		else {
			absnbre= Math.abs(nbre);
			absdiviseur= Math.abs(diviseur);
			quotient = 0;
			reste = absnbre;
			while (reste >= absdiviseur) {
				reste -= absdiviseur;
				quotient++;
		     }
			if ((nbre<0 && diviseur>0) || (nbre>0 && diviseur <0)) {
				quotient=-quotient;
			}
			if (nbre<0) {
				reste=-reste;
			}

		  System.out.println(nbre + " divisé par " + diviseur + " = " + quotient + " avec un reste de " + reste);
		      }

	}

}


 

     
