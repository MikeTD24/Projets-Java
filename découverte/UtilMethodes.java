package découverte;

import java.util.Scanner;

public class UtilMethodes {
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
	public static int saisieInt() {
		int nb=0;
		boolean ok;
		do {
			try {
				ok=true;
				System.out.println("entrez un nombre entier");
				nb=new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("je t'ai demand� un entier !");
				ok=false;
			}
			// }while(ok==false);
		}while (! ok);
		return nb;
	}
	public static int saisieInt(String msg) {
		int nb=0;
		boolean ok;
		do {
			try {
				ok=true;
				System.out.println(msg);
				nb=new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("je t'ai demand� un entier !");
				ok=false;
			}
			// }while(ok==false);
		}while (! ok);
		return nb;
	}
	public static int saisieInt(String msg, int min) {
		int nb=0;
		boolean ok;
		do {
			try {
				ok=true;
				System.out.println(msg);
				nb=new Scanner(System.in).nextInt();
				if(nb<min) {
					System.out.println("la valeur doit �tre sup�rieure � "+min);
					ok=false;
				}
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("je t'ai demand� un entier !");
				ok=false;
			}
			// }while(ok==false);
		}while (! ok);
		return nb;
	}
	public static int saisieInt(String msg, int min, int max) {
		int nb=0;
		boolean ok;
		do {
			try {
				ok=true;
				System.out.println(msg);
				nb=new Scanner(System.in).nextInt();
				if(nb<min|| nb>max) {
					System.out.println("la valeur doit �tre comprise entre "+min+" et "+max);
					ok=false;
				}
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("je t'ai demand� un entier !");
				ok=false;
			}
			// }while(ok==false);
		}while (! ok);
		return nb;
	}
	public static double saisieDouble() {
		double nb=0;
		boolean ok=true;
		do {
			try {
				ok=true;
				System.out.println("entrez un nombre d�cimal");
				nb=new Scanner(System.in).nextDouble();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("je t'ai demand� un nb d�cimal !");
				ok=false;
			}
			// }while(ok==false);
		}while (! ok);
		return nb;
	}

}
