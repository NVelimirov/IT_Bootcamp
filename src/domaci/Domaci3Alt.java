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
