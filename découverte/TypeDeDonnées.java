package découverte;

public class TypeDeDonnées {

	public static void main(String[] args) {
		//8 tyoes de données primaires en Java
		// entiers
		byte nb1 ; // 1 octet -128 à 127
		short nb2 ; // 2 octets -32768 à 32767
		int nb3 ; // 4 octets -+2 milliards
		long nb4 ; // 8 octets -+9 x10 exp 19
		
		// nombres à virgule flottante
		float nb5 ; // 4 octets 
		double nb6 = 4.33 ; // 8 octets 
		
		// 1 et 1 seul caractère
		char lettre = 'x' ; // 2 octets
		lettre=' ' ; 
		
		//booléen
		boolean ok = true ;
		ok = false ; 
		
		//une infinité de classes
		String nom="dupont"; // délimité par des guillemets
		System.out.println(nom.toUpperCase());

	}

}
