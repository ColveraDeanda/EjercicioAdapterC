package mx.edu.utng.colvera.ejercicioadapterc;

/**
 * Created by Ganzo on 24/09/2017.
 */

public class WildTurkey implements Turkey { //PavoSalvaje
    @Override
    public String gobble() {
        return "gordo gordo gordo...";
    }

    @Override
    public String fly() {
        return "I am flying a short distance";
    }

}
