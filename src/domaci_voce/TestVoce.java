package com.itbootcamp.bgqa.domaci_voce;

public class TestVoce {
    public static void main(String[] args) {
        Jagode voce1 = new Jagode("Jagode", "", 0, "", 0);
        System.out.println(voce1.listajSezonu());
        voce1.setSezona("maj");
        voce1.setCenaZaKilogram(150);
        System.out.println(voce1.jeSezona(voce1.getSezona()));
        System.out.println(voce1.getCenaZaKilogram());
        System.out.println(voce1.getBoja());
        System.out.println(voce1.sumaVoca(500));
        System.out.println(voce1.toString());
        System.out.println();
        System.out.println("----------");
        System.out.println();

        Breskva voce2 = new Breskva("Breskva", "",0,"", 0);
        System.out.println(voce2.listajSezonu());
        voce2.setSezona("");
        voce2.setBoja("");
        voce2.setCenaZaKilogram(100);
        System.out.println(voce2.jeSezona(voce2.getSezona()));
        System.out.println(voce2.getCenaZaKilogram());
        System.out.println(voce2.sumaVoca(500));
        System.out.println(voce2.toString());
    }
}
