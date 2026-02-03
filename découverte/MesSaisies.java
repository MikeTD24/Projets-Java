package découverte;

import java.util.Scanner;

public class MesSaisies {

	public static void main(String[] args) {
		int nb;
		double haut;
		boolean ok;
		do {
			try {
				ok=true;
				System.out.println("entrez un nombre entier");
				nb=new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("je t'ai demandé un entier !!!!");
				ok=false;
			}
			// }while(ok==false);
		}while (! ok);
		
		ok=false;
		while(! ok) {
			try {
				ok=true;
				System.out.println("entrez votre hauteur en mètre");
				haut=new Scanner(System.in).nextDouble();
			}
			catch(java.util.InputMismatchException toto) {
				System.out.println("un nombre décimal avec comme séparateur une virgule");
				ok=false;
			}
		}

	}

}
