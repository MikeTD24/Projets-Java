package Assignations;

import java.util.Scanner;

public class Moyenne3Nombres {

	public static void main(String[] args) {
		float nb1=0, nb2=0, nb3=0, moyenne=0; 
		
		System.out.print("Entrez votre premier nombre ");
		nb1= new Scanner(System.in).nextFloat();
		
		System.out.print("Entrez votre deuxième nombre ");
		nb2= new Scanner(System.in).nextFloat();
		
		System.out.print("Entrez votre troisième nombre ");
		nb3=new Scanner(System.in).nextFloat();
		
	
		
		System.out.println("la moyenne des nombres " + nb1 + " et " + nb2 + " et de " + nb3 + " est de " +(nb1+nb2+nb3)/3); 
		
		
	}

}
