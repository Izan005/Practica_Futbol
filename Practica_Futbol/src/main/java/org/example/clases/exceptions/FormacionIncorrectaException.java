package org.example.clases.exceptions;

/**
 * @author Izan López Mora 1DAM
 * Excepción que salta cuando la formación preferida de los entrenadores no está en formato X-X-X.
 */
public class FormacionIncorrectaException extends RuntimeException {
    public FormacionIncorrectaException(String message) {
        super(message);
    }
}
