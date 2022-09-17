package domaci19;

public class Namirnica{
    private String naziv;
    private double cena;

    public Namirnica(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Namirnica{" +
                "naziv='" + naziv + '\'' +
                ", cena=" + cena +
                '}' + "\n";
    }

//    @Override//predavanje 15.09. - 2:11:12 - ali nije za ovaj zadatak
//    public int compareTo(Namirnica drugaNamirnica) {
//        return String.
//    }
}
