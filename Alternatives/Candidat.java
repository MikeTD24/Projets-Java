package Alternatives;

import java.util.Scanner;

public class Candidat {

	public static void main(String[] args) {
		int age=0;
		String prenom; 

		System.out.print("Entrez votre prénom : ");

		prenom=new Scanner(System.in).nextLine();

		System.out.print("Entrez votre âge : ");

		age=new Scanner(System.in).nextInt();


		if (prenom.equalsIgnoreCase( "Isabelle")) {
			System.out.println("Pas sélectionnée");
		}
		else {
			if ( age <20 || age>50 ) {
				System.out.println("Vous n'êtes pas concerné");
			}
			else {
				if (age>=20 && age <=30 & age !=25 & age!=26) {

					System.out.println("Formation A :"); 
				}
				else {
					if (age>=31 && age<=50 &&!(age>=40 && age<=47)) {
						System.out.println("Formation B");
					}

					else {
						System.out.println("Formation C");

					}
				}




			}
		}
	}
}