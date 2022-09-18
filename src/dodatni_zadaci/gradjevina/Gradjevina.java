package dodatni_zadaci.gradjevina;

import java.util.ArrayList;

public class Gradjevina implements Posao {
    private ArrayList<Radnik> radnici;

    public Gradjevina(ArrayList<Radnik> radnici) {
        this.radnici = radnici;
    }

    //izbacuje sa liste sve fizikalce koji rade prvu smenu
    @Override
    public void dajOtkaPrvikalcaojSmeniFizikalca() {
        for (Radnik fizikalci : radnici) {
            if (fizikalci instanceof Fizikalac && fizikalci.getSmena() == 1) {
                radnici.remove(fizikalci);
            }
        }
    }

    //koji vraca true ako se radnik nalazi na spisku radnika
    @Override
    public boolean jeRadnik(Radnik r) {
//        for (Radnik naSpisku : radnici){
//            if (naSpisku.getId() == r.getId()){
//                return true;
//            }
//        }
        for (Radnik i : radnici) {
            if (i.compareTo(r) == 0) {
                return true;
            }
        }
        return false;
    }

    //stampa ukupnu sumu novca koju zaradjuju svi radnici u drugoj smeni
    @Override
    public double ukupnaPlataRadnikaDrugeSmene() {
        double ukupnaPlataUDrugoj = 0;
        for (Radnik uSmeni : radnici) {
            if (uSmeni.getSmena() == 2) {
                ukupnaPlataUDrugoj += uSmeni.getPlata();
            }
        }
        return ukupnaPlataUDrugoj;
    }

    // vratiti listu radnika koji imaju platu vecu od suma
    @Override
    public ArrayList<Radnik> dobroPlaceni(double suma) {
        ArrayList<Radnik> imajuPlatuVecuOdSume = new ArrayList<>();
        for (Radnik i : radnici) {
            if (i.getPlata() > suma) {
                imajuPlatuVecuOdSume.add(i);
            }
        }
        return imajuPlatuVecuOdSume;
    }

    @Override
    public void sortirajPoPlati() {
        for (int i = 0; i < radnici.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < radnici.size(); j++) {
                //ovo je sablon uvek je isto!!!
                if (radnici.get(minIndex).getPlata() > radnici.get(j).getPlata()) { //ovo se menja po cemu ga sortiramo
                    minIndex = j;       //ako zelimo od najmanje plate samo <(poredimo da li je manji)
                }
                Radnik temp = radnici.get(minIndex);    //privremena promenjiva postavi je na min index koji smo nasli 1 index
                radnici.set(minIndex, radnici.get(i));    //postavimo min index ja i to je 0 index
                radnici.set(i, temp);                    //a i postavimo u promenjivu i ide na 1 index
                //swap isto sablon
                //primer 3 case
            }
        }
    }

    @Override
    public String toString() {
        return "Gradjevina{" +
                "radnici=" + radnici +
                '}';
    }
}
