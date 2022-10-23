package tests.JavaOOPTest;

import java.util.ArrayList;
import java.util.Collections;

public class PlaninarskoDrustvo {
    private ArrayList<Planinar> planinari;

    public PlaninarskoDrustvo(ArrayList<Planinar> planinari) {
        this.planinari = planinari;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public void setPlaninari(ArrayList<Planinar> planinari) {
        this.planinari = planinari;
    }

    public void izbaciPlaninara(int id) {
//        for (Planinar i : planinari){
//            if (i.getId() == id){
//                System.out.println("Izbacen planinar: ");
//                planinari.remove(i);
//            }
//        }
        for (int i = 0; i < planinari.size(); i++) {
            if (planinari.get(i).getId() == id) {
                planinari.remove(i);
            }
        }
    }

    public int najuspesnijiPlaninar() {
        int id = 0;
        int max = Integer.MIN_VALUE;
        for (Planinar i : planinari) {
            int zbir = 0;
            for (Planina p : i.getPlanine()) {
                zbir += p.getVisina();
                if (zbir > max) {
                    max = zbir;
                    id = i.getId();
                }
            }
            if (planinari.size() < 0){
                return 0;
            }
        }

        return id;
    }

    public double prosecnaClanarinaPlaninara() {
        double zbir = 0;
        for (Planinar i : planinari) {
            zbir += i.clanarina();
        }
        System.out.print("Visina prosecne clanarine planinara: ");
        return zbir / planinari.size();
    }
//prodji kroz planinare, ako je u pitanju Alpinista, proveri da li ima vise od 5 godina iskustva, ako ne - false
//ako ima alpinistu 5+, proveri da li prolaze uspesanUspon barem 2/3 ostatka
//ako prolaze vrati true, ako ne prolaze vrati false

    public boolean popniSeNaPlaninu(Planina planina){
        for (Planinar i : planinari){//ako je prazna lista
            if (planinari.size() < 0){
                return false;
            }
        }
        int godineIskustva = 0;
        int brojPlaninara = 0;
        int brojIskusnikAlpinista = 0;
        for (Planinar i : planinari){
            brojPlaninara++;
            if (i instanceof Alpinista){ //trazim alpinistu preko 5 godina iskustva
                godineIskustva = ((Alpinista) i).getGodineIskustva();
                if (godineIskustva > 5){
                    brojIskusnikAlpinista++;
                }
            }
        }
        int brojPlaninaraKojiProlaze = 0;
        for (Planinar i : planinari){//uzimam broj planinara koji prolaze uspon
            if (i.uspesanUspon(planina)){
                brojPlaninaraKojiProlaze++;
            }
        }
        double zaUspon = brojPlaninara * 0.66;
        if (brojIskusnikAlpinista > 0 && brojPlaninaraKojiProlaze > zaUspon){
            return true;
        }
        return false;
    }

    public void sortPlaninariPoClanarini(){
        Collections.sort(this.planinari);
    }

    @Override
    public String toString() {
        return "PlaninarskoDrustvo{" +
                "planinari=" + planinari +
                '}' + "\n";
    }

    public static void main(String[] args) {
        ArrayList<Planina> planine = new ArrayList<>();
        planine.add(new Planina("Stara", 500));
        planine.add(new Planina("Morka", 1000));
        planine.add(new Planina("Niska", 1500));
        planine.add(new Planina("Strma", 2000));
        planine.add(new Planina("Visoka", 2500));
        ArrayList<Planina> visokePlanine = new ArrayList<>();
        visokePlanine.add(new Planina("Izuzetno visoka", 4000));
        visokePlanine.add(new Planina("Visoka visoka", 5000));

        ArrayList<Planinar> praznaListaPlaninara = new ArrayList<>();
        ArrayList<Planinar> planinari = new ArrayList<>();
        planinari.add(new Rekreativac(1,"Dejan", "Dejanovic", planine, 950, 1));
        planinari.add(new Rekreativac(2,"Darko", "Darkovic", planine, 950, 2));
        planinari.add(new Alpinista(3,"Marija", "Marjanovic", planine, 1750, 3));
        planinari.add(new Alpinista(4,"Dragana", "Draganovic", planine, 2500, 6));
        planinari.add(new Alpinista(5,"Milan", "Milanovic", visokePlanine, 4250, 9));
        //clanarina
//        System.out.println(planinari.get(0).clanarina());
//        System.out.println(planinari.get(3).clanarina());
        //uspon
//        System.out.println(planinari.get(0).uspesanUspon(planine.get(0)));
//        System.out.println(planinari.get(1).uspesanUspon(planine.get(1)));

        PlaninarskoDrustvo drustvance = new PlaninarskoDrustvo(planinari);
        PlaninarskoDrustvo praznoDrustvance = new PlaninarskoDrustvo(praznaListaPlaninara);
        //enhanced for ne radi, ali obicna if petlja radi
//        System.out.println(planinari);
//        drustvance.izbaciPlaninara(1);
//        System.out.println(planinari);

        //sortiranje
//        System.out.println(drustvance);
//        drustvance.sortPlaninariPoClanarini();
//        System.out.println(drustvance);

        //najuspesniji planinar
//        System.out.println(drustvance.najuspesnijiPlaninar());
//        System.out.println(praznoDrustvance.najuspesnijiPlaninar());

        //prosecna clanarina
//        System.out.println(drustvance.prosecnaClanarinaPlaninara());

        Planina p1 = new Planina("Niska", 750);
        System.out.println(drustvance.popniSeNaPlaninu(p1));

    }
}
