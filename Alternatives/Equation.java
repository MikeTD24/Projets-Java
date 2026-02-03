package Alternatives;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		int a, b; 
		//a*x + b = 0 
		
        System.out.print("Entrez un premier nombre pour a ");
		
		a=new Scanner(System.in).nextInt();
		
		System.out.print("Entrez un deuxième nombre pour b ");
		
		b=new Scanner(System.in).nextInt();
		
		if (a == 0) {
			if (b == 0) {
				System.out.println("L'équation a une infinité de solutions.");
		           } else {
		                System.out.println("L'équation n'a aucune solution.");
		            }
		        } else {
		            double x = - (double) b / a;
		            System.out.println("Équation: " + a + "x + " + b + " = 0");
		            System.out.println("Solution: x = " + x);
		        }
		    }



	}
