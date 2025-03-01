package org.example.clases;

import org.example.clases.exceptions.FormacionIncorrectaException;

/**
 * @author Izan López Mora 1DAM
 * Clase que hereda atributos de la clase MutxamelIFC y métodos de la interfaz AccionesDeportivas. Simula un entrenador
 * de un equipo de fútbol
 */
public class Entrenador extends MutxamelIFC implements AccionesDeportivas{

    private Equipos equipo; //Tipo de equipo del entrenador recibido del enum Equipos
    private String formacionPreferida; //Formación preferida del entrenador en formato X-X-X

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = comprobarFormacion(formacionPreferida);
    }

    /**
     * Método que recibe la formación preferida del entrenador y comprueba que cumple con el formato X-X-X.
     * Si no cumple con ese formato lanza la excepción FormacionIncorrectaException.
     * @param formacionPreferida - Atributo de la clase para comprobar el formato
     * @return - La formación preferida con el formato ya comprobado
     */
    public String comprobarFormacion(String formacionPreferida){
        if (formacionPreferida.matches("\\d+-+\\d+-+\\d")){
            return formacionPreferida;
        }
        throw new FormacionIncorrectaException("ERROR. El formato de la formación es incorrecto.");
    }

    /**
     * Método que simula la planificación de un entrenamiento
     */
    public void planificarEntrenamiento(){
        System.out.println("Entrenamiento del entrenador " + getNombre() + " planificado.");
    }

    /**
     * Método que recibe 2 jugadores y simula un cambio entre ellos en un partido.
     * @param j1
     * @param j2
     */
    public void hacerCambios(Jugador j1, Jugador j2){
        System.out.println("Cambiando jugador " + j1.getNombre() + " por " + j2.getNombre() + " en el campo...");
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    /**
     * Método heredado de la interfaz AccionesDeportivas que simula un entrenamiento.
     */
    @Override
    public void entrenar() {
        System.out.println(getNombre() + " entrenando al equipo " + equipo);
    }

    /**
     * Método heredado de la interfaz AccionesDeportiva que recibe un rival y simula un partido de fútbol con él.
     * @param rival
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println("Disputando partido contra el equipo" + rival);
    }

    /**
     * Método heredado de la interfaz FuncionesIntegrantes. Muestra un mensaje de "concentración".
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrándose en el partido...");
    }

    /**
     * Método heredado de la interfaz FuncionesIntegrantes. Recibe una ciudad y simula un viaje a ella.
     * @param ciudad
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viajando a " + ciudad);
    }

    /**
     * Método heredado de la interfaz FuncionesIntegrantes. Celebra un gol.
     */
    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOOL");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre=" + getNombre() +
                ", edad=" + getEdad() +
                ", equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }
}
