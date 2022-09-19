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

//metod koji vraca umetnika sa najstarijim delom
    public  Umetnik umetnikSaNajstarijimDelom(){
        int min = Integer.MAX_VALUE; //min jer trazimo najstarije, a starije je manji broj od mladjeg
        Umetnik saNajstarijimDelom = null;
        for (Umetnik i : umetnici){
            for (UmetnickoDelo delo : i.getUmetnikovaDela()){
                if (delo.getGodinaNastanka() < min){
                    min = delo.getGodinaNastanka();
                    saNajstarijimDelom = i;
                }
            }
        }
        System.out.println("Najstarije delo je naslikano " + min + ". godine");
        return saNajstarijimDelom;
    }


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
