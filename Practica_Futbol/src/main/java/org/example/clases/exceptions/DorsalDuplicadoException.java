package org.example.clases.exceptions;

/**
 * @author Izan López Mora 1DAM
 * Excepción que salta cuando se encuentra un dorsal duplicado en los jugadores
 */
public class DorsalDuplicadoException extends RuntimeException{

    public DorsalDuplicadoException(String message){super(message);}
}
