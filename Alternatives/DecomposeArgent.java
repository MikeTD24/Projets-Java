package Alternatives;

import java.util.Scanner;

public class DecomposeArgent {

	public static void main(String[] args) {
		
		int Argent=0, nbBillet=0, Reste=0; 
		
		System.out.println("Entrez une somme d'argent :" ); //somme = 3485
		Argent=new Scanner(System.in).nextInt();
				
		if (Argent>=500) {
			Reste=Argent%500;  //485
			nbBillet=Argent/500; //3000/500=6
			System.out.println((nbBillet) + " Billet de 500");
			Argent=Reste;
		}
		if (Argent>=200) {
			Reste=Argent%200; 
			nbBillet=Argent/200;
			System.out.println((nbBillet) + "Billet de 200");
			Argent=Reste;
		}
		if (Argent>=100) {
			Reste=Argent%100;
			nbBillet=Argent/100;
			System.out.println((nbBillet) + "Billet de 100");
			Argent=Reste;
	    }
		if (Argent>=50) {
			Reste=Argent%50;
			nbBillet=Argent/50;
			System.out.println((nbBillet) + "Billet de 50");
			Argent=Reste;
		}
		if (Argent>=20) {
			Reste=Argent%20;
			nbBillet=Argent/20;
			System.out.println((nbBillet) + "Billet de 20");
			Argent=Reste;
		}
		if (Argent>=10) {
			Reste=Argent%10;
			nbBillet=Argent/10;
			System.out.println((nbBillet) + "Billet de 10");
			Argent=Reste;
		}
		if (Argent>=5) {
			Reste=Argent%5;
			nbBillet=Argent/5;
			System.out.println((nbBillet) + "Billet de 5");
			Argent=Reste;
		}
		if (Argent>=2) {
			Reste=Argent%2;
			nbBillet=Argent/2;
			System.out.println((nbBillet) + "Pièce(s) de 2");
			Argent=Reste;
		}
		if(Argent==1) {
			System.out.println((Argent) + "Pièce de 1 ");
		}
	}
}