package Assignations;

import java.util.Scanner;

public class CercleCirconferenceAire {

	public static void main(String[] args) {
		
		
		int rayon=0, circonférence=0, aire=0; 
		
		System.out.print("Entrez la valeur de votre rayon ");
		rayon=new Scanner(System.in).nextInt();
		
		System.out.println("l'aire de votre cercle est rayon x rayon x PI =" + (rayon*rayon*Math.PI));
		
		System.out.println("la circonférence 2xPIxr, du cercle de rayon " + rayon + " est de =" + (2*rayon*Math.PI));
		
		
		
	}

}
