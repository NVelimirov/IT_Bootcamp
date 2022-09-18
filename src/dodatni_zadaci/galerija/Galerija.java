package dodatni_zadaci.galerija;

import java.util.ArrayList;
import java.util.Collections;

public class Galerija {
    private ArrayList<Umetnik> umetnici;

    public Galerija(ArrayList<Umetnik> umetnici) {
        this.umetnici = umetnici;
    }

    public ArrayList<Umetnik> getUmetnici() {
        return umetnici;
    }

    public void setUmetnici(ArrayList<Umetnik> umetnici) {
        this.umetnici = umetnici;
    }

//    public String umetnikSaNajstarijimDelom (ArrayList<UmetnickoDelo> dela) {
//        int max = Integer.MIN_VALUE;
//        String umetnikSaNajstarijimDelom = null;
//        for (UmetnickoDelo delo : dela) {
//            if (delo.getCena() > max) {
//                max = (int) delo.getCena();
//                for (Umetnik umetnik : umetnici){
//                    if (umetnik.getUmetnikovaDela() == max)
//                }
//            }
//        }
//        return
//    }

    //metod koji izracunava i ispisuje prosecnu vrednost dela svih umetnika,
    public int  prosecnaVrednostDela(){
        for (Umetnik umentici : umetnici){

        }
        return prosecnaVrednostDela();
    }

    //sortiraj umetnike po vrednosti (od najmanjeg ka najvecem);
    public void sortiraj() {
        Collections.sort(this.umetnici);
    }

    @Override
    public String toString() {
        return "Galerija{" +
                "umetnici=" + umetnici +
                '}';
    }
}
