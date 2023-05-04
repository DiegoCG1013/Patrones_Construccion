package Ejercicio_1.Bases;

import java.util.ArrayList;

public class UnidadAdministrativa extends Base {

    private ArrayList<Base> bases;

    public UnidadAdministrativa() {
        this.bases = new ArrayList<>();
    }

    public void addBase(Base base) {
        this.bases.add(base);
    }

    public ArrayList<Base> getBases() {
        return bases;
    }
}