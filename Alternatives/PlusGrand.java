package Alternatives;

import java.util.Scanner;

public class PlusGrand {

	public static void main(String[] args) {
		int nb1= 0; 
		int nb2=0;

		System.out.println("Veuillez encoder votre premier nombre :");
		nb1=new Scanner(System.in).nextInt();

		System.out.println("Veuillez encoder votre deuxième nombre :");
		nb2=new Scanner(System.in).nextInt();


		if (nb1==nb2) {
			System.out.println( nb1 + "=" +nb2);
			
		}
		else 
			if (nb1 > nb2) {
				System.out.println(nb1 + ">" + nb2);
			}
			else {
				System.out.println(nb1 + "<" + nb2);
			}



	}

}
