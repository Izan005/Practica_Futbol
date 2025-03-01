package org.example.clases;

import org.example.clases.exceptions.DorsalDuplicadoException;

import java.util.ArrayList;

/**
 * @author Izan López Mora 1DAM
 * Clase que hereda atributos de la clase MutxamelIFC y métodos de la interfaz AccionesDeportivas. Simula un jugador
 * de un equipo de fútbol
 */
public class Jugador extends MutxamelIFC implements AccionesDeportivas{

    private static ArrayList<Integer> listaDorsales = new ArrayList<>(); //Lista que guarda los dorsales en uso
    private Equipos categoria; //Tipo de categoría recibida del enum Equipos
    private int dorsal;
    private Posiciones posicion; //Tipo de posición recibida del enum Posiciones

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = verificarDorsal(dorsal);
        this.posicion = posicion;

    }

    /**
     * Método que recorre la lista listaDorsales y comprueba que el dorsal del jugador no se haya registrado ya.
     * Si ha sido registrado previamente salta la excepción DorsalDuplicadoException.
     * @param dorsal
     * @return - El dorsal tras comrobar que no está registrado
     */
    public int verificarDorsal(int dorsal){
        for (int i = 0; i < listaDorsales.size(); i++){
            if (listaDorsales.get(i) == dorsal){
                throw new DorsalDuplicadoException("ERROR. El dorsal " + dorsal + " ya lo tiene otro jugador");
            }
        }
        listaDorsales.add(dorsal);
        return dorsal;
    }

    /**
     * Método que simula un calentamiento.
     */
    public void calentar(){
        System.out.println(getNombre() + " calentando para el partido...");
    }

    /**
     * Método que simula un descanso.
     */
    public void descansar(){
        System.out.println(getNombre() + " descansando para recuperar energías...");
    }

    /**
     * Método que simula marcar un gol
     */
    public void marcarGol(){
        System.out.println("GOLAZO DE " + getNombre());
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    /**
     * Método heredado de la interfaz AccionesDeportivas que simula un entrenamiento.
     */
    @Override
    public void entrenar() {
        System.out.println(getNombre() + " preparándose para el siguiente partido.");
    }

    /**
     * Método heredado de la interfaz AccionesDeportiva que recibe un rival y simula un partido de fútbol con él.
     * @param rival
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println("Disputando partido contra el equipo " + rival);
    }

    /**
     * Método heredado de la interfaz FuncionesIntegrantes. Muestra un mensaje de "concentración".
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrándose para hacer una jugada increíble.");
    }

    /**
     * Método heredado de la interfaz FuncionesIntegrantes. Recibe una ciudad y simula un viaje a ella.
     * @param ciudad
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viajando a " + ciudad + " para jugar el siguiente partido.");
    }

    /**
     * Método heredado de la interfaz FuncionesIntegrantes. Celebra un gol.
     */
    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOOOOL");
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre=" + getNombre() +
                ", edad=" + getEdad() +
                ", categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", posicion=" + posicion +
                '}';
    }
}
