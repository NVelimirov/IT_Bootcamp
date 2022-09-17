package com.itbootcamp.bgqa.domaci_voce;
// napisati metod koji povecava cenu jagoda za 20% ako im nije sezona
// if boolean iz voca == true, onda je cena jagoda * 0.2
public class Jagode extends Voce {

    public Jagode(String ime, String sezona, double cenaZaKilogram, String boja, double pare) {
        super(ime, sezona, cenaZaKilogram, boja, pare);
    }
    public void povecajCenuJagoda (String sezona){
        setCenaZaKilogram(getCenaZaKilogram() + (getCenaZaKilogram()*0.2));
    }
    public boolean jeSezona (String sezona){
        boolean sezonaJe = false;
        if (getSezona().equalsIgnoreCase("Maj") || getSezona().equalsIgnoreCase("Jun")){
            sezonaJe = true;
            setBoja("Crvena");
            System.out.print("Sezona je jagoda - ");
        } else {
            povecajCenuJagoda(getSezona());
            setBoja("Zelena");
            System.out.print("Nije sezona jagoda - ");
        }

        return sezonaJe;
    }
    public int sumaVoca (double pare){
        int kg = (int) getCenaZaKilogram();
        int suma = (int) (pare / kg);
        System.out.print("Za " + pare + " din. mozete uzeti kg jagoda - ");
        return suma;
    }

    public String listajSezonu(){
        String sezona = "Sezona jagoda je mesec Maj i Jun";
        return sezona;
    }

}
