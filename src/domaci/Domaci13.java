package com.itbootcamp.bgqa.domaci;

import java.util.Arrays;
import java.util.Scanner;

//1. Napisati program sa metodama za:
//1.1 Metoda za unos imena (String element) i ispis niz-a svih elemenata nakon sto se unesu
//Unos: Marko
//Unos : Jelena
//Unos: Dejan
//Ispis: Marko, Jelena, Dejan
//1.2 Metoda koja pronalazi uniju elemenata neka dva niza i ispisuje tu uniju kao treci niz
//Unos Marko, Jelena, Nikola
//Unos: Milan, Jelena, Nikola
//Ispis: Marko, Jelena, Nikola, Milan
public class Domaci13 {
    public static void main(String[] args) {
        String[] imena = new String[0];
        unijaNizova(imena);
    }

    public static String[] unosImena(String[] imena) {
        Scanner s = new Scanner(System.in);
        //System.out.print("Unesite zeljenu duzinu niza: ");
        //int duzinaNiza = s.nextInt();
        imena = new String[3];
        System.out.println("Unesite " + imena.length + " imena u niz.");
        for (int i = 0; i < imena.length; i++) {
            System.out.print("Unesite ime: ");
            imena[i] = s.next();
        }
        return imena;
    }

    public static void unijaNizova(String[] imena) {
        String[] imena1 = unosImena(imena);
        String[] imena2 = unosImena(imena);

        for (int i = 0; i <= imena1.length; i++) { // ova petlja mi radi odvojeno, kada direktno u kod unesem imena, ovako mi iz izlistava sva imena (jer ne printuje nista iz void unijaNizova nego sve elemente unetih nizova)
            boolean exist = false;
            for (int j = 0; j < imena2.length; j++) {
                if (i < imena1.length) {
                    if (imena1[i] == imena2[j])
                        exist = true;
                } else
                    System.out.print(imena2[j] + ", ");
            }
            if (!exist && i < imena1.length)
                System.out.print(imena1[i] + ", ");
        }

    }
}
