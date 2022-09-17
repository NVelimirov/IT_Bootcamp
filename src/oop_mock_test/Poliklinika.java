package com.itbootcamp.bgqa.oop_mock_test;

import java.util.ArrayList;
import java.util.Collections;

public class Poliklinika {
    private ArrayList<Lekar> lekari;

    public Poliklinika(ArrayList<Lekar> lekari) {
        this.lekari = lekari;
    }

    public int pulmologSaNajmanjomPlatom(){
        int id = 0;
        double min = Double.MAX_VALUE;
        for (Lekar lekari : lekari){
            if (lekari instanceof Pulmolog && lekari.plata() < min){
                    min = lekari.plata();
                    id = lekari.getId();
            }
        }
        return id;
    }

    public int pedijatarSaNajstarijimPacijentima(){
        int id = 0;
        int ukupanBrojGodinaPacijenata = 0;
        int prosekGodinaPacijenata = 0;
        double maxProsekGodina = Double.MIN_VALUE;
        for (Lekar lekari : lekari){
            if (lekari instanceof Pedijatar){
                for (Pacijent pacijenti : lekari.getPacijenti()){
                    ukupanBrojGodinaPacijenata += pacijenti.getBrojGodina();

                }
                prosekGodinaPacijenata = ukupanBrojGodinaPacijenata / lekari.getPacijenti().size();
                if (prosekGodinaPacijenata < maxProsekGodina){
                    maxProsekGodina = prosekGodinaPacijenata;
                    id = lekari.getId();
                }
            }
        }

        return id;
    }

    public void sortLekariPoBrojuPacijenata(){
        Collections.sort(this.lekari);
    }

    public static void main(String[] args) {
        ArrayList<Pacijent> pacijenti = new ArrayList<>();
        pacijenti.add(new Pacijent("Ae", "Ae", 25));
        pacijenti.add(new Pacijent("Be", "Be", 45));
        pacijenti.add(new Pacijent("Ce", "Ce", 34));

        Lekar p = new Pulmolog(1, "Pul1", "A", pacijenti, 45);
        Lekar p1 = new Pulmolog(2, "Pul2", "B", pacijenti, 100);
        Lekar p2 = new Pedijatar(3, "Pedi1", "c", pacijenti, 100);
        Lekar p3 = new Pedijatar(4, "Pedi2", "d", pacijenti, 200);

//        System.out.println(p2.plata());
//        System.out.println(p2.prihvati(new Pacijent("z","z", 12)));
//        System.out.println(p2.prihvati(new Pacijent("z","z", 18)));
//        System.out.println(p2.plata());
//        System.out.println(p3.prihvati(new Pacijent("z","z", 12)));
//        System.out.println(p.plata());
//        System.out.println(p.prihvati(new Pacijent("s", "e", 25)));
//        System.out.println(p.plata());
//        System.out.println(p1.plata());
//        System.out.println(p1.prihvati(new Pacijent("s", "e", 25)));

        ArrayList<Lekar> lekari = new ArrayList<>();
        lekari.add(p);
        lekari.add(p1);
        lekari.add(p2);
        lekari.add(p3);

        Poliklinika poliklinika = new Poliklinika(lekari);

//        System.out.println(poliklinika.pulmologSaNajmanjomPlatom());
        System.out.println(poliklinika.pedijatarSaNajstarijimPacijentima());
        poliklinika.sortLekariPoBrojuPacijenata();
        System.out.println(poliklinika.lekari);



    }


}
