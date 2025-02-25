package org.example.clases;

public class Acompañante extends MutxamelIFC{

    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public void animarEquipo(){
        System.out.println(getNombre() + " anima con furor a su equipo.");
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrándose en dar su máximo apoyo.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " está viajando a " + ciudad);
    }

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
