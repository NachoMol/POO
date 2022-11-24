package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        try{
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(10,5,2021));
            Date fechaAlta = new Date(10,04,2021);
            paciente.darAlta(fechaAlta);
        }
        catch (PacienteException p){
            System.err.println(p.toString());
        }
        finally {
            System.out.println("Se ha cerrado la sesión");
        };



    }
}
