package domaci18;

import java.util.ArrayList;

public class Restoran implements Guzva {
    private String naziv;
    private ArrayList<Jelo> meni;
    private int brSlobodnihStolova;

    public Restoran(String naziv, ArrayList<Jelo> meni, int brSlobodnihStolova) {
        this.naziv = naziv;
        this.meni = meni;
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public String getNaziv() {
        return naziv;
    }

    public ArrayList<Jelo> getMeni() {
        return meni;
    }

    public void setMeni(ArrayList<Jelo> meni) {
        this.meni = meni;
    }

    public int getBrSlobodnihStolova() {
        return brSlobodnihStolova;
    }


    public void setBrSlobodnihStolova(int brSlobodnihStolova) {
        this.brSlobodnihStolova = brSlobodnihStolova;
    }


    @Override
    public ArrayList<Jelo> najskuplje() {
        int min = 0;
        int skupo = 0;
        ArrayList<Jelo> temp = new ArrayList<>();
        for (Jelo i : getMeni()) {
            if (i.getCena() > min) {
                min = (int) i.getCena();
                temp.add(i);
            }
        }
        ArrayList<Jelo> najskuplje = new ArrayList<>();
        int brojac = 0;
        for (Jelo i : temp) {
            brojac++;
            if (brojac == temp.size()) {
                najskuplje.add(i);
            }
        }
        System.out.print("Najskuplje jelo: ");
        return najskuplje;
    }

    @Override
    public void rezervisiSto() {
        System.out.println("Broj slobodnih stolova pre rezervacije: " + getBrSlobodnihStolova());
        if (getBrSlobodnihStolova() > 0) {
            setBrSlobodnihStolova(getBrSlobodnihStolova() - 1);
            System.out.println("Sto rezervisan");
            System.out.println("Broj slobodnih stolova nakon rezervacije: " + getBrSlobodnihStolova());
        } else {
            System.out.println("Nema slobodnih stolova");
        }
        System.out.println("-----");
    }

    @Override
    public void stampajNaziveJela(String vrsta) {
        for (Jelo i : getMeni()) {
            if (i.getVrsta().equalsIgnoreCase(vrsta)) {
                System.out.println(i.getVrsta() + " - " + i.getNaziv());
            }
        }
        System.out.println("-----");
    }

    @Override
    public String toString() {
        return "Restoran{" +
                "naziv='" + naziv + '\'' +
                ", meni=" + meni +
                ", brSlobodnihStolova=" + brSlobodnihStolova +
                '}' + "\n";
    }
}
