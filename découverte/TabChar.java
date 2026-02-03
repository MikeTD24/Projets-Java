package découverte;

public class TabChar {

    public static void main(String[] args) {
        char[][]tab= new char[5][4];
        for(int lig=0; lig<tab.length; lig++) {
            for( int col=0;col<tab[lig].length;col++) {
                tab[lig][col]=(char)(97+lig);
                // 97 correspond dans la table ascii au 'a' minusucule
            }
        }
        UtilTab.affiche(tab);

    }

}