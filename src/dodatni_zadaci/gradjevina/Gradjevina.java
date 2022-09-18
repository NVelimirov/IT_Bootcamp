package dodatni_zadaci.gradjevina;

import java.util.ArrayList;

public class Gradjevina implements Posao{
    private ArrayList<Radnik> radnici;

    public Gradjevina(ArrayList<Radnik> radnici) {
        this.radnici = radnici;
    }

    //izbacuje sa liste sve fizikalce koji rade prvu smenu
    @Override
    public void dajOtkaPrvikalcaojSmeniFizikalca() {
        for (Radnik fizikalci : radnici){
            if (fizikalci instanceof Fizikalac && fizikalci.getSmena()==1){
                radnici.remove(fizikalci);
            }
        }
    }
//koji vraca true ako se radnik nalazi na spisku radnika
    @Override
    public boolean jeRadnik(Radnik r) {
        for (Radnik naSpisku : radnici){
            if (naSpisku.getId() == r.getId()){
                return true;
            }
        }
        return false;
    }
//stampa ukupnu sumu novca koju zaradjuju svi radnici u drugoj smeni
    @Override
    public double ukupnaPlataRadnikaDrugeSmene() {
        double ukupnaPlataUDrugoj = 0;
        for (Radnik uSmeni : radnici){
            if (uSmeni.getSmena()==2){
                ukupnaPlataUDrugoj += uSmeni.getPlata();
            }
        }
        return ukupnaPlataUDrugoj;
    }
// vratiti listu radnika koji imaju platu vecu od suma
    @Override
    public ArrayList<Radnik> dobroPlaceni(double suma) {
        ArrayList<Radnik> imajuPlatuVecuOdSume = new ArrayList<>();
        for (Radnik i : radnici){
            if (i.getPlata() > suma){
                imajuPlatuVecuOdSume.add(i);
            }
        }
        return imajuPlatuVecuOdSume;
    }

    @Override
    public String toString() {
        return "Gradjevina{" +
                "radnici=" + radnici +
                '}';
    }
}
