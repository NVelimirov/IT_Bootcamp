package domaci.domaci18;

import java.util.ArrayList;

public class TestRestoran {
    public static void main(String[] args) {
        ArrayList<Jelo> jela = new ArrayList<>();
        jela.add(new Jelo("Musaka", 550, "Kuvano"));
        jela.add(new Jelo("Punjene paprike", 650, "Kuvano"));
        jela.add(new Jelo("Paprikas", 600, "Kuvano"));
        jela.add(new Jelo("Saran", 850, "Riba"));
        jela.add(new Jelo("Pastrmka", 950, "Riba"));
        jela.add(new Jelo("Som", 800, "Riba"));
        jela.add(new Jelo("Karadjordjeva", 750, "Svinjsko"));
        jela.add(new Jelo("Svinjski vrat na zaru", 850, "Svinjsko"));
        jela.add(new Jelo("Pecenje", 1100, "Svinjsko"));
        jela.add(new Jelo("Fungi", 750, "Pica"));
        jela.add(new Jelo("Cezar", 1000, "Pica"));
        jela.add(new Jelo("Toskana", 950, "Pica"));


        Restoran r1 = new Restoran("Weifert", jela, 2);

//        System.out.println(r1.getMeni());
//        System.out.println(r1.toString());


        r1.rezervisiSto();


        r1.stampajNaziveJela("Pica");


        System.out.println(r1.najskuplje());

    }
}
