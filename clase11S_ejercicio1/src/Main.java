public class Main {
    public static void main(String[] args) {

        Cuenta cliente1;
        cliente1= new CajaDeAhorro(1,"Molina",41710177,41710177, 0.0);
        cliente1.depositar(500.0);
        cliente1.extraer(600.0);
        System.out.println(cliente1.informarSaldo());

        Cuenta cliente2 = new CuentaComitente(2,"Molina", 41710177,41710177, "asd1324");

        if(cliente2 instanceof CuentaComitente){
            ((CuentaComitente)cliente2).depositar(5000.0);
            ((CuentaComitente)cliente2).extraer(4500.0);
            ((CuentaComitente)cliente2).extraer(4500.0,"asd1234");
        }

    }
}