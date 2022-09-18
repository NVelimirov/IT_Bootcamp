package dodatni_zadaci.gradjevina;

public abstract class Radnik implements Comparable<Radnik>{
    private int id;
    private String ime;
    private double plata;
    private int smena;

    public Radnik(int id, String ime, double plata, int smena) {
        this.id = id;
        this.ime = ime;
        this.plata = plata;
        this.smena = smena;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public double getPlata() {
        return plata;
    }

    public int getSmena() {
        return smena;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public void setSmena(int smena) {
        this.smena = smena;
    }

    public abstract void povisica();

    @Override
    public String toString() {
        return "Radnik{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", plata=" + plata +
                ", smena=" + smena +
                '}' + "\n";
    }

    @Override
    public int compareTo(Radnik drugiRadnik) {
        return Integer.compare(drugiRadnik.getId(), this.id);
    }
}
