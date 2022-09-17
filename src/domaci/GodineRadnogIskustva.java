package domaci;

import java.util.Scanner;

public class GodineRadnogIskustva {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite godinu pocetka radnog odnosa brojevima: ");
        int godinaPocetka = s.nextInt();
        int trenutnaGodina = 2022;
        int radnoIskustvo = trenutnaGodina - godinaPocetka;

        if (radnoIskustvo < 0) {
            System.out.println("Uneli ste godinu koja sledi, najranija godina koju mozete uneti je trenutna");
        } else if (radnoIskustvo <= 4) {
            System.out.println("Vi ste junior programer");
        } else if (radnoIskustvo <= 8) {
            System.out.println("Vi ste senior programer");
        } else if (radnoIskustvo >= 65) {
            System.out.println("Vi ste u penziji");
        } else if (radnoIskustvo > 8) {
            System.out.println("Vi ste direktor firme");
        }
        System.out.println("***Kraj***");


    }
}
