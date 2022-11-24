package com.company;

public class PacienteException extends Exception{

    public PacienteException() {
        super();
    }

    public PacienteException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Ha ocurrido una excepcion: " + this.getClass().getName() + "error: " + this.getMessage();
    }
}
