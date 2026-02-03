package découverte;

import java.util.Scanner;

public class LesMéthodes {
	public static void vendredi() {
		System.out.println("***************************");
		System.out.println("**          *            **");
		System.out.println("**    on est vendredi    **");
		System.out.println("**                       **");
		System.out.println("***************************");
	}
	public static void auRevoir() {
		System.out.println("***************************");
		System.out.println("**          *            **");
		System.out.println("**      au revoir :-)    **");
		System.out.println("**                       **");
		System.out.println("***************************");
	}
	public static void main(String[] args) {
		int nb1, nb2;
		vendredi();
		nb1=saisieInt();
		nb2=saisieInt();
		
		if(nb1>nb2)
			nb2=nb1;
		else
			nb1=nb2;
		System.out.println(nb1 + " et " + nb2);
		auRevoir();
	}
	public static int saisieInt() {
		int nb=0;
		double haut;
		boolean ok;
		do {
			try {
				ok=true;
				System.out.println("entrez un nombre entier");
				nb=new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("je t'ai demandé un entier !");
				ok=false;
			}
			// }while(ok==false);
		}while (! ok);
		return nb;
	}
}
