package Ejercicio_1;

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

    @Override
    public Base getBase() {
        Base base = new Base();
        int tiempoMedio = 0;
        int numAmbulancias = 0;
        for(Base x : this.unidad.getBases()){
            tiempoMedio += x.getTiempoMedio();
            numAmbulancias += x.getNumAmbulancias();
        }

        base.setTiempoMedio(tiempoMedio/this.unidad.getBases().size());
        base.setNumAmbulancias(numAmbulancias);

        return base;
    }

}
