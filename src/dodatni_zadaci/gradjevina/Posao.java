package dodatni_zadaci.gradjevina;

import java.util.ArrayList;

public interface Posao {
    public void dajOtkaPrvikalcaojSmeniFizikalca();

    public boolean jeRadnik(Radnik r);

    public double ukupnaPlataRadnikaDrugeSmene();

    public ArrayList<Radnik> dobroPlaceni(double suma);

    public void sortirajPoPlati();

}
