package edu.eci.arsw.app.ucord.persistence;

public class UcordPersistenceException extends Exception {
    public static final String NOT_FOUND = "NOT_FOUND";
    public static final String FAILED_CREATING = "FAILED_CREATING";
    public static final String FAILED_UPDATING = "FAILED_UPDATING";
    public UcordPersistenceException(String message) {
        super(message);
    }

    public UcordPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
