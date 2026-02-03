package Labo;

import java.util.Random;

import découverte.UtilSaisie;

public class TabMot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String tab [] = {"ama", "bic", "café", "dos", "efa","fin", "gros", "hot", "inter", "joy", "kola", "lent", "mon", "non", "oui", "pas", "que", "ras", "son", 
				"ton", "un", "vas", "wax", "xoxo", "yao", "zoo"
		}; 

		Random r = new Random();

		char tabLettre [];
		char tabAffiche [];
		char lettre;
		boolean gagné=false;
		boolean pendu=false; 
		boolean trouvé=false;
		int cptErreur=0;
		int nb;
		String mot;
		nb=r.nextInt(tab.length);
		mot=tab[nb];
		System.out.println(mot);
		tabLettre=mot.toCharArray();
		
	
		tabAffiche = new char[tabLettre.length];
		for (int i=0; i<tabAffiche.length; i++) {
			tabAffiche[i] = '_' ; 

		}
		do {
			
			//affichePendu(cptErreur);		
			//affichage de tabAffiche
			for (int i=0; i<tabAffiche.length; i++) {
				System.out.print(tabAffiche[i] + " ");
			}



			System.out.println("Veuillez entrer votre choix de lettre : " );
			lettre = UtilSaisie.saisieChar(" ");
			trouvé=false;
			// lettre dans tablettre
			for (int i=0; i<tabAffiche.length; i++) {
				if(tabLettre[i]==lettre) {
					tabAffiche[i]=lettre;
					trouvé=true;
				}
			}


			if (! trouvé) {
				System.out.println(" c'est raté : ");
				cptErreur ++;
				 //  Afficher la potence après une erreur
			    affichePendu(cptErreur);

			if (cptErreur >=7) {
				System.out.println("Vous êtes pendu : ");
				pendu=true;
					
				}}
			  
			else {
				System.out.println("bonne lettre");
				gagné=true;
				for (int i=0; i<tabAffiche.length; i++) {
					if ( tabAffiche[i]=='_') {

						gagné=false;
					}
				}

			}

		  
		} while (! gagné && ! pendu);



		if (gagné) {
			System.out.println("On a gagné");
		}

	}
	
	public static void affichePendu (int cpt) {
		switch (cpt) {
		
		
		case 0 ->System.out.println(""" 
				+---+
			    |   |
				    |
				    |
				    |
				    |
			---------
			---------	    
			""");
		 
		case 1 ->System.out.println("""
				+---+
			    |   |
			    O   |
				    |
				    |
				    |
			---------
			---------					
			""");
		
		case 2 ->System.out.println("""
				+---+
			    |   |
			    O   |
				|   |
				    |
				    |
			---------
			---------
			""");
		case 3 ->System.out.println("""
				+---+
			    |   |
			    O   |
			   /|   |
				    |
				    |
			---------
			---------
			""");
		case 4 ->System.out.println("""
				+---+
			    |   |
			    O   |
			   /|\\ |
				    |
				    |
			---------
			---------
			""");

		case 5 ->System.out.println("""
				+---+
			    |   |
			    O   |
			   /|\\ |
			   /    |
				    |
			---------
			---------
			""");

		case 6 ->System.out.println("""
				+---+
			    |   |
			    O   |
			   /|\\ |
			   / \\ |
				    |
			---------
			---------
			""");
			
		}
		
}
}



