package org.example.clases;

import org.example.clases.exceptions.FormacionIncorrectaException;

public class Entrenador extends MutxamelIFC implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = comprobarFormacion(formacionPreferida);
    }

    public String comprobarFormacion(String formacionPreferida){
        if (formacionPreferida.matches("\\d+-+\\d+-+\\d")){
            return formacionPreferida;
        }
        throw new FormacionIncorrectaException("ERROR. El formato de la formación es incorrecto.");
    }

    public void planificarEntrenamiento(){
        System.out.println("Entrenamiento del entrenador " + getNombre() + " planificado.");
    }

    public void hacerCambios(Jugador j1, Jugador j2){
        System.out.println("Cambiando jugador " + j1.getNombre() + " por " + j2.getNombre() + " en el campo...");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando al equipo " + equipo);
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Disputando partido contra el equipo" + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrándose en el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a " + ciudad);
    }

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
