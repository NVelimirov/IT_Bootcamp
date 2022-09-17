package domaci17;

import java.util.ArrayList;

public class Restoran {
    private ArrayList<Zaposleni> zaposleni;

    public Restoran (ArrayList<Zaposleni> zaposleni){
        this.zaposleni = zaposleni;
    }

    public ArrayList<Zaposleni> stampajKonobare(int smena){
        ArrayList<Zaposleni> poSmenama = new ArrayList<Zaposleni>();
        for (Zaposleni i : this.zaposleni){
            if (i.getPozicija().equals("Kuvar")){
                continue;
            }
            if (i.getSmena()==smena){
                poSmenama.add(i);
            }
        }
        return poSmenama;
    }

    public void povecajCenuTrecojSmeni(ArrayList<Zaposleni> zaposleni){
        int trenutnaDnevnica = 0;
        for (Zaposleni i : zaposleni){
            if (i.getSmena()==3){
                i.setDnevnica(i.getDnevnica());
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Zaposleni> zaposleni= new ArrayList<>();
        zaposleni.add(new Konobar("Dragan", "Konobar", 1991, 150, 8,1));
        zaposleni.add(new Kuvar("Milan", "Kuvar", 1995, 250, 8,2));
        zaposleni.add(new Konobar("Srdjan", "Konobar", 1998, 150, 8,3));
        Zaposleni zaposleni4 = new Kuvar("Dejan", "Kuvar", 1998, 250, 8,3);
        zaposleni.add(zaposleni4);
        Zaposleni zaposleni5 = new Kuvar("Tanja", "Kuvar", 1994, 260, 8,3);
        zaposleni.add(zaposleni5);
        Zaposleni zaposleni6 = new Kuvar("Dejan", "Kuvar", 1998, 250, 8,3);
        zaposleni.add(zaposleni6);


        //da li radi equals
        System.out.println(zaposleni6.equals(zaposleni4));
        System.out.println(zaposleni6.equals(zaposleni5));

        //da li lista samo konobare iz 3. smene
        Restoran konobari = new Restoran(zaposleni);
        ArrayList<Zaposleni> konobariUTrecoj = konobari.stampajKonobare(3);
        System.out.println(konobariUTrecoj);

        //da li se povecava dnevnica svim zaposlenim u 3. smeni
        zaposleni.get(1).setSmena(3);
        zaposleni6.setSmena(2);
        konobari.povecajCenuTrecojSmeni(zaposleni);
        for (Zaposleni i : zaposleni){
            System.out.println(i.getDnevnica());
        }

        System.out.println(zaposleni.toString());

    }
}
