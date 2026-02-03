package Boucles;

public class Intervalle {

	public static void main(String[] args) {
		
		
		int nb1, nb2, cpt, somme=0;
		int min=0, max=0;
		
		do {
			System.out.println("Veuillez entrer un premier nombre supérieur à 0");
			nb1=UtilMethodes.saisieInt();
		}while(nb1<=0);//il ne passera pas après tant qu'il met une valeur <=0
		
		
		do {
			System.out.println("Veuillez entrer un deuxième nombre supérieur à 0");
			nb2=UtilMethodes.saisieInt();
		}while(nb2<=0);
		
		min = Math.min(nb1, nb2);
		max = Math.max(nb1, nb2);
		for (cpt=min; cpt<=max; cpt++) {
			somme += cpt;
		}
		System.out.println("La somme des nombres entre " + nb1 + "et" + nb2 + " est de " + somme);
		
		
		
  
	}

}

