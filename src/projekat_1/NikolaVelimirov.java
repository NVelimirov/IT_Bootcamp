package projekat_1;

import java.util.Arrays;
import java.util.Scanner;

public class NikolaVelimirov {
    //region Skeneri
    public static void skener1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Zbir ove cifre je: " + zbirCifara(s.nextInt()));
        System.out.println("");
        System.out.println("---Kraj programa 1---");
    }

    public static void skener2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Da li je prvi broj stepen drugog: " + stepenBroja(s.nextInt(), s.nextInt()));
        System.out.println("");
        System.out.println("---Kraj programa 2---");
    }

    public static void skener3() {
        Scanner s = new Scanner(System.in);
        int[] niz = new int[s.nextInt()];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = s.nextInt();
        }
        System.out.println("Indexi sabranih elemenata u nizu su: " + Arrays.toString(zbirIndexaNizaMeta((niz), 5)));
        System.out.println("");
        System.out.println("---Kraj programa 3---");
    }

    public static void skener4() {
        Scanner s = new Scanner(System.in);
        System.out.println("Vas broj u binarnom kodu: " + toBinary(s.nextInt()));
        System.out.println("");
        System.out.println("---Kraj programa 4---");
    }

    public static void skener5() {
        Scanner s = new Scanner(System.in);
        System.out.println("Broj ponavljanja unete reci je: " + brojPonavljanja(s.nextLine().toLowerCase(), s.nextLine().toLowerCase()));
        System.out.println("");
        System.out.println("---Kraj programa 5---");
    }

    public static void skener6() {
        Scanner s = new Scanner(System.in);
        int[] niz = new int[s.nextInt()];
        System.out.println("Unesite elemnte u niz: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = s.nextInt();
        }
        System.out.println("Vas inicijalni niz je " + Arrays.toString(niz));
        System.out.println("Vas niz je sada: " + Arrays.toString(pomeriNule(niz)));
        System.out.println("");
        System.out.println("---Kraj programa 6---");
    }

    public static void skener7() {
        Scanner s = new Scanner(System.in);
        int[] niz = new int[s.nextInt()];
        System.out.println("Unesite elemnte u niz: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = s.nextInt();
        }
        System.out.println("Vas inicijalni niz sa duplikatima je " + Arrays.toString(niz));
        System.out.println("Vas niz bez duplikata je sada: " + Arrays.toString(izbaciDuplikate(niz)));
        System.out.println("");
        System.out.println("---Kraj programa 7---");
    }

    public static void skener8() {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj telefona (Validni formati: (xxx) xxx-xxxx ili xxx-xxx-xxxx): ");
        System.out.println("Vas format je: " + validatePhone(s.nextLine()));
        System.out.println("");
        System.out.println("---Kraj programa 8---");
    }

    //endregion
    //region Zadaci
    //zadatak 1
    public static int zbirCifara(int cifra) {
        int zbir = 0;
        int temp = 0;

        for (; true; ) {
            zbir += cifra % 10;
            if (cifra >= 10) {
                cifra /= 10;
            } else if (cifra < 10) {
                temp = zbir;
                zbir = 0;
                break;
            }
        }
        if (temp >= 80) {
            zbir += temp % 10 + 8;
        } else if (temp >= 70) {
            zbir += temp % 10 + 7;
        } else if (temp >= 60) {
            zbir += temp % 10 + 6;
        } else if (temp >= 50) {
            zbir += temp % 10 + 5;
        } else if (temp >= 40) {
            zbir += temp % 10 + 4;
        } else if (temp >= 30) {
            zbir += temp % 10 + 3;
        } else if (temp >= 20) {
            zbir += temp % 10 + 2;
        } else if (temp >= 10) {
            zbir += temp % 10 + 1;
        } else if (temp < 10) {
            zbir = temp;
        }
        if (zbir == 10) {
            zbir = zbir % 10+1;
        }
        return zbir;
    }

    //zadatak 2
    public static boolean stepenBroja(int n, int m) {
        boolean stepen = true;
        int brojac = n;
        int ntiStepen = 0;

        for (int i = n; i > 0; i--) {
            brojac /= m;
            ntiStepen++;
            if (brojac == 1) {
                stepen = true;
                break;
            } else if (brojac < 1) {
                stepen = false;
                break;
            }
        }
        if (brojac == 1) {
            System.out.println(n + " je " + ntiStepen + ". stepen od " + m);
        }
        return stepen;
    }
    //zadatak 3
    public static int[] zbirIndexaNizaMeta(int[] niz, int meta) {
        int brojac = 0;
        int prviIndex = -1;
        int drugiIndex = 0;

        for (int i = 0; i < niz.length - 1; i++) {
            if (niz[i] < meta) {
                brojac++;
                for (int j = i + 1; j < niz.length; j++) {
                    if (niz[i] + niz[j] == meta) {
                        prviIndex = i;
                        drugiIndex = j;
                    }
                }
            }
        }
        if (prviIndex < 0 && drugiIndex <= 0) {
            System.out.println("Nema tog zbira u ovom nizu.");
        }
        int[] metaNiz = {prviIndex, drugiIndex};
        return metaNiz;
    }

    //zadatak 4
    public static String toBinary(int n) {
        int kopijaBroja = n;
        int temp = 0;
        int brojac = 0;
        String binarni = "";

        for (int i = 0; kopijaBroja > 0; i++) {
            temp = kopijaBroja % 2;
            kopijaBroja /= 2;
            brojac++;
        }

        int[] niz = new int[brojac];
        int[] niz2 = new int[brojac];

        for (int i = 0; n > 0; i++) {
            temp = n % 2;
            niz[i] = temp;
            n /= 2;
        }

        for (int i = 0, j = niz.length - 1; i < niz.length; i++, j--) {
            niz2[i] = niz[j];
            binarni += niz2[i];
        }
        return binarni;
    }

    //zadatak 5
    public static int brojPonavljanja(String s, String recenica) {
        String[] split = recenica.split("\\s+");
        int brojac = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(s)) {
                brojac++;
            }
        }
        return brojac;
    }

    //zadatak 6
    public static int[] pomeriNule(int[] niz) {
        int[] niz2 = new int[niz.length];

        for (int i = 0, j = 0; i < niz.length; i++) {
            if (niz[i] > 0) {
                niz2[j] = niz[i];
                j++;
            }
        }
        return niz2;
    }

    //zadatak 7
    public static int[] izbaciDuplikate(int[] niz) {
        int[] tempNiz = new int[niz.length];
        int brojacNiza2 = 0;

        for (int i = 0; i < niz.length; i++) {
            boolean imaDuplikata = false;
            for (int j = 0; j < tempNiz.length; j++) {
                if (niz[i] == tempNiz[j]) {
                    imaDuplikata = true;
                    break;
                }
            }
            if (imaDuplikata == true) {
                continue;
            } else {
                tempNiz[brojacNiza2] = niz[i];
                brojacNiza2++;
            }

        }
        int[] nizBezDuplikata = new int[brojacNiza2];
        for (int i = 0; i < nizBezDuplikata.length; i++) {
            nizBezDuplikata[i] = tempNiz[i];
        }
        return nizBezDuplikata;
    }

    public static boolean validatePhone(String num) {
        boolean dobarFormat = false;

        if (num.matches("(\\([0-9]{3}\\)) [0-9]{3}-[0-9]{4}")) {
            dobarFormat = true;
        } else if (num.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
            dobarFormat = true;
        } else {
            dobarFormat = false;
        }
        return dobarFormat;
    }

    //endregion
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int brojZaUlaz = 0;
        System.out.println("      ********************************************************");
        System.out.println("");
        System.out.println("1.....Unesite cifru da biste zbir cifara kao jednocifren broj.");
        System.out.println("2.....Unesite dva broja kako biste videli da li je prvi stepen drugog.");
        System.out.println("3.....Unesite niz u kom dva elementa daju zbir od 5, da bi vam program vratio indekse ta dva broja.");
        System.out.println("4.....Unesite broj da biste videli njegovu vrednost u binarnom kodu.");
        System.out.println("5.....Unesite rec koju zelite vise puta da ponovite, pa unesite recenicu u kojoj se ponavlja ta rec vise puta, da biste videli koji je njihov ukupan broj.");
        System.out.println("6.....Unesite niz koji u sebi sadrzi brojeve i nule, a program ce vam vratiti niz sa nulama na kraju.");
        System.out.println("7.....Unesite niz sa duplikatima, kako bi vam program vratio isti niz bez duplikata.");
        System.out.println("8.....Unesite broj telefona da biste videli da li je u odgovarajucem formatu.");
        System.out.println("");
        System.out.println("      ********************************************************");
        System.out.println("");
        do {
            System.out.print("Unesite repektivni broj kako biste pokrenuli program odgovarajuci, a za prekid programa unesite 0: ");
            brojZaUlaz = s.nextInt();

            if (brojZaUlaz == 1) {
                System.out.println("1. Unesite cifru: ");
                skener1();
            } else if (brojZaUlaz == 2) {
                System.out.println("2. Unesiste prvi, veci broj, pa odmah zatim i drugi manji broj: ");
                skener2();
            } else if (brojZaUlaz == 3) {
                System.out.println("3. Unesite duzinu niza, pa njegove elemente: ");
                skener3();
            } else if (brojZaUlaz == 4) {
                System.out.println("4. Unesite broj da biste videli njegovu vrednost u binarnom kodu: ");
                skener4();
            } else if (brojZaUlaz == 5) {
                System.out.println("5. Unesite jednu rec, pa zatim i recenicu: ");
                skener5();
            } else if (brojZaUlaz == 6) {
                System.out.println("6. Unesite duzinu niza, pa njegove elemente - brojeve i nule: ");
                skener6();
            } else if (brojZaUlaz == 7) {
                System.out.println("7. Unesite duzinu niza, pa njegove elemente sa duplikatima: ");
                skener7();
            } else if (brojZaUlaz == 8) {
                System.out.println("7. Unesite duzinu niza, pa njegove elemente sa duplikatima: ");
                skener8();
            } else if (brojZaUlaz > 8 || brojZaUlaz < 0) {
                System.out.println("Unesite broj od 1 do 8!");
            }
        } while (brojZaUlaz != 0);
        System.out.println("");
        System.out.println("*****KRAJ PROGRAMA*****");
    }
}
