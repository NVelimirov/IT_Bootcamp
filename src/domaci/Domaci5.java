public class Domaci5 {
    public static void main(String[] args) {
        //Uneti string "ITBootCamp" i stampati sve karaktere osim slova C. (Obratiti paznju na velicinu fonta)
        String rec = "ITBootCamp";
        int suglasnik = 0;


        for (int i = 0; i < rec.length(); i++) {
            if (rec.charAt(i) == 'C') continue;
            System.out.println(rec.charAt(i));
        }
    }
}
