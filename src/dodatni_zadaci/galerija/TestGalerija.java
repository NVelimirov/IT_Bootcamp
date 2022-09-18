package dodatni_zadaci.galerija;

import java.util.ArrayList;

public class TestGalerija {
    public static void main(String[] args) {
        ArrayList<UmetnickoDelo> listaDela = new ArrayList<>();
        listaDela.add(new UmetnickoDelo("Slika", 1998, 2500));
        listaDela.add(new UmetnickoDelo("Slika1", 2005, 1480));
        listaDela.add(new UmetnickoDelo("Slika2", 1998, 680));
        listaDela.add(new UmetnickoDelo("Slika3", 2012, 3500));
        ArrayList<UmetnickoDelo> listaDela1 = new ArrayList<>();
        listaDela1.add(new UmetnickoDelo("Slika", 1998, 10000));
        listaDela1.add(new UmetnickoDelo("Slika1", 2005, 500));



        ArrayList<Umetnik> listaUmetnika = new ArrayList<>();
        listaUmetnika.add(new Umetnik("Srdjan", listaDela, 150, 35));
        listaUmetnika.add(new Umetnik("Dejan", listaDela, 78, 25));
        listaUmetnika.add(new Umetnik("Dragana", listaDela1, 94, 17));
        Umetnik u1 = new Umetnik("Nebojsa", listaDela, 19, 21);
        listaUmetnika.add(u1);
//        System.out.println(listaUmetnika.get(1));

//        //dodavanje radi
//        System.out.println(u1.toString());
//        System.out.println(u1.izlozi(new UmetnickoDelo("dodata slika", 2022, 556)));
//        System.out.println(u1.toString());
//        //radi
//        System.out.println(listaUmetnika.get(0).vrednost());
//        System.out.println(listaUmetnika.get(3).vrednost());

        Galerija galerija = new Galerija(listaUmetnika);
        //sortiranje radi
        System.out.println(galerija);
        galerija.sortiraj();
        System.out.println(galerija);
    }
}
