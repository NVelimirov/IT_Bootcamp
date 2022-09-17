package domaci;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Domaci7 {
    //Napraviti  program gde cete da unosite imena u neki niz.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj reci koji zelite da uneste: ");
        int brojReci = s.nextInt();
        String [] reci = new String[brojReci];

        for (int i = 0; i < brojReci; i++) {
            System.out.println("Unesite rec broj " + (i + 1) + " :");
            String novaRec = s.next();
            reci[i] = novaRec;
        }
        System.out.println("Imena koja ste uneli u niz su: " + Arrays.toString(reci));


    }
}
