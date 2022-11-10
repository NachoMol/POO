public class CuentaCorriente extends Cuenta{

    private Double montoAutorizado;

    public CuentaCorriente(Integer numeroCliente, String apellido, Integer dni, Integer cuit, Double montoAutorizado) {
        super(numeroCliente, apellido, dni, cuit);
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void extraer(Double saldo){
        if(this.informarSaldo() > 0){
            this.extraer(saldo);
        }else{
            this.extraer(montoAutorizado);
        }
    }

}
