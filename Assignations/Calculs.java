package Assignations;

import java.util.Scanner;

public class Calculs {

	public static void main(String[] args) {
		int nb1 = 0, nb2 = 0; 

	
		System.out.print("Entrez un premier nombre ");
		
		nb1=new Scanner(System.in).nextInt();
		
		System.out.print("Entrez un deuxième nombre ");
		
		nb2=new Scanner(System.in).nextInt();
		
		System.out.println("Somme : " + nb1 + " + " + nb2 + "=" + (nb1 + nb2));
		System.out.println("Différence : " + nb1 + " - " + nb2 + "=" + (nb1-nb2));
		System.out.println("Produit : " + nb1 + " x " + nb2 + "=" + (nb1*nb2));
		
		
		
		
		
		
		
		

	}

}
