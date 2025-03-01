package org.example.clases;

import org.example.clases.exceptions.FormacionIncorrectaException;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Izan López Mora 1DAMG
 * @version 1.0
 * Clase que se encarga de gestionar la creación y modificación de las clases Jugador, Entrenador, Masajista y
 * Acompañante. En mi caso, yo he elegido hacer el menú de modificación de la clase Entrenador.
 */
public class AppMantenimiento {
    static Scanner entrada = new Scanner(System.in);

    public static ArrayList<Entrenador> listaEntrenadores = new ArrayList<>(); //Lista de entrenadores

    public static void main(String[] args) {
       menuMantenimiento();
    }

    /**
     * Método que muestra el menú de mantenimiento de jugadores, entrenadores y masajistas. También puedes consultar
     * los equipos.
     */
    public static void menuMantenimiento(){
        String opc = "";
        System.out.println("=== App de mantenimiento del MUTXAMEL FC ===");
        System.out.println("\t[1]. Mantenimiento de jugadores \n \t Dentro podremos añadir jugadores," +
                " modificar datos y añadir acompañantes (sólo seniors).");
        System.out.println("\t[2]. Mantenimiento de entrenadores (añadir-modificar-salir)\n \t Dentro podremos" +
                " añadir entrenadores y modificar sus datos.");
        System.out.println("\t[3]. Mantenimiento masajistas (añadir-modificar-salir)\n \t Dentro podremos" +
                " añadir masajistas y modificar sus datos.");
        System.out.println("\t[4]. Consultar equipos\n \t Dentro se deben listar los tipos de equipos" +
                " del club y elegir uno.");
        System.out.println("\t[X]. Salir");
        System.out.println("===================================================");
        System.out.print("Selecciona una opción -->");
        opc = entrada.next();
        menuSeleccion(opc);
    }

    /**
     * Switch/Case que recibe una opción del método menuMantenimiento() y accede al menú de modificación
     * correspondiente.
     * @param opc - Opción recibida del método menuMantenimiento()
     */
    public static void menuSeleccion(String opc){
        switch (opc.toUpperCase()) {
            case "1":
               // menuJugadores();
                break;
            case "2":
                menuEntrenadores();
                break;
            case "3":
               // menuMasajistas();
                break;
            case "4":
               // menuConsultar();
                break;
            case "X":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción incorrecta.");
                menuMantenimiento();
                break;
        }
    }

    /**
     * Método que muestra el menú de manteniemiento de los entrenadores y solicita una opción a seleccionar.
     */
    public static void menuEntrenadores(){
        String opc = "";
        System.out.println("=== Mantenimiento de Entrenadores ===");
        System.out.println("\t[1]. Añadir nuevo entrenador");
        System.out.println("\t[2]. Modificar datos de entrenador existente");
        System.out.println("\t[3]. Consultar entrenadores");
        System.out.println("\t[X]. Salir");
        System.out.println("===========================================");
        System.out.print("Selecciona una opción -->");
        opc = entrada.next();
        menuSeleccionEntrenadores(opc);
    }

    /**
     * Switch/Case que recibe la opción seleccionada en el método menuEntrenadores() y accede al método de modificación
     * solicitado
     * @param opc - Opción recibida de menuEntrenadores()
     */
    public static void menuSeleccionEntrenadores(String opc){
        switch (opc.toUpperCase()) {
            case "1":
                Entrenador e = crearEntrenador();

                 //Bucle que elimina a cualquier entrenador que sea null
                    if (e == null){
                        System.out.println("Algún dato ha sido incorrecto, por lo que no se creará el entrenador.");
                    } else {
                        listaEntrenadores.add(e);
                    }

                menuEntrenadores();
                break;
            case "2":
                menuModificarEntrenador();
                menuEntrenadores();
                break;
            case "3":
                consultarEntrenadres();
                menuEntrenadores();
                break;
            case "X":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción incorrecta.");
                menuEntrenadores();
                break;
        }
    }

    /**
     * Método que pregunta por todos los parámetros de un entrenador (nombre, edad, formación preferida y equipo)
     * @return - Entrenador nuevo
     */
    public static Entrenador crearEntrenador(){
        Entrenador entrenador;
        String nombre = "";
        int edad = 0;
        String formacionPreferida = "";
        String equipoSeleccionado = "";
        Equipos equipo;

        System.out.println();
        System.out.println("=== Mantenimiento de Entrenadores. Añadir nuevo entrenador ===");
        System.out.println("Introduce el nombre: ");
        nombre = entrada.next();
        System.out.println("Introduce edad: ");
        edad = entrada.nextInt();
        System.out.println("Introduce formación preferida (X-X-X)");
        formacionPreferida = entrada.next();
        System.out.println("Introduce el equipo (BEJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR)");
        equipoSeleccionado = entrada.next();
        equipo = Equipos.valueOf(equipoSeleccionado.toUpperCase());

        try { //Try/Catch para cazar la excepción FormatoIncorrectoException
            entrenador = new Entrenador(nombre, edad, equipo, formacionPreferida);
            System.out.println("El entrenador " + entrenador + " ha sido creado.");
            return entrenador;
        } catch (FormacionIncorrectaException e){
            System.out.println(e);
        }

        return null; //Si se caza el error el entrenador pasa a ser null
    }

