package tests.JavaOOPTest;

import java.util.ArrayList;

public class Rekreativac extends Planinar{
    private double tezinaOpreme;

    public Rekreativac(int id, String ime, String prezime, ArrayList<Planina> planine, double maxUspon, double tezinaOpreme) {
        super(id, ime, prezime, planine, maxUspon);
        this.tezinaOpreme = tezinaOpreme;
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(double tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        ArrayList<Planina> planine = new ArrayList<>();
        double otezanjeZbogTezine = tezinaOpreme * 50;
        if ((getMaxUspon()-otezanjeZbogTezine) >= p.getVisina()){
            planine.add(p);
            System.out.println("Planinar " + getIme() + " " + getPrezime() + " se uspesno popeo na planinu");
            return true;
        }
        return false;
    }

    @Override
    public double clanarina() {
        double umanjenje = 0;
        for (Planina i : getPlanine()){
            umanjenje++;
        }
        return 1000 - ((1000 * 0.02) * umanjenje);
    }

}
