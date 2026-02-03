package découverte;

public class UtilTab {
	public static void affiche(int[][] t) {
		int lig, col;
		for(lig=0;lig<t.length;lig++) {
			for(col=0; col<t[lig].length; col++) {
				System.out.print(t[lig][col]+"\t");
			}
			System.out.println();
		}
	}
	public static void affiche(char[][] t) {
		int lig, col;
		for(lig=0;lig<t.length;lig++) {
			for(col=0; col<t[lig].length; col++) {
				System.out.print(t[lig][col]+"\t");
			}
			System.out.println();
		}
	}
	public static void affiche(boolean[][] t) {
		int lig, col;
		for(lig=0;lig<t.length;lig++) {
			for(col=0; col<t[lig].length; col++) {
				System.out.print(t[lig][col]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void affiche(int[] t) {
		for(int i=0; i<t.length;i++) {
			System.out.print(t[i]+"\t");
		}
		System.out.println();
		
	}
	
	public static void affiche(int t) {
		for(int i=0; i<10;i++) {
			System.out.print(t+"\t");
		}
		System.out.println();
		
	}public static void affiche(char[] t) { 	// overloading 
										  	//ou surcharge de méthodes
		for(int i=0; i<t.length;i++) {
			System.out.print(t[i]+"\t");
		}
		System.out.println();
		
	}
	public static void affiche(double[] t) {
		for(int i=0; i<t.length;i++) {
			System.out.print(t[i]+"\t");
		}
		System.out.println();
		
	}
	public static void affiche(boolean[] t) {
		for(int i=0; i<t.length;i++) {
			System.out.print(t[i]+"\t");
		}
		System.out.println();
		
	}
	public static void affiche(String[] t) {
		for(int i=0; i<t.length;i++) {
			System.out.print(t[i]+"\t");
		}
		System.out.println();
		
	}
}
