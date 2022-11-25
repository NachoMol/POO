public class Main {
    public static void main(String[] args) {


        Reserva reserva1 = new Reserva(123,"Buenos Aires", "Mar del Plata",50);
        Reserva reserva2 = new Reserva(123,"Buenos Aires", "Mar del Plata",50);
        Reserva reserva3 = new Reserva(123,"Buenos Aires", "Mar del Plata",50);


        Empresa empresa1 = new Empresa();

        empresa1.agregarReserva(reserva1);
        empresa1.agregarReserva(reserva2);
        empresa1.agregarReserva(reserva3);

        empresa1.recaudacionTotal();


        try{
            empresa1.cantVecesRecorrida("Buenos Aires");
            empresa1.cantVecesRecorrida("Bragado");
        } catch (EmpresaException e) {
            System.err.println(e.toString());
        }


    }
}