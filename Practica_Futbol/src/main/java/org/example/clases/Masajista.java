package org.example.clases;

public class Masajista extends MutxamelIFC{

    private String titulacion;
    private int añosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int añosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public void darMasaje(Jugador jugador){
        System.out.println("Dándole un masaje a " + jugador.getNombre() + " para relajar sus músculos.");
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrándose para dar el mejor masaje...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viajando a " + ciudad + " para apoyar al equipo.");
    }

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
