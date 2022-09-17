package oop_mock_test;

import java.util.ArrayList;

public class Pedijatar extends Lekar{
    public Pedijatar(int id, String ime, String prezime, ArrayList<Pacijent> pacijenti, int brojPacijenata) {
        super(id, ime, prezime, pacijenti, brojPacijenata);
    }

    @Override
    public boolean prihvati(Pacijent pacijent) {
        if (getBrojPacijenata() < 200 && pacijent.getBrojGodina() < 18){
            setBrojPacijenata(getBrojPacijenata()+1);
            getPacijenti().add(pacijent);
            return true;
        }
        return false;
    }

    @Override
    public double plata() {
        double plata = getBrojPacijenata() * 300;
        for (Pacijent pacijent : getPacijenti()){
            if (pacijent.getBrojGodina() < 5){
                plata += 100;
            }
        }
        return plata;
    }


//    public int compareTo(Lekar o) {
//        return 0;
//    }
}
