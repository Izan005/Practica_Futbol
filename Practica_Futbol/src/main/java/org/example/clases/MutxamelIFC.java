package org.example.clases;

/**
 * @author Izan López Mora 1DAM
 * Clase abstracta de la que heredan las clases Jugador, Masajista, Entrenador y Acompañante. Esta clase también hereda
 * métodos de la interfaz FuncionesIntegrantes.
 */
abstract class MutxamelIFC implements FuncionesIntegrantes{

    private String nombre; //Nombre del individuo
    private int edad; //Edad del individuo

    public MutxamelIFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
