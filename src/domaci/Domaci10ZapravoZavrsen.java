import java.util.Arrays;
import java.util.Scanner;

public class Domaci10ZapravoZavrsen {
    //U prvom programu, nakon sto se obrne redosled, dodati funkcionalnost izbacivanja svih parnih brojeva.
    //Unos: 5, 4, 3, 2, 1
    //Ispis: 5, 3, 1
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

        for (int j = niz.length - 1, k = 0; j >= 0; j--, k++) {
            nizUnazad[k] = niz[j];
            //System.out.println(nizUnazad[j]);
        }
        System.out.println("Dok je niz unazad: " + Arrays.toString(nizUnazad));
        int brojacNeparnih = 0;
        int [] nizUnazadNeparnih = new int[duzinaNiza];
        for (int i = 0; i < nizUnazadNeparnih.length; i++) {
            if (nizUnazad[i] % 2 != 0) {
                nizUnazadNeparnih[i] = nizUnazad[i];
                brojacNeparnih++;
            }
        }

        System.out.println("Broj neparnih u ovom nizu je: " + brojacNeparnih);
        //System.out.println(Arrays.toString(nizUnazadNeparnih));
        int [] nizNeparnih = new int[nizUnazadNeparnih.length];

        for (int i = 0, j = 0; i < nizNeparnih.length; i++) {
            if (nizUnazadNeparnih[i] != 0) {
                nizNeparnih[j] = nizUnazadNeparnih[i];
                j++;
            }
        }
        int [] nizKrajnji = new int[brojacNeparnih];
        for (int i = 0; i < nizKrajnji.length; i++) {
            nizKrajnji[i] = nizNeparnih[i];
        }
        System.out.println("Niz samo neparnih brojeva iz niza unazad je: " + Arrays.toString(nizKrajnji));
    }
}
