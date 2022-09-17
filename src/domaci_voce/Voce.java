package domaci_voce;

public abstract class Voce {
    private String ime;
    private String sezona;
    private double cenaZaKilogram;
    private String boja;

    private double pare;

    public Voce(String ime, String sezona, double cenaZaKilogram, String boja, double pare) {
        this.ime = ime;
        this.sezona = sezona;
        this.cenaZaKilogram = cenaZaKilogram;
        this.boja = boja;
        this.pare = pare;
    }

    public String getIme() {
        return ime;
    }

    public String getSezona() {
        return sezona;
    }

    public double getCenaZaKilogram() {
        return cenaZaKilogram;
    }

    public String getBoja() {
        return boja;
    }

    public double getPare() {
        return pare;
    }

    public void setBoja(String boja) {//treba zbog boje kajsija
        this.boja = boja;
    }

    public void setCenaZaKilogram(double cenaZaKilogram) {//generalno treba
        this.cenaZaKilogram = cenaZaKilogram;
    }

    public void setPare(double pare) {
        this.pare = pare;
    }

    public void setSezona(String sezona) { //treba zbog jagoda
        this.sezona = sezona;
    }

    // metod koji vraca true ukoliko je sezona ovom vocu:
    public abstract boolean jeSezona(String sezona);

    //za unetu svotu novca vratiti kolicinu voca koje moze da se kupi
    public abstract int sumaVoca(double pare);

    @Override
    public String toString() {
        return "Voce{" +
                "ime='" + ime + '\'' +
                ", sezona='" + sezona + '\'' +
                ", cenaZaKilogram=" + cenaZaKilogram +
                ", boja='" + boja + '\'' +
                '}';
    }

}
