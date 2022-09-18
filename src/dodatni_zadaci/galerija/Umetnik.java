package dodatni_zadaci.galerija;

import java.util.ArrayList;

public class Umetnik implements Comparable<Umetnik>{
    private String ime;
    private ArrayList<UmetnickoDelo> umetnikovaDela;
    private int ukupanBrojDela;

    private int maksimalanBrojDelaKojiMozeDaIzlozi;


    public Umetnik(String ime, ArrayList<UmetnickoDelo> umetnikovaDela, int ukupanBrojDela, int maksimalanBrojDelaKojiMozeDaIzlozi) {
        this.ime = ime;
        this.umetnikovaDela = umetnikovaDela;
        this.ukupanBrojDela = ukupanBrojDela;
        this.maksimalanBrojDelaKojiMozeDaIzlozi = maksimalanBrojDelaKojiMozeDaIzlozi;
    }

    public String getIme() {
        return ime;
    }

    public ArrayList<UmetnickoDelo> getUmetnikovaDela() {
        return umetnikovaDela;
    }

    public int getUkupanBrojDela() {
        return ukupanBrojDela;
    }


    public int getMaksimalanBrojDelaKojiMozeDaIzlozi() {
        return maksimalanBrojDelaKojiMozeDaIzlozi;
    }

    public void setUmetnikovaDela(ArrayList<UmetnickoDelo> umetnikovaDela) {
        this.umetnikovaDela = umetnikovaDela;
    }

    public void setMaksimalanBrojDelaKojiMozeDaIzlozi(int maksimalanBrojDelaKojiMozeDaIzlozi) {
        this.maksimalanBrojDelaKojiMozeDaIzlozi = maksimalanBrojDelaKojiMozeDaIzlozi;
    }


    public void setUkupanBrojDela(int ukupanBrojDela) {
        this.ukupanBrojDela = ukupanBrojDela;
    }
//dodaje delo u niz (ako ima mesta) i povecava se ukupan broj njegovih dela za 1.
//Logicka vrednost koju metod vraca je signal da je dodavanje uspelo ili nije.
    public boolean izlozi (UmetnickoDelo delo){
        if (getUkupanBrojDela()<getMaksimalanBrojDelaKojiMozeDaIzlozi()){
            umetnikovaDela.add(delo);
            setUkupanBrojDela(getUkupanBrojDela() + 1);
            return true;
        }
        return false;
    }
//vraca vrednost izlozenih dela umetnika tako sto sabira vrednosti svih dela
    public double vrednost(){
        int vrednostIzlozenihDela = 0;
        for (UmetnickoDelo dela : umetnikovaDela){
            vrednostIzlozenihDela += dela.getCena();
        }

        return  vrednostIzlozenihDela;
    }

    @Override
    public int compareTo(Umetnik drugiUmetnik) {
        return Double.compare(drugiUmetnik.vrednost(), this.vrednost());
    }

    @Override
    public String toString() {
        return "Umetnik{" +
                "ime='" + ime + '\'' +
                ", umetnikovaDela=" + umetnikovaDela +
                ", ukupanBrojDela=" + ukupanBrojDela +
                ", maksimalanBrojDelaKojiMozeDaIzlozi=" + maksimalanBrojDelaKojiMozeDaIzlozi +
                '}'+ "\n";
    }
}
