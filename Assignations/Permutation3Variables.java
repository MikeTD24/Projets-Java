package Assignations;

import java.util.Scanner;

public class Permutation3Variables {

	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0, temp = 0; 
		
        System.out.print("Entrez une valeur pour a ");
		
		a=new Scanner(System.in).nextInt();
		
		System.out.print("Entrez une valeur pour b ");
		
		b=new Scanner(System.in).nextInt();
		
		System.out.print("Entrez une valeur pour c ");
		
		c=new Scanner(System.in).nextInt();
		
		
		temp = a;
		a = b;
		b = c;
		c = temp;
		
		System.out.println(" les valeurs finales sont :" + a + b + c );
		
		
		
		
		
		
	}

}
