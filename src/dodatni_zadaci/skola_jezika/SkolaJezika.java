package dodatni_zadaci.skola_jezika;

import java.util.ArrayList;

public class SkolaJezika implements Izmene{
    private ArrayList<Kurs> listaKurseva;

    public SkolaJezika(ArrayList<Kurs> listaKurseva) {
        this.listaKurseva = listaKurseva;
    }

    //vraca jezik na cijem naprednom kursu ima najvise polaznika.
    // Ako ima vise takvih jezika, metod vraca prvi na koji je naisao.
    @Override
    public SkolaJezika najnaprednijiJezik() {
        int maxPolaznici = Integer.MIN_VALUE;
        ArrayList<Kurs> listaNajpopularnijih = new ArrayList<>();
        for (Kurs jezici : listaKurseva){
            if (jezici.getNivo().equalsIgnoreCase("napredni")){
                maxPolaznici = jezici.getPolaznici().size();
                listaNajpopularnijih.add(jezici);
            }
        }
        ArrayList<Kurs> najpopularnijiNapredni = new ArrayList<>();
        int brojac = 0;
        for (Kurs najpopularniji : listaNajpopularnijih){
            brojac++;
            if (brojac == listaNajpopularnijih.size()){
                najpopularnijiNapredni.add(najpopularniji);
            }
        }
        SkolaJezika najpopularnijiJezik = new SkolaJezika(najpopularnijiNapredni);

        return najpopularnijiJezik;
    }
    //za zadati jezik i nivo povecava nivo kursa za jedan stepen (osnovni u srednji, srednji u napredni).
    //Ukoliko je zadati nivo napredni, ili ne postoji kurs sa unetim parametrima, metoda ne radi nista.
    //Ukoliko nakon povecanja postoje dva kursa za isti jezik i nivo, potrebno je ispisati poruku da je potrebno spojiti te dve grupe.
    @Override
    public void unaprediGrupu(String jezik, String nivo) {
        for (Kurs jezici : listaKurseva) {
            if (jezici.getJezik().equalsIgnoreCase(jezik)) {
                if (jezici.getNivo().equalsIgnoreCase("srednji")) {
                    jezici.setNivo("napredni");
                }
            }
        }
        for (Kurs jezici : listaKurseva) {
            if (jezici.getJezik().equalsIgnoreCase(jezik)) {
                if (jezici.getNivo().equalsIgnoreCase("osnovni")) {
                    jezici.setNivo("srednji");
                }
            }
        }
    }
    //ukloni odredjeni jezik iz liste
    @Override
    public void ukloni(String jezik) {
        for (Kurs jezici : listaKurseva){
            if (jezici.getJezik().equalsIgnoreCase(jezik)){
                listaKurseva.remove(jezici);
            }
        }
    }

    @Override
    public String toString() {
        return "SkolaJezika{" +
                "listaKurseva=" + listaKurseva +
                '}' + "\n";
    }
}
