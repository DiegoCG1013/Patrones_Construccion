package Ejercicio_2.Fabricas;

import Ejercicio_2.Componentes.UnidadCentral;

public interface Fabrica {
    public UnidadCentral crearUnidadCentral();
    public UnidadEntrada crearUnidadEntrada();
    public UnidadSalida crearUnidadSalida();

}
