package domaci.domaci_voce;

public class Breskva extends Voce{

    public Breskva(String ime, String sezona, double cenaZaKilogram, String boja, double pare) {
        super(ime, sezona, cenaZaKilogram, boja, pare);
    }

    public void smanjiCenuBreskva (String boja){
            setCenaZaKilogram(getCenaZaKilogram() - (getCenaZaKilogram()*0.15));

      //napisati metod koji ce smanjiti cenu breskva za 15% ako su zelene
    }
    public boolean jeSezona (String sezona){
        boolean sezonaJe = false;
        if (getBoja().equalsIgnoreCase("Zelena") || getBoja().equalsIgnoreCase("Zelene")){
            sezonaJe = false;
            smanjiCenuBreskva(getBoja());
            System.out.print("Sezona je breskve, ali su zelene - ");
        } else if (getSezona().equalsIgnoreCase("Jun") || getSezona().equalsIgnoreCase("Jul") || getSezona().equalsIgnoreCase("Avgust")) {
            sezonaJe = true;
            setBoja("Crvena");
            System.out.print("Sezona je breskve - ");
        }else {
            smanjiCenuBreskva(getBoja());
            System.out.print("Nije sezona breskve - ");
            setBoja("Zelena");
        }

        return sezonaJe;
    }

    public int sumaVoca (double pare){
        int kg = (int) getCenaZaKilogram();
        int suma = (int) (pare / kg);
        System.out.print("Za " + pare + " din. mozete uzeti kg breskvi - ");
        return suma;
    }
    public String listajSezonu(){
        String sezona = "Sezona breskvi je mesec Jun, Jul i Avgust";
        return sezona;
    }
}

