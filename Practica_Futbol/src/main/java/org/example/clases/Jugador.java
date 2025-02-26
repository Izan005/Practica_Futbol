package org.example.clases;

import org.example.clases.exceptions.DorsalDuplicadoException;

import java.util.ArrayList;

public class Jugador extends MutxamelIFC implements AccionesDeportivas{

    private static ArrayList<Integer> listaDorsales = new ArrayList<>();
    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = verificarDorsal(dorsal);
        this.posicion = posicion;

    }

    public int verificarDorsal(int dorsal){
        for (int i = 0; i < listaDorsales.size(); i++){
            if (listaDorsales.get(i) == dorsal){
                throw new DorsalDuplicadoException("ERROR. El dorsal " + dorsal + " ya lo tiene otro jugador");
            }
        }
        listaDorsales.add(dorsal);
        return dorsal;
    }


    public void calentar(){
        System.out.println(getNombre() + " calentando para el partido...");
    }

    public void descansar(){
        System.out.println(getNombre() + " descansando para recuperar energías...");
    }

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

    @Override
    public void entrenar() {
        System.out.println(getNombre() + " preparándose para el siguiente partido.");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Disputando partido contra el equipo " + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrándose para hacer una jugada increíble.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viajando a " + ciudad + " para jugar el siguiente partido.");
    }

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
