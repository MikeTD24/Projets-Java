package Assignations;

import java.util.Scanner;

public class ExpBooleennes {

	public static void main(String[] args) {
		
		int nb;
		
		System.out.println("Veuillez encoder un  nombre :");
		nb=new Scanner(System.in).nextInt();
		
		System.out.println("le nombre est compris entre 5 et 10 " + (nb>=5 && nb<=10));
		System.out.println("le nombre est compris entre 5 et 99 et différent de 10 " + (nb>=5 && nb<=99 && nb!=10));
		System.out.println("le nombre n'est pas compris entre 6 et 85" + !(nb>=6 && nb<=85));
		System.out.println("le nombre est compris entre 1 et 18 ou entre 65 et 90" + (nb>=1 && nb<=18 || nb>=65 && nb<=90));
		System.out.println("le nombre est une année bissextile" + (nb%400==0 || ((nb%4==0) && !(nb%100==0)))); 
		
	
	
	}

}
