package découverte;

public class MesPremiersVecteurs {

	public static void main(String[] args) {
		double tabD[]= {1.2 , 1.3 , 1.8 , 1.9 , 1.7};
		char[] tabC= {'d','f','5','@'};
		// d�claration, cr�ation et le remplissage en m�me temps
		int tabI2[]= {1,4,7,2,5,8,3,6,9,0};
		int[] tabI; // d�claration
		tabI= new int[8]; // cr�ation et initialisation avec 0
		// soit sur la m�me ligne soit � un autre moment
		String[] tabS= new String[5];
		
		
		for(int i=0; i<tabD.length;i++) {
			System.out.print(tabD[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<tabC.length;i++) {
			System.out.print(tabC[i]+"\t");
		}
		System.out.println();
		affiche(tabI);
		affiche(tabI2);
		int nb1=4,nb2=5;
		somme(nb1,nb2);// j'ignore la valeur de renvoi
		System.out.println(somme(5,98)); // affiche la valeur de renvoi
		if(somme(4,5)==0) {
			System.out.println("waouh !!");
		}
		System.out.println(nb1+" "+nb2);
	}
	public static void affiche(int[] t) {
		for(int i=0; i<t.length;i++) {
			System.out.print(t[i]+"\t");
		}
		System.out.println();
		
	}
	public static int somme(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
		a=564;
		b=-89;
		return a+b;
	}

}
