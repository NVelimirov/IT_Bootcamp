package domaci;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Domaci8 {
    //U istom tom programu dodati ispis za sve reci koja pocinju na 'M'.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj imena koji zelite da uneste: ");
        int brojImena = s.nextInt();
        String [] imena = new String[brojImena];
        String [] imenaSaPrvimSlovomM = new String[brojImena];
        int brojacImenaSaPrvimSlovomM = 0;

        for (int i = 0; i < brojImena; i++) {
            System.out.println("Unesite rec broj: ");
            String novaRec = s.next();
            imena[i] = novaRec;
        }

        for (int j = 0; j < brojImena; j++){
            if (imena[j].charAt(0) == 'M' || imena[j].charAt(0) == 'm') {
                imenaSaPrvimSlovomM[brojacImenaSaPrvimSlovomM] = imena[j];
                brojacImenaSaPrvimSlovomM++;
            }
        }
        String [] imenaM = new String[brojacImenaSaPrvimSlovomM];

        for (int k = 0; k < imenaM.length; k++) {
            imenaM[k] = imenaSaPrvimSlovomM[k];
        }
        System.out.println("Imena koja pocinju sa slovom M su: ");
        System.out.println(Arrays.toString(imenaM));

    }
}
/*alt
      for (int y = 0; y < brojReci; y++){
            String currentRec = reci[y];
            if (currentRec.charAt(0) == 'M' ) {
                System.out.println(currentRec);
 */