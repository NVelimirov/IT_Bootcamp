package tests.JavaOOPTest;

import java.util.ArrayList;

public class Alpinista extends Planinar {
    private int godineIskustva;

    public Alpinista(int id, String ime, String prezime, ArrayList<Planina> planine, double maxUspon, int godineIskustva) {
        super(id, ime, prezime, planine, maxUspon);
        this.godineIskustva = godineIskustva;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }


    @Override
    public boolean uspesanUspon(Planina p) {
        ArrayList<Planina> planine = new ArrayList<>();
        if (getMaxUspon() >= p.getVisina()){
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
            if (i.getVisina() > 2000) {
                umanjenje++;
            }
        }
        return 1500 - ((1500 * 0.05) * umanjenje);
    }

}
