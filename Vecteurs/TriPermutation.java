package Vecteurs;
import découverte.UtilTab;

public class TriPermutation {

    public static void main(String[] args) {
        int[] v= {5,4,8,2,3,9,12,0,1,89};

        UtilTab.affiche(v);
        tri(v);
        UtilTab.affiche(v);

    }
    public static void tri(int[] t) {
        boolean permut;
        int i, temp;
        do {
            permut= false; // réinitialisation de permut à faux
                           // mon drapeau est baissé   
            for (i=0;i<t.length-1;i++) { // je passe ne revue toutes les cases
                if(t[i]>t[i+1]) { // si 2 mal placées 
                    temp=t[i]; //je les permutte
                    t[i]=t[i+1];
                    t[i+1]=temp;
                    permut=true; // je lève mon drapeau
                }
            }
        }while (permut); //idem permut==true
        // je boucle tant que j'ai encore fait une permutation
        // j'arrête si après un tout du vecteur, je ne dois plus rien permutter ce que c'est trié
        // permut est resté à true
    }

}