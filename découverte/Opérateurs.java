package découverte;

public class Opérateurs {

	public static void main(String[] args) {
		int nb1=13, nb2=7, nb3; 
		String mot1="pomme", mot2="orange", mot3="Pomme"; 
		//Opérateur mathématiques
		nb3=nb1 + nb2;
		nb3=nb1 - nb2;
		nb3=nb1 * nb2;
		nb3=nb1 / nb2;
		System.out.println(nb3);
		System.out.println(nb1/3); // division entière
		System.out.println(nb1/3.0); // division entier par un double donne un double
		System.out.println("un transtypage ou cast");
		System.out.println((double)nb1/nb2); //avec décimales
		System.out.println(nb1/(double)nb2); //avec décimales
		System.out.println((double)(nb1/nb2)); // ko car .0
		System.out.println("modulo "+ nb1%nb2);
		
		
		//l'exposant 
		System.out.println("2 exposant 3 : " +Math.pow(2, 3));
		
		nb3=(int)Math.pow(2, 3); 
		System.out.println(Math.PI);
		System.out.println(Math.pow(9, 1/2)); // 9 exposant
		System.out.println(Math.pow(9, 0.5));
		System.out.println(Math.sqrt(9)); 
		
		
		//Opérateurs d'affectation
		nb3 = 56; 
		nb3 += 10; // nb3 = nb3 + 10;
		nb3 -= 10; // nb3 = nb3 - 10;
		nb3 *= 10; // nb3 = nb3 * 10;
		nb3 /= 10; // nb3 = nb3 / 10;
		
		nb3 =nb3 + 1; 
		nb3 +=1;
		nb3++; 
		
		nb3 =nb3 - 1; 
		nb3 -=1;
		nb3--; 
		
		//Opérateurs de Comparaisons
		
		// <, >, <=, >=, !=, ==
		System.out.println("nb3=4?" + (nb3==4)); 
		System.out.println("nb3<>4?"+ (nb3!=4));
		
		//!!!!!!!STRING!!!!!
		
		System.out.println("mot1=mot2 ? "+mot1.equals(mot2));
		System.out.println("mot1=mot3 ? "+mot1.equals(mot3));
		
		System.out.println("mot1=mot2 ? "+mot1.equalsIgnoreCase(mot2));
		System.out.println("mot1=mot3 ? "+mot1.equalsIgnoreCase(mot3));
		
		//True car ne tient pas compte de la casse
		
		
		//Opérateurs booléens
		// et ou pas
		// &  |   !
		
		System.out.println("nb1<nb2 et nb2<nb3 ?"+ (nb1<nb2 & nb2<nb3));// & évaluation longue il teste tout
		System.out.println("nb1<nb2 et nb2<nb3 ?"+ (nb1<nb2 && nb2<nb3)); //évaluation courte && si 1er opérande est à faux il ne teste pas l'autre
		
		System.out.println("nb1>10 ou nb1<3 ?"+ (nb1>10 | nb1<3));// & évaluation longue il teste tout
		System.out.println("nb1>10 ou nb1<3 ?"+ (nb1>10 || nb1<3)); //évaluation courte && si 1er opérande est à faux il ne teste pas l'autre
		
		System.out.println("not (nb1>10 ou nb1<3) ?"+ !(nb1>10 || nb1<3)); // !
		
		//XOR ou ^
		// ou exclusif
		
		System.out.println("nb1>10 XOR nb1<3 ?"+ !(nb1>10 ^ nb1<nb3));
		
		
		
		
		
		

	}

}
