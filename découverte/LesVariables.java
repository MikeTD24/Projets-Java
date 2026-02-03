package découverte;

import java.util.Scanner;

public class LesVariables {

	public static void main(String[] args) {
		// pour définir une variable il faut _, lettre et $
		int nb; 
		// variable double
		double montant ;
		
		// boolean
		boolean Fort ;
		
		// string 
		String nom; 
		
		// caractère
		char caractère; 
		
		System.out.print("Entrez votre nombre préféré");
		// afficher "Entrez votre nombre préféré 
		
		nb=new Scanner(System.in).nextInt(); 
		// saisir nb 
		
		System.out.println("tu as encodé "+nb);
		System.out.println("Entrez le montant de votre compte");
		montant=new Scanner(System.in).nextDouble();
		//encodage avec virgule !!!!!!
		System.out.println("es tu Fort ?(true or false)");
		Fort=new Scanner(System.in).nextBoolean();
		System.out.println("Entrez votre nom");
		nom=new Scanner(System.in).nextLine();
		
		System.out.println(nom+", entre ton caractère préféré");
		caractère=new Scanner(System.in).nextLine().charAt(0);
		System.out.println("tu t'appelles "+nom);
		System.out.println("le montant est de "+montant);
		System.out.println("tu es Fort "+Fort);
		System.out.println("et ton caractère préféré est "+caractère);

	}

}
