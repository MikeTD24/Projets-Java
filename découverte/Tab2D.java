package découverte;

public class Tab2D {

	public static void main(String[] args) {
		char[][] t1= {{'a','b','c','d'}   ,{'e','f'},  {'x','y','z'}};
		boolean[][] t2= new boolean[10][3];// 10 lignes et 3 colonnes
		int t3[][];
		int lig, col;
		lig=0;
		while(lig<t1.length) {
			col=0;
			while(col<t1[lig].length) {
				System.out.print(t1[lig][col]+"\t");
				col++;
			}
			System.out.println();
			lig++;
		}
		System.out.println("*****************************");
		t2[3][1]=true;
		for(lig=0;lig<t2.length;lig++) {
			for(col=0; col<t2[lig].length; col++) {
				System.out.print(t2[lig][col]+"\t");
			}
			System.out.println();
		}

		do{
			System.out.println("bonjour, combien de lignes veux-tu aujourd'hui ?");

			lig=UtilMethodes.saisieInt();
		}while(lig<=0);
		do {
			System.out.println("bonjour, combien de colonnes veux-tu ?");
			col=UtilMethodes.saisieInt();
		}while(col<=0);
		t3= new int[lig][col];
		for(lig=0;lig<t3.length;lig++) {
			for(col=0; col<t3[lig].length; col++) {
				System.out.print("entre la valeur pour la ligne "+
						lig+" et la colonne "+col+"\t");
				t3[lig][col]= UtilMethodes.saisieInt();
			} // col suivant
		}// lig suivant
		UtilTab.affiche(t3);
		// t3[10][10]=5689;
		// java.lang.ArrayIndexOutOfBoundsException 
		// si on d�passe la limite d'une dimension
	}

}