    /**
     * Método que muestra los entrenadores existentes y otorga la opción de selecionar al entrenador que queramos.
     */
    public static void menuModificarEntrenador(){
        int opc = 0;
        System.out.println();
        System.out.println("=== Mantenimiento de Entrenadores. Modificar entrenador existente ===");

        System.out.println("Entrenadores disponibles: ");
        for (int i = 0; i < listaEntrenadores.size(); i++) {
            System.out.println("[" + i + ": " + listaEntrenadores.get(i) + "]");
        }
        System.out.println("========================================");
        System.out.print("\n Seleccionar una opción -->");
        opc = entrada.nextInt();

        // Condicional que comprueba que el entrenador elegido esté en el rango de entrenadores a elegir.
        if (listaEntrenadores.size() <= opc){
            System.out.println("El entrenador seleccionado no se encuentra en la lista");
            menuEntrenadores();
        }
        seleccionarModificacionEntrenador(opc);
    }

    /**
     * Menú que recibe el entrenador a modificar como parámetro y muestra por pantalla las opciones de modificación
     * disponibles para poder seleccionar el parámetro a modificar.
     * @param entrenador - Índice de la lista de entrenadores pasada como parámetro
     */
    public static void seleccionarModificacionEntrenador(int entrenador){
        String opc = "";
        System.out.println("Has seleccionado el entrenador " + listaEntrenadores.get(entrenador) + ". " +
                "¿Qué quieres hacer?");
        System.out.println("\t[1]. Cambiar nombre");
        System.out.println("\t[2]. Cambiar edad");
        System.out.println("\t[3]. Cambiar equipo");
        System.out.println("\t[4]. Cambiar formación preferída");
        System.out.println("\t[X]. Salir");
        System.out.println("====================================");
        System.out.print("Selecciona una opción -->");
        opc = entrada.next();
        modificarEntrenador(entrenador, opc);
    }

    /**
     * Switch/Case que, según el entrenador seleccionado y el parámetro a modificar
     * en el método seleccionarModificacionEntrenador() modifica el parámetro seleccionado del entrenador
     * @param entrenador - Índice de la lista de entrenadores pasada como parámetro
     * @param opc - Opción del menú pasada como parámentro
     */
    public static void modificarEntrenador(int entrenador, String opc){
        switch (opc.toUpperCase()){
            case "1":
                String nombre = "";
                System.out.println("Introduce nuevo nombre:");
                nombre = entrada.next();
                listaEntrenadores.get(entrenador).setNombre(nombre);
                System.out.println("Nuevo nombre establecido para el entrenador " + listaEntrenadores.get(entrenador));
                menuEntrenadores();
            case "2":
                int edad = 0;
                System.out.println("Introduce nueva edad:");
                edad = entrada.nextInt();
                listaEntrenadores.get(entrenador).setEdad(edad);
                System.out.println("Nueva edad establecida para el entrenador " + listaEntrenadores.get(entrenador));
                menuEntrenadores();
            case "3":
                String equipoSeleccionado = "";
                Equipos equipo;
                System.out.println("Introduce nuevo equipo (BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR)");
                equipoSeleccionado = entrada.next();
                equipo = Equipos.valueOf(equipoSeleccionado.toUpperCase());
                listaEntrenadores.get(entrenador).setEquipo(equipo);
                System.out.println("Nuev equipo establecido para el entrenador " + listaEntrenadores.get(entrenador));
                menuEntrenadores();
            case "4":
                String formacionPreferida = "";
                System.out.println("Introduce nueva formación preferida (X-X-X)");
                formacionPreferida = entrada.next();

                if (formacionPreferida.matches("\\d+-+\\d+-+\\d")){
                    listaEntrenadores.get(entrenador).setFormacionPreferida(formacionPreferida);
                    System.out.println("Nueva formación preferida establecida para el entrenador " + listaEntrenadores.get(entrenador));
                } else {
                    System.out.println("Formación incorrecta. No se modificará.");
                }
                menuEntrenadores();
            case "X":
                System.out.println("Saliendo...");
                menuEntrenadores();
            default:
                System.out.println("Opción incorrecta.");
                seleccionarModificacionEntrenador(entrenador);
        }
    }

    /**
     * Muestra todos los entrenadores existentes.
     */
    public static void consultarEntrenadres(){
        System.out.println("=== Entrenadores Creados ===");
        for (int i = 0; i < listaEntrenadores.size(); i++) {
            System.out.println("[" + i + ": " + listaEntrenadores.get(i) + "]");
        }
    }
}