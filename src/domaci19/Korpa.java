package domaci19;


import java.util.ArrayList;
import java.util.Collections;


public class Korpa implements Racun{

    private ArrayList<Namirnica> namirnice;

    public Korpa(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    public ArrayList<Namirnica> getNamirnice() {
        return namirnice;
    }

    @Override
    public void printNamirnice(ArrayList<Namirnica> namirnice) {
        System.out.println("Vase namirnice su: ");
        for (Namirnica i : namirnice){
            System.out.println(i.getNaziv());
        }
    }
    @Override
    public int printRacun(ArrayList<Namirnica> namirnice) {
        int racun = 0;
        for (Namirnica i : namirnice){
            racun += i.getCena();
        }
        System.out.print("Vas racun je: ");
        return racun;
    }
    @Override
    public boolean jeNaSpisku(Namirnica n) {
        boolean naSpisku = false;
        for (Namirnica i : namirnice){
            if (i.getNaziv().equals(n.getNaziv())){//uzimam naziv iz klase Namirnica i poredim ga sa nazivom iz drugog objekta (koji takodje potpada pod Namirnica klasu)
                naSpisku = true;
                System.out.print("Da li je " + i.getNaziv() + " na spisku - ");
            }
        }
        if (naSpisku == false){
            System.out.print("Da li je " + n.getNaziv() + " na spisku - ");
        }
        return naSpisku;
    }
}


//    @Override
//    public boolean jeNaSpisku(String n) {
//        boolean naSpisku = false;
//        for (Namirnica i : namirnice){
//            if (i.getNaziv().equalsIgnoreCase(n)){
//                naSpisku = true;
//            }
//        }
//        return naSpisku;
//    }
