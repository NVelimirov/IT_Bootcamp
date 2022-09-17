import java.util.Scanner;

public class Domaci6 {
    public static void main(String[] args) {
        /*Napisati pomocu petlje program koji racuna sumu kvadratnih vrednost od 1 2 3 i 5, ako korisnik unese
        0, izlazi iz programa. (Obratiti paznju na negativne brojeve).*/
        Scanner s = new Scanner(System.in);
        int zbir = 0;

        for (; true; ) {
            System.out.print("Unesite broj od 1 do 5, ukoliko zelite da zavrsite unesite 0: ");
            int broj = s.nextInt();

            if (broj == 0) {
                System.out.println("Igra je zavrsena!");
                break;
            }
            if (broj > 5) {
                System.out.println("Unesite broj od 1 do 5");
            }
            zbir += Math.pow(broj, 2);
        }
        System.out.println("Zbir unetih brojeva je: " + zbir);
    }
}
