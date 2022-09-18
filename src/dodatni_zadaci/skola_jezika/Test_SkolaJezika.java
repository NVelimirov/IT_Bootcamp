package dodatni_zadaci.skola_jezika;

import java.util.ArrayList;

public class Test_SkolaJezika {
    public static void main(String[] args) {
        ArrayList<Polaznik> polaznici1 = new ArrayList<>();
        polaznici1.add(new Polaznik("A", 1995));
        polaznici1.add(new Polaznik("B", 1993));
        polaznici1.add(new Polaznik("C", 1994));
        polaznici1.add(new Polaznik("D", 1997));
        polaznici1.add(new Polaznik("E", 1999));
        ArrayList<Polaznik> polaznici2 = new ArrayList<>();
        polaznici2.add(new Polaznik("A", 1995));
        polaznici2.add(new Polaznik("B", 1993));
        polaznici2.add(new Polaznik("C", 1994));
        polaznici2.add(new Polaznik("D", 1997));
        ArrayList<Polaznik> polaznici3 = new ArrayList<>();
        polaznici3.add(new Polaznik("A", 1995));
        polaznici3.add(new Polaznik("B", 1993));
        polaznici3.add(new Polaznik("C", 1994));
        polaznici3.add(new Polaznik("D", 1997));

        ArrayList<Kurs> kursevi = new ArrayList<>();
        kursevi.add(new Kurs("engleski", "osnovni", polaznici1));
        kursevi.add(new Kurs("engleski", "srednji", polaznici2));
        kursevi.add(new Kurs("italijanski", "napredni", polaznici3));
        kursevi.add(new Kurs("engleski", "napredni", polaznici1));
        kursevi.add(new Kurs("nemacki", "srednji", polaznici1));
        kursevi.add(new Kurs("nemacki", "osnovni", polaznici1));

        SkolaJezika skolica = new SkolaJezika(kursevi);

//        //najpopularniji napredni
//        System.out.println(skolica.najnaprednijiJezik());
//

        //unapredjivanje grupe
        skolica.unaprediGrupu("engleski", "osnovni");
        System.out.println(kursevi);

//        //trebalo bi da je dobra logika, ali ne radi
//        System.out.println(kursevi);
//        skolica.ukloni("engleski");
//        System.out.println(kursevi);



    }
}
