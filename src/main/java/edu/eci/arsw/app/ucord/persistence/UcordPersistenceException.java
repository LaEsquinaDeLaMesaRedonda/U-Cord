package edu.eci.arsw.app.ucord.persistence;

public class UcordPersistenceException extends Exception {
    public UcordPersistenceException(String message) {
        super(message);
    }

    public UcordPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
