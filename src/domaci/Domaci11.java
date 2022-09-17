package domaci;

import java.util.Scanner;

//Uneti broj ciji faktorijal zelite da izracunate (5! = 5 * 4 * 3 * 2 * 1)
//Unos: 5
//Ispis: 120
public class Domaci11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = s.nextInt();
        int kopijaBroja = broj;
        int faktorijal = faktorijal(broj, kopijaBroja);

    }
    public static int faktorijal (int broj, int kopijaBroja){
        int faktorijal = 0;
        if (broj == 0) {
            faktorijal = 1;
        }
        for (int i = 1; broj > 0; broj--) {
            i++;
            i = broj * (i - 1);
            faktorijal = i;
        }

        System.out.println("Faktorijal od broja " + kopijaBroja + " je: "  + faktorijal);
        return faktorijal;
    }
}
