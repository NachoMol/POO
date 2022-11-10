public class Main {
    public static void main(String[] args) {

        Cuenta cliente1;
        cliente1= new CajaDeAhorro(1,"Molina",41710177,41710177, 0.0);
        cliente1.depositar(500.0);
        cliente1.extraer(600.0);
        System.out.println(cliente1.informarSaldo());

    }
}