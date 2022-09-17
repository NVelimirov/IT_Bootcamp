package com.itbootcamp.bgqa.domaci;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Napraviti metod koji ce za dva uneta Stringa proveriti da li su iste velicine, ako su iste velicine,
//ispisati sve samoglasnike iz oba stringa.
//Prvi unos: mama
//Drugi unos: tata
//Prvi ispis: ova dva Stringa su jednaka
//Drugi ispis: samoglasnici su a,a,e,a
public class Domaci12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite Prvu rec: ");
        String rec1 = s.next().toLowerCase();
        System.out.println("Unesite drugi rec: ");
        String rec2 = s.next().toLowerCase();
        String duzinaReci = duzinaReci(rec1, rec2);
    }

    public static String duzinaReci (String rec1, String rec2) {
        int brojacReci1 = 0;
        int brojacReci2 = 0;
        boolean duzina = false;
        String duzinaReci = null;
        for (int i = 0; i < rec1.length(); i++){
            brojacReci1 = i;
        }
        for (int i = 0; i < rec2.length(); i++) {
            brojacReci2 = i;
        }
        
        if (brojacReci1 == brojacReci2){
            duzina = true;
            System.out.println("Ova dva stringa su iste duzine");
        } else {
            System.out.println("Reci nisu iste duzine.");
        }

        if (duzina == true){
            System.out.print("Samoglasnici u ovim recima su: ");
            for (int i = 0; i < rec1.length(); i++) {
                if (rec1.charAt(i) == 'a' || rec1.charAt(i) == 'e' || rec1.charAt(i) == 'i' || rec1.charAt(i) == 'o' || rec1.charAt(i) == 'u')
                    System.out.print(rec1.charAt(i) + ", ");
            }
            for (int i = 0; i < rec2.length(); i++) {
                if (rec2.charAt(i) == 'a' || rec2.charAt(i) == 'e' || rec2.charAt(i) == 'i' || rec2.charAt(i) == 'o' || rec2.charAt(i) == 'u')
                    System.out.print(rec2.charAt(i) + ", ");
            }
        }
        return duzinaReci;
    }
}
