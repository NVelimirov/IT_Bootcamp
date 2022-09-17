package domaci;

import java.util.Scanner;

public class Domaci4 {//Istampati sve samoglasnike iz proizvoljnog stringa.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite rec: ");
        String rec = s.nextLine();
        int index = 0;
        int samoglasnikCout = 0;

        while (index < rec.length()){
            char currentChar = rec.charAt(index);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'){
                samoglasnikCout++;
            }
            index++;
        }
        System.out.println("Broj samoglasnika u reci je: " + samoglasnikCout);
    }
}
