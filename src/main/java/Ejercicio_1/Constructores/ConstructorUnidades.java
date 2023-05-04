package Ejercicio_1.Constructores;

import Ejercicio_1.Bases.Base;
import Ejercicio_1.Bases.UnidadAdministrativa;

public class ConstructorUnidades implements ConstructorUnidadAdministrativa{
    private UnidadAdministrativa unidad;
    private Base base;

    @Override
    public void reset() {
        this.base = new Base();
    }

    @Override
    public void setNombre(String nombre) {
        this.unidad.setNombre(nombre);
    }

    @Override
    public void setNumAmbulancias(int numAmbulancias) {
        this.base.setNumAmbulancias(numAmbulancias);
    }

    @Override
    public void setTiempoMedio(int tiempoMedio) {
        this.base.setTiempoMedio(tiempoMedio);
    }

    @Override
    public void addBase() {
        this.unidad.addBase(base);
        base = new Base();
    }

    public void addBase(Base base) {
        this.unidad.addBase(base);
    }

    @Override
    public UnidadAdministrativa getBase() {
        UnidadAdministrativa base = unidad;

        int tiempoMedio = 0;
        int numAmbulancias = 0;
        for (Base b : unidad.getBases()) {
            tiempoMedio += b.getTiempoMedio();
            numAmbulancias += b.getNumAmbulancias();
        }

        base.setTiempoMedio(tiempoMedio / unidad.getBases().size());
        base.setNumAmbulancias(numAmbulancias);

        return base;

    }
}
