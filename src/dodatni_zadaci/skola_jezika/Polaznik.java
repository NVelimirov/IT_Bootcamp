package dodatni_zadaci.skola_jezika;

public class Polaznik {
    private String ime;
    private int godiste;

    public Polaznik(String ime, int godiste) {
        this.ime = ime;
        this.godiste = godiste;
    }

    @Override
    public String toString() {
        return "Polaznik{" +
                "ime='" + ime + '\'' +
                ", godiste=" + godiste +
                '}';
    }
}
