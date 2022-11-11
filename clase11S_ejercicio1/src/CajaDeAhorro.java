public class CajaDeAhorro extends Cuenta{

private Double tasaInteres;

    public CajaDeAhorro(Integer numeroCliente, String apellido, Integer dni, Integer cuit, Double tasaInteres) {
        super(numeroCliente, apellido, dni, cuit);
        this.tasaInteres = tasaInteres;
    }


    @Override
    public void extraer(Double saldo){
        if(this.informarSaldo() >= saldo){
            this.setSaldo(this.getSaldo() - saldo);
            System.out.println("se retiro correctamente: " + saldo);
        }else {
            System.out.println("no tienes saldo suficiente");
        }
    }

    public void cobrarInteres(){
       Double auxiliar = informarSaldo() * tasaInteres;

       this.depositar(auxiliar);

    }

}
