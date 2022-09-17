package domaci_16_automobili;

public class TestAutomobil {
    public static void main(String[] args) {
        Mercedes auto1 = new Mercedes("Mercedes", "bela", 192083, 1992, 250);
        auto1.oldTimer();
        System.out.println(auto1.getCena());
        BMW auto2 = new BMW("BMW", "bela", 192083, 1992, 250);
        auto2.oldTimer();
        System.out.println(auto2.getCena());
    }
}
