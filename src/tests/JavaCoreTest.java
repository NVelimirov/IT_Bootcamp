package tests;

import java.util.Arrays;
import java.util.Scanner;

/**
 * TEST 1 JAVA
 * Oblasti pokrivene testom: PROMENLJIVE, GRANANJA, PETLJE, NIZOVI, METODE
 * Vreme trajanja testa: 120 minuta
 * Maksimalan broj poena: 100
 * Broj poena po zadatku: 20
 * <p>
 * Ime klase: ImePrezime(PeraPeric)
 * Napomena: Zadatak se smatra uradjenim ukoliko implementira zadatu funkcionalnost sa arbitrarnim argumentima.
 * Neki od mogucih argumenata su dati u javadoc opisu implementacije.
 * Ne menjati potpise metoda zbog brzeg i lakseg uvida u rad.
 * Voditi racuna da metoda vraca zahtevanu vrednost.
 * <p>
 * Po zavretku upload-ovati file na uploadLokacija.
 * UploadLokacija: https://drive.google.com/drive/folders/17gLXRxx8l7Y_JN8WsAlXVjpRGwd8dq4z
 */

public class JavaCoreTest {

    /**
     * Implementirati deskripciju numericke ocene.
     * 5 - odlican
     * 4 - vrloDobar
     * 3 - dobar
     * 2 - dovoljan
     * 1 - nedovoljan
     * Za svaku ocenu koja nije 1-5 vratiti prazan string ""
     *
     * @param ocena ocena
     * @return deskripcija numericke ocene
     */
    public static String ocene(int ocena) {
        String uspeh = " ";
        if (ocena == 5) {
            uspeh = "odlican";
        } else if (ocena == 4) {
            uspeh = "vrloDobar";
        } else if (ocena == 3) {
            uspeh = "dobar";
        } else if (ocena == 2) {
            uspeh = "dovoljan";
        } else if (ocena == 1) {
            uspeh = "nedovoljan";
        } else {
            uspeh = " ";
        }

        return uspeh;
    }

    /**
     * Implementirati metodu koja vraca sumu svih elemenata niza, i to tako da je
     * svaki element pomnozen sa indeksom na kojim se nalazi.
     * {1, 2, 3, 4, ...} -> (1 * 0) + (2 * 1) + (3 * 2) + (4 * 3) + ...
     * {99} -> 99 * 0
     * {} -> 0
     *
     * @param niz unos niz
     * @return suma
     */
    public static int proizvodElemenataNizaSaIndeksima(int[] niz) {
        int eleIndex = 0;
        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            eleIndex = i * niz[i];
            suma += eleIndex;
        }
        return suma;
    }

    /**
     * Implementirati metodu koja pretvara niz od String podataka u niz
     * u kome su svi stringovi mala slova.
     * {"Stefan", "Dusan", "Ana"} -> {"stefan", "dusan", "ana"}
     * {"ZDRAVO JA SAM PROGRAM"} -> {"zdravo ja sam program"}
     * {"ZDRAVO JA", "SAM PROGRAM"} -> {"zdravo ja", "sam program"}
     * {} -> {}
     *
     * @param niz unos niz
     * @return novi niz sa malim slovima
     */
    public static String[] lowerCaseNiz(String[] niz) {
        String[] malaSlova = new String[niz.length];
        String izdvojenaRec = "";
        String recMaloSlovo = "";
        for (int i = 0; i < niz.length; i++) {
            izdvojenaRec = niz[i];
            recMaloSlovo = izdvojenaRec.toLowerCase();
            malaSlova[i] = recMaloSlovo;
        }
        return malaSlova;
    }

    /**
     * Implementirati metodu koja vraca indeks na koji treba ubaciti element,
     * tako da je redosled elemenata sacuvan. Pretpostaviti da je niz rastuci.
     * ({1, 2, 3, 4, 5}, 1.5) -> 1
     * ({77, 78, 79, 80, 81}, 76.999999) -> 0
     * ({-11, -10, -9, -8, -7}, 7) -> 5
     *
     * @param element broj
     * @param niz     niz kao input
     * @return index
     */
    public static int indexGdeElementPripada(int element, int[] niz) {
        int index = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < element) {
                index = i + 1;
            }
        }

        return index;
    }

    /**
     * Implementirati metodu koja vraca slovo koje fali u nizu alfabeta.
     * Alfabet : A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
     * ABD -> "C"
     * IJKLN -> "M"
     * WXYZ -> ""
     *
     * @param nizSlova niz slova. Ne mora pocinjati sa "A"
     * @return slovo koje nedostaje, ili prazan string "" ukoliko je redosled ispravan
     */
    public static String abeceda(String nizSlova) {
        String[] alfabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        char slovo = ' ';
        String slovoKojeNedostaje = "";
        int brojacIndexaSlova = 0;//da bih znao od kog indexa da pocnem da uporedjujem niz sa stringom

        for (int i = 0; i < alfabet.length; i++){
            brojacIndexaSlova++;
            if (alfabet[i].equals(nizSlova)){
                //brojacIndexaSlova = i;
            }
        }
        /*for (int j = 0, k = 0; j < alfabet.length; j++){
            slovo = nizSlova.charAt(0);
            if (alfabet[j].equals(nizSlova.charAt(k))){
                brojacIndexaSlova = j;
                break;
            }
        }*/
        System.out.println(brojacIndexaSlova);
        for (int i = 0; i < nizSlova.length(); i++) {
            slovo = nizSlova.charAt(i);
            if (!alfabet[i].equals(slovo)) {
                slovoKojeNedostaje = alfabet[i];
            }
        }
        return slovoKojeNedostaje;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //System.out.println(ocene(5));
        //System.out.println(proizvodElemenataNizaSaIndeksima(new int[] {2, 2, 2}));
        //System.out.println(Arrays.toString(lowerCaseNiz(new String[]{"Zdravo Ja", "Se Zovem", "Ana"})));
        //System.out.println((indexGdeElementPripada(0, new int[] {-5,-4,-3,-2,-1})));
        System.out.println((abeceda("ABD")));
    }
}
