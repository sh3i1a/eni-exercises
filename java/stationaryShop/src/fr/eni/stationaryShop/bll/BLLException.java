package fr.eni.stationaryShop.bll;

public class BLLException extends Exception {

    public BLLException() {
    }

    public BLLException(String message) {
        super(message);
    }

    public BLLException(String message, Throwable cause) {
        super(message, cause);
    }
}