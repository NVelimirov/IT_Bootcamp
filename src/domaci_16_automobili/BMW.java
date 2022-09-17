package com.itbootcamp.bgqa.domaci_16_automobili;

public class BMW extends Automobil{
    public BMW(String marka, String boja, int brSasije, int godiste, int cena) {
        super(marka, boja, brSasije, godiste, cena);
    }

    @Override
    public void oldTimer() {
        int trenutnaGodina = 2022;
        int godiste = trenutnaGodina - getGodiste();
        //System.out.print("Inicijalna cena: " + getCena());
        //System.out.println("");
        if (godiste >= 25){
            setCena((int) (getCena() - (getCena() * 0.3)));
            //System.out.print("Cena zbog godista: ");
        }
    }
}
