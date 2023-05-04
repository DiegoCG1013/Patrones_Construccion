package Ejercicio_1.Constructores;

import Ejercicio_1.Bases.Base;

public class ConstructorBases implements ConstructorBase{

    private Base base;

    public ConstructorBases(){
        this.reset();
    }

    @Override
    public void reset() {
        this.base = new Base();
    }

    @Override
    public void setNombre(String nombre) {
        this.base.setNombre(nombre);
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
    public Base getBase() {
        Base base = this.base;
        this.reset();
        return base;
    }



}
