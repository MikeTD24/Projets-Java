package Labo;

import java.util.Scanner;

public class Puissance4 {

    public static void main(String[] args) {
        int ligne = 6;
        int colonne = 7;
        char vide = '.';
        char joueur1 = 'X';
        char joueur2 = '0';
        char joueurActu = joueur1;
        boolean placé;
        boolean gagné;
        boolean rempli;
        char[][] tab = new char[ligne][colonne];

        // Initialisation de la grille vide
        for (int l = 0; l < ligne; l++) {
            for (int c = 0; c < colonne; c++) {
                tab[l][c] = vide;
            }
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Afficher la grille
            System.out.println("\nGrille actuelle :");
            for (int l = 0; l < ligne; l++) {
                for (int c = 0; c < colonne; c++) {
                    System.out.print(tab[l][c] + " ");
                }
                System.out.println();
            }
            System.out.println("0 1 2 3 4 5 6");

            // Demander une colonne
            System.out.println("Joueur " + joueurActu + ", choisis une colonne (0-6) : ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrée invalide, veuillez entrer un nombre.");
                scanner.next();
                continue;
            }
            int col = scanner.nextInt();
            placé = false;

            if (col >= 0 && col < colonne) {
                for (int l = ligne - 1; l >= 0; l--) {
                    if (tab[l][col] == vide) {
                        tab[l][col] = joueurActu;
                        placé = true;
                        break; // on s'arrête dès qu'on a placé le pion
                    }
                }
            }

            if (!placé) {
                System.out.println("Colonne invalide ou pleine, réessaie !");
                continue;
            }

            // Vérifier victoire
            gagné = false;
            for (int l = 0; l < ligne; l++) {
                for (int c = 0; c < colonne; c++) {
                    if (tab[l][c] == joueurActu) {
                        // Horizontal
                        if (c + 3 < colonne &&
                            tab[l][c + 1] == joueurActu &&
                            tab[l][c + 2] == joueurActu &&
                            tab[l][c + 3] == joueurActu) gagné = true;

                        // Vertical
                        if (l + 3 < ligne &&
                            tab[l + 1][c] == joueurActu &&
                            tab[l + 2][c] == joueurActu &&
                            tab[l + 3][c] == joueurActu) gagné = true;

                        // Diagonale \
                        if (l + 3 < ligne && c + 3 < colonne &&
                            tab[l + 1][c + 1] == joueurActu &&
                            tab[l + 2][c + 2] == joueurActu &&
                            tab[l + 3][c + 3] == joueurActu) gagné = true;

                        // Diagonale /
                        if (l + 3 < ligne && c - 3 >= 0 &&
                            tab[l + 1][c - 1] == joueurActu &&
                            tab[l + 2][c - 2] == joueurActu &&
                            tab[l + 3][c - 3] == joueurActu) gagné = true;
                    }
                }
            }

            if (gagné) {
                // Afficher la grille finale
                for (int l = 0; l < ligne; l++) {
                    for (int c = 0; c < colonne; c++) {
                        System.out.print(tab[l][c] + " ");
                    }
                    System.out.println();
                }
                System.out.println("🎉 Joueur " + joueurActu + " a gagné !");
                break; // fin du jeu
            }

            // Vérifier match nul
            rempli = true;
            for (int c = 0; c < colonne; c++) {
                if (tab[0][c] == vide) {
                    rempli = false;
                    break;
                }
            }
            if (rempli) {
                System.out.println("Match nul !");
                break; // fin du jeu
            }

            // Changer de joueur
            joueurActu = (joueurActu == joueur1) ? joueur2 : joueur1;
        }

        scanner.close();
    }
}
/*package Labo;

import java.util.Scanner;

public class Puissance4 {

	public static void main(String[] args) {
		// 
	    int ligne=6;
	    int colonne=7;
	    char vide='.'; 
	    char joueur1='X';
	    char joueur2='0';
	    char joueurActu;
	    boolean placé=false;
	    boolean gagné=false;
	    boolean rempli=true;
		char [][]tab= new char [6][7];
		
		
		for (int l =0; l<ligne; l++) {//initialisation de la grille vide 
			for (int c =0; c<colonne; c++) {
				tab [l][c]=vide;
			}
		}
	Scanner scanner= new Scanner (System.in);
	   joueurActu=joueur1;
	 
	 while (true) {//Afficher la grille
	    for (int l=0; l<ligne; l++) {
				for (int c=0; c<colonne; c++) {
					System.out.print(tab[l][c] + " ");
				}
				System.out.println();
			}
	        System.out.println("0, 1, 2, 3,4, 5, 6");
	
	
	
	//Demander une colonne
    System.out.println(" Joueur " + joueurActu + " ,choisis une colonne (0-6) : " );
    if (!scanner.hasNextInt()) {
    	System.out.println(" Entrée invalide, veuillez entrer un nombre. " );
    	scanner.next();    
    	continue;
     }
     int col =scanner.nextInt();
      placé =false; 
     if (col>=0 && col<colonne) {
    	 for(int l=ligne-1; l>=0; l--) {//Boucle de placement
    		 if (tab[l][col]==vide) {
    			 tab[l][col]=joueurActu;
    			 placé=true;
    			return;
    		 }
    	 }
     }
     if (!placé) {
    	 System.out.println(" Colonne invalide ou pleine, réessaie ! " );
    	 continue;
     }
      
    gagné=false; //  vérifier victoire
       for (int l=0; l<ligne; l++) {
    	   for (int c=0; c<colonne; c++) {
    		   if (tab[l][c]==joueurActu) {
        			if(c + 3 <colonne && tab[l][c+1]==joueurActu && tab[l][c+2]==joueurActu && tab[l][c+3]==joueurActu) gagné=true;//-> horizontal
        			if(l + 3 <ligne && tab[l+1][c]==joueurActu && tab[l+2][c]==joueurActu && tab[l+3][c]==joueurActu) gagné=true; //|
        			if(l+3<ligne && c+3 <colonne && tab[l+1][c+1]==joueurActu && tab[l+2][c+2]==joueurActu && tab[l+3][c+3]==joueurActu)gagné=true;//Diagonal\
        			if(l+3<ligne && c-3>=0 && tab[l+1][c-1]==joueurActu && tab[l+2][c-2]==joueurActu && tab[l+3][c-3]==joueurActu) gagné=true;//Diagonal/
        			
        		}
        	}
        }
       if (gagné) {//Afficher la grille finale
    	   for(int l=0; l<ligne; l++) {
    		   for(int c=0; c<colonne; c++) {
    			   System.out.print(tab[l][c] + " " );
    		   }
    		   System.out.println();
    	   }
    	   System.out.println(" Joueur " + joueurActu + " a gagné ! ");
    	   return;
       }
      rempli=true; //Vérifier match nul
      for(int c=0; c<colonne; c++) {
    	  if (tab[0][c]==vide) {
    		  rempli=false;
    		  return;
    	  }
      }
      if (rempli) {
    	  System.out.println(" Match nul ! ");
      }
      joueurActu=(joueurActu == joueur1)? joueur2 : joueur1; //Changer de joueur
     
	 }	

   }
  
}
*/
