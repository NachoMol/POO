public class Main {
    public static void main(String[] args) {

        Cuenta cliente1 = new Cuenta(1,"Molina",41710177,41710177);
        cliente1.depositar(500.0);
        cliente1.extraer(300.0);
        cliente1.informarSaldo();

    }
}