package org.example.clases;

/**
 * @author Izan López Mora 1DAM
 * Clase que hereda atributos de la clase MutxamelIFC. Simula un masajista de un equipo de fútbol.
 */
public class Masajista extends MutxamelIFC{

    private String titulacion; //Titulación del masajista
    private int añosExperiencia; //Años de experiencia del masajista

    public Masajista(String nombre, int edad, String titulacion, int añosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    /**
     * Método que recibe a un jugador y simula un masaje a este.
     * @param jugador
     */
    public void darMasaje(Jugador jugador){
        System.out.println("Dándole un masaje a " + jugador.getNombre() + " para relajar sus músculos.");
    }

    /**
     * Método heredado de la interfaz FuncionesIntegrantes. Muestra un mensaje de "concentración".
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrándose para dar el mejor masaje...");
    }

    /**
     * Método heredado de la interfaz FuncionesIntegrantes. Recibe una ciudad y simula un viaje a ella.
     * @param ciudad
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viajando a " + ciudad + " para apoyar al equipo.");
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
        return "Masajista{" +
                "nombre=" + getNombre() +
                ", edad=" + getEdad() +
                ", titulacion='" + titulacion + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                '}';
    }
}
