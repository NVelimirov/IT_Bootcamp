package dodatni_zadaci.gradjevina;

public class Fizikalac extends Radnik{
    public Fizikalac(int id, String ime, double plata, int smena) {
        super(id, ime, plata, smena);
    }

    @Override
    public void povisica() {
        if (getSmena()==2){
            setPlata(getPlata() + (getPlata() * 0.2));
        }
    }
}
