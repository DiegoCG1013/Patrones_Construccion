package Ejercicio_1;

import java.util.ArrayList;

public class UnidadAdministrativa {

    private String nombre;
    private ArrayList<Base> bases;

    public UnidadAdministrativa(){
        this.bases = new ArrayList<>();
    }

    public void addBase(Base base) {
        this.bases.add(base);
    }

    public ArrayList<Base> getBases() {
        return bases;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
