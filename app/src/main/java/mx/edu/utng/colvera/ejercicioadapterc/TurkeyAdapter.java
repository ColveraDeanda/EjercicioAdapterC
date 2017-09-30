package mx.edu.utng.colvera.ejercicioadapterc;

/**
 * Created by Ganzo on 24/09/2017.
 */


public class TurkeyAdapter implements Duck {

    Turkey turkey; //PAVO

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public String quak() {
        return turkey.gobble();
    }

    @Override
    public String fly() {
        return turkey.fly();
    }
}
