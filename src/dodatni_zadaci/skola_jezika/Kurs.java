package dodatni_zadaci.skola_jezika;

import java.util.ArrayList;

public class Kurs {
    private String jezik;
    private String nivo;//osnovni, srednji ili napredni (set metoda ne dozvoljava neku drugu vrednost, setuju se samo ispravne vrednosti, ili osnovni ako vrednost nije ispravna)
    private ArrayList<Polaznik> polaznici;

    public Kurs(String jezik, String nivo, ArrayList<Polaznik> polaznici) {
        this.jezik = jezik;
        this.nivo = nivo;
        this.polaznici = polaznici;
    }

    public String getJezik() {
        return jezik;
    }

    public void setJezik(String jezik) {
        this.jezik = jezik;
    }

    public String getNivo() {
        return nivo;
    }

    public void setNivo(String nivo) {
        this.nivo = nivo;
    }

    public ArrayList<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(ArrayList<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "jezik='" + jezik + '\'' +
                ", nivo='" + nivo + '\'' +
                ", polaznici=" + polaznici +
                '}' + "\n";
    }
}
