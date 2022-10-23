package domaci.domaci19;

import java.util.ArrayList;

public class TestNamirnica {


    public static void main(String[] args) {
        ArrayList<Namirnica> namirnice = new ArrayList<>();
        Namirnica n1 = new Namirnica("Mleko", 125);
        Namirnica n2 = new Namirnica("Jaja", 50);
        Namirnica n3 = new Namirnica("Hleb", 80);
        Namirnica n4 = new Namirnica("Jogurt", 125);
        Namirnica n5 = new Namirnica("Sunka", 250);
        Namirnica n6 = new Namirnica("Sir", 175);
        namirnice.add(n1);
        namirnice.add(n2);
        namirnice.add(n3);
        namirnice.add(n4);
        namirnice.add(n5);
        namirnice.add(n6);

        ArrayList<Namirnica> listaNamirnica = new ArrayList<>();
        Namirnica l1 = new Namirnica("Mleko", 125);
        Namirnica l2 = new Namirnica("Jaja", 50);
        Namirnica l3 = new Namirnica("Banane", 80);
        listaNamirnica.add(l1);
        listaNamirnica.add(l2);
        listaNamirnica.add(l3);


        Korpa korpa1 = new Korpa(namirnice);
        Korpa korpa2 = new Korpa(listaNamirnica);//nepotrebno


        //printRacun
        System.out.println(korpa1.printRacun(namirnice));
        System.out.println("-----");
        //jeNaSpisku
        System.out.println(korpa1.jeNaSpisku(l1));
        System.out.println(korpa1.jeNaSpisku(l2));
        System.out.println(korpa1.jeNaSpisku(l3));
        System.out.println("-----");
        //printNamirnice
        korpa1.printNamirnice(namirnice);
        System.out.println("-----");
        //toString
        System.out.println(namirnice.toString());
        System.out.println(listaNamirnica.toString());





    }
}
