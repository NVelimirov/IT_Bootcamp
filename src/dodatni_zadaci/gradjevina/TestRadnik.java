package dodatni_zadaci.gradjevina;

import java.util.ArrayList;

public class TestRadnik {
    public static void main(String[] args) {
        ArrayList<Radnik> radnici = new ArrayList<>();
        radnici.add(new SefSmene(1, "a",250,2));
        radnici.add(new SefSmene(2, "b",250,3));
        radnici.add(new Fizikalac(3, "c",100,3));
        radnici.add(new Fizikalac(4, "d",100,2));
        radnici.add(new Fizikalac(7, "g",100,1));
        radnici.add(new Masinovodja(5, "e",175,2));
        radnici.add(new Masinovodja(6, "f",175,1));
        Radnik r1 = new Fizikalac(8, "h",175,1);

        Gradjevina gradjevina = new Gradjevina(radnici);
        //izbacuje excption, ali je logika na mestu
//        gradjevina.dajOtkaPrvikalcaojSmeniFizikalca();
//        System.out.println(gradjevina);
        //radi
        System.out.println(gradjevina.jeRadnik(r1));
        radnici.add(r1);
        System.out.println(gradjevina.jeRadnik(r1));
        //radi
        System.out.println(gradjevina.ukupnaPlataRadnikaDrugeSmene());
        //radi
        System.out.println(gradjevina.dobroPlaceni(150));

        //radi sortiranje
        System.out.println(radnici);
        gradjevina.sortirajPoPlati();
        System.out.println(radnici);
    }
}
