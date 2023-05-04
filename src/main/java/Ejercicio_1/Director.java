package Ejercicio_1;

import Ejercicio_1.Bases.Base;
import Ejercicio_1.Bases.UnidadAdministrativa;
import Ejercicio_1.Constructores.ConstructorBase;
import Ejercicio_1.Constructores.ConstructorBases;
import Ejercicio_1.Constructores.ConstructorUnidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Director {

    private Scanner sc = new Scanner(System.in);

    public Director() {
    }

    public Base crearBase() {
        ConstructorBase cons = new ConstructorBases();
        System.out.println("Introduce el nombre de la base: ");
        cons.setNombre(sc.nextLine());
        System.out.println("Introduce el número de ambulancias de la base: ");
        cons.setNumAmbulancias(sc.nextInt());
        sc.nextLine();
        System.out.println("Introduce el tiempo medio de respuesta de la base: ");
        cons.setTiempoMedio(sc.nextInt());
        sc.nextLine();
        return cons.getBase();


    }

    public UnidadAdministrativa crearUnidadAdministrativa () {
        ConstructorUnidades cons = new ConstructorUnidades();
        System.out.println("Introduce el nombre de la unidad administrativa: ");
        cons.setNombre(sc.nextLine());
        System.out.println("Introduce el número de bases de la unidad administrativa: ");
        int numBases = sc.nextInt();

        for (int i = 0; i < numBases; i++) {
            System.out.println("Introduce los datos de la base " + (i + 1) + ":");
            cons.addBase(crearBase());
        }
        return cons.getBase();
    }
}
