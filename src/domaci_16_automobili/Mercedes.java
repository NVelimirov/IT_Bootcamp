package domaci_16_automobili;

import java.util.ArrayList;

public class Mercedes extends Automobil{
    public Mercedes(String marka, String boja, int brSasije, int godiste, int cena) {
        super(marka, boja, brSasije, godiste, cena);
    }

    @Override
    public void oldTimer() {
        int trenutnaGodina = 2022;
        int godiste = trenutnaGodina - getGodiste();
       // System.out.print("Inicijalna cena: " + getCena());
       // System.out.println("");
        if (godiste >= 20){
            setCena((int) (getCena() - (getCena() * 0.2)));
           // System.out.print("Cena zbog godista: ");

        }
    }
}
