package Boucles;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

	int  nb=0, cpt=1;
	
	System.out.println("Entrez un nombre et je vous donnerai sa table de multiplication :");
	//nb=new Scanner(System.in).nextInt();
	nb=UtilMethodes.saisieInt();
	
	while (cpt<=10) {
		System.out.println(nb + "X" + cpt + "=" + nb*cpt);
		cpt ++;
	}

  }

}
