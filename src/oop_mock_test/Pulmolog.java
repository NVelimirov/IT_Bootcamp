package oop_mock_test;

import java.util.ArrayList;

public class Pulmolog extends Lekar{
    public Pulmolog(int id, String ime, String prezime, ArrayList<Pacijent> pacijenti, int brojPacijenata) {
        super(id, ime, prezime, pacijenti, brojPacijenata);
    }

    @Override
    public boolean prihvati(Pacijent pacijent) {
        if (getBrojPacijenata() < 100){
            setBrojPacijenata(getBrojPacijenata()+1);
            getPacijenti().add(pacijent);
            return true;
        }
        return false;
    }

    @Override
    public double plata() {
        return getBrojPacijenata() * 350;
    }


//    public int compareTo(Lekar o) {
//        return 0;
//    }
}
