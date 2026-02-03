package découverte;

public class LundiUnPeuBeaucoup {

	public static void main(String[] args) {
		int nb;
		int[] t ;
		UtilMethodes.vendredi();
		nb=UtilMethodes.saisieInt("Combien de cases veux tu ??");
		t=new int[nb];
		for(int i=0;i<t.length;i++) {
			t[i]=UtilMethodes.saisieInt("donne-moi la valeur de la case "+i);
		}
		UtilTab.affiche(t);
		
		

	}

}
