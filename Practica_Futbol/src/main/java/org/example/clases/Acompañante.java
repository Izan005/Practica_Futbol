package org.example.clases;

/**
 * @author Izan López Mora 1DAM
 * Clase que hereda los atributos de la clase MutxamelIFC que representa a un acompañante de un jugador (clase Jugador)
 * en un partido de fútbol.
 */
public class Acompañante extends MutxamelIFC{

    private Jugador integrante; //Jugador al que acompaña
    private String parentesco; //Parentesco con el jugador al que acompaña

    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    /**
     * Método para animar al equipo.
     */
    public void animarEquipo(){
        System.out.println(getNombre() + " anima con furor a su equipo.");
    }

    /**
     * Método heredado de la interfaz FuncionesIntegrantes. Muestra un mensaje de "concentración".
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrándose en dar su máximo apoyo.");
    }

    /**
     * Método heredado de la interfaz FuncionesIntegrantes. Recibe una ciudad y simula un viaje a ella.
     * @param ciudad
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " está viajando a " + ciudad);
    }

    /**
     * Método heredado de la interfaz FuncionesIntegrantes. Celebra un gol.
     */
    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOL");
    }

    @Override
    public String toString() {
        return "Acompañante{" +
                "nombre=" + getNombre() +
                ", edad=" + getEdad() +
                ", integrante=" + integrante +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }
}
