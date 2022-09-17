import java.util.Scanner;
//imam dve alternativnu verziju ispod i pitanje
public class Domaci3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi negativan broj: ");
        int x = s.nextInt();
        x = Math.abs(x);
        System.out.print("Unesite drugi negativan broj: ");
        int y = s.nextInt();
        y = Math.abs(y);
        int proizvod = 0;

        while (x > 0) {
            proizvod = proizvod + y;
            x--;
        }
        System.out.println("Proizvod brojeva je : " + proizvod);
    }
}
/* ALTERNATIVNO
import java.util.Scanner;

public class Domaci3Alt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi negativan broj: ");
        int x = s.nextInt();
        System.out.print("Unesite drugi negativan broj: ");
        int y = s.nextInt();
        int proizvod = 0;

        while (x < 0) {

            proizvod = Math.abs(proizvod - y);
            x++;
        }
        System.out.println("Proizvod brojeva je : " + proizvod);
    }
}
 */
/*
proizvod = Math.abs(proizvod - y); da li je ovo logika iza ove naredbe?

0 - (-5) = 5
5 - (-5) = 10
10 - (-5) = 15
etc.

a da je : proizvod = Math.abs(proizvod + y);

0 + (-5) = -5
5 + (-5) = 0
0 + (-5) = -5

etc.
 */
/* ALT 2
import java.util.Scanner;

public class Domaci3Alt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi negativan broj: ");
        int x = s.nextInt();
        System.out.print("Unesite drugi negativan broj: ");
        int y = s.nextInt();
        int proizvod = 0;

        while (x < 0) {

            proizvod = proizvod + y;
            x++;
        }
        proizvod = Math.abs(proizvod);
        System.out.println("Proizvod brojeva je : " + proizvod);
    }
}
 */