package domaci_16_automobili;

import java.util.ArrayList;

public class Automobil {
    private String marka;
    private String boja;
    private int brSasije;
    private int godiste;
    private int cena;

    public Automobil(String marka, String boja, int brSasije, int godiste, int cena) {
        this.marka = marka;
        this.boja = boja;
        this.brSasije = brSasije;
        this.godiste = godiste;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public String getBoja() {
        return boja;
    }

    public int getBrSasije() {
        return brSasije;
    }

    public int getGodiste() {
        return godiste;
    }

    public int getCena() {
        return cena;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    //metod koji ce da smanji cenu Mercedesa za 20% ako je stariji od 20 godina a cenu BMW-a
// smanjiti za 30% ako je stariji od 25 godina.
    public void oldTimer() {

    }

    // metod koji ce da vraca sve Automobile koji imaju manju cenu od "svotaNovca"
    public static ArrayList<Automobil> cenaManja(int svotaNovca, ArrayList<Automobil> automobili) {
        ArrayList<Automobil> budzet = new ArrayList<Automobil>();
            for (Automobil i : automobili){
                if (i.getCena() <= svotaNovca){
                    budzet.add(i);
                }
            }
        System.out.print("Kola koja se uklapaju u budzet su: ");
        return budzet;
    }

    //metod koji ce da stampa sve Automobile bele boje
    public static ArrayList<Automobil> sviBeli(ArrayList<Automobil> automobili) {
        ArrayList<Automobil> beliAutomobili = new ArrayList<Automobil>();
        for (Automobil i : automobili) {
            if (i.getBoja().equalsIgnoreCase("bela")) {
                beliAutomobili.add(i);
            }
        }
        System.out.print("Samo bela kola su: ");
        return beliAutomobili;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "marka='" + marka + '\'' +
                ", boja='" + boja + '\'' +
                ", brSasije=" + brSasije +
                ", godiste=" + godiste +
                ", cena=" + cena +
                '}';
    }

    public static void main(String[] args) {
        Automobil auto1 = new Mercedes("Mercedes", "bela", 192083, 1992, 550);
        Automobil auto2 = new BMW("BMW", "crna", 192083, 1992, 450);
        Automobil auto3 = new Mercedes("Mercedes", "Crvena", 92839, 2020, 1000);
        Automobil auto4 = new BMW("BMW", "zelena", 234234, 2022, 1100);
        ArrayList<Automobil> automobili = new ArrayList<>();
        automobili.add(auto1);
        automobili.add(auto2);
        automobili.add(auto3);
        automobili.add(auto4);

        System.out.println("Kola 1: " + auto1.toString());
        System.out.println("Kola 2: " + auto2.toString());
        System.out.println("Kola 3: " + auto3.toString());
        System.out.println("Kola 4: " + auto4.toString());

        auto1.setGodiste(2005);
        auto1.oldTimer();
        auto2.oldTimer();
        auto4.oldTimer();
        auto3.setBoja("bela");
        System.out.println(auto1.getCena());
        System.out.println(auto2.getCena());
        System.out.println(auto4.getCena());

        System.out.println(sviBeli(automobili));
        System.out.println(cenaManja(1000, automobili));

    }

}
