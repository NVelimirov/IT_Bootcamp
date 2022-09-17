import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Domaci9 {
    //Napisati program gde unosite velicinu niza, zatim elemente niza, zatim istampati niz u suprotnom redosledu.
    //Primer:
    //Unos: 1, 2, 3, 4, 5
    //Ispis: 5, 4, 3, 2, 1
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = s.nextInt();
        int [] niz = new int[duzinaNiza];
        int [] nizUnazad = new int [duzinaNiza];

        for (int i = 0; i < niz.length; i++){
            System.out.println("Uneiste elemente niza: ");
            niz[i] = s.nextInt();
        }
        System.out.println("Inicijalni niz je: " + Arrays.toString(niz));
        //-1 jer ako je duzinaNiza=5, index 5 ne postoji i izbaci ce gresku (jer index krece od 0, ne od 1, stoga je 0,1,2,3,4, a ne 1,2,3,4,5)
        for (int j = niz.length - 1, k = 0; j >= 0; j--, k++) {
            nizUnazad[k] = niz[j];
            //System.out.println(nizUnazad[j]);
        }
        System.out.println("Dok je niz unazad: " + Arrays.toString(nizUnazad));
    }
}
