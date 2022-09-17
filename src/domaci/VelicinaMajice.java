import java.util.Scanner;

public class VelicinaMajice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite velicinu majice od 24 do 42: ");
        int velicinaMajice = s.nextInt();

        switch (velicinaMajice) {
            case 24:
                System.out.println("S velicina");
                break;
            case 30:
                System.out.println("M Velicina");
                break;
            case 36:
                System.out.println("L Velicina");
                break;
            case 42:
                System.out.println("XL velicina");
                break;
            default:
                System.out.println("Pogresan unos");
        }
        System.out.println("***Kraj***");
    }
}
