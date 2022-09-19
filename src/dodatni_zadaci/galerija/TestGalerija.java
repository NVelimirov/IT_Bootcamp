package dodatni_zadaci.galerija;

import java.util.ArrayList;

public class TestGalerija {
    public static void main(String[] args) {
        ArrayList<UmetnickoDelo> srdjanovaListaDela = new ArrayList<>();
        srdjanovaListaDela.add(new UmetnickoDelo("Slika", 1998, 2500));
        srdjanovaListaDela.add(new UmetnickoDelo("Slika1", 2005, 1480));
        srdjanovaListaDela.add(new UmetnickoDelo("Slika2", 1998, 680));
        srdjanovaListaDela.add(new UmetnickoDelo("Slika3", 2012, 3500));
        ArrayList<UmetnickoDelo> draganinaListaDela = new ArrayList<>();
        draganinaListaDela.add(new UmetnickoDelo("S", 1990, 10000));
        draganinaListaDela.add(new UmetnickoDelo("S1", 2005, 500));
        ArrayList<UmetnickoDelo> dejanovaListaDela = new ArrayList<>();
        dejanovaListaDela.add(new UmetnickoDelo("P", 1998, 2400));
        dejanovaListaDela.add(new UmetnickoDelo("P1", 2005, 1400));
        dejanovaListaDela.add(new UmetnickoDelo("P2", 1997, 780));
        dejanovaListaDela.add(new UmetnickoDelo("P3", 2012, 4300));



        ArrayList<Umetnik> listaUmetnika = new ArrayList<>();
        listaUmetnika.add(new Umetnik("Srdjan", srdjanovaListaDela, 150, 35));
        listaUmetnika.add(new Umetnik("Dejan", dejanovaListaDela, 78, 25));
        listaUmetnika.add(new Umetnik("Dragana", draganinaListaDela, 94, 17));
        Umetnik u1 = new Umetnik("Nebojsa", srdjanovaListaDela, 19, 21);
        listaUmetnika.add(u1);
//        System.out.println(listaUmetnika.get(1));

//        //dodavanje radi
//        System.out.println(u1.toString());
//        System.out.println(u1.izlozi(new UmetnickoDelo("dodata slika", 2022, 556)));
//        System.out.println(u1.toString());
//        //radi
//        for (Umetnik i : listaUmetnika){
//            System.out.println(i.vrednost());
//        }

        Galerija galerija = new Galerija(listaUmetnika);
        //sortiranje radi
        System.out.println(galerija);
        galerija.sortiraj();
        System.out.println(galerija);

//        System.out.println(galerija.umetnikSaNajstarijimDelom());
    }
}
