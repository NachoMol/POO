public class CajaDeAhorro extends Cuenta{

private Double tasaInteres;

    public CajaDeAhorro(Integer numeroCliente, String apellido, Integer dni, Integer cuit, Double tasaInteres) {
        super(numeroCliente, apellido, dni, cuit);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(Double saldo){
        if(this.informarSaldo() > 0){
            this.depositar(saldo);
        }
    }

    @Override
    public void extraer(Double saldo){
        if(this.informarSaldo() > 0){
            this.extraer(saldo);
        }
    }

    public void cobrarInteres(){
       Double auxiliar = informarSaldo() * tasaInteres;

       this.depositar(auxiliar);

    }

}
