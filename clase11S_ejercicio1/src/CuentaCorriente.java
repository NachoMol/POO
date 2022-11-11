public class CuentaCorriente extends Cuenta{

    private Double montoAutorizado;

    public CuentaCorriente(Integer numeroCliente, String apellido, Integer dni, Integer cuit, Double montoAutorizado) {
        super(numeroCliente, apellido, dni, cuit);
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void extraer(Double saldo){
        if(this.informarSaldo() >= saldo){
            this.setSaldo(this.getSaldo() - saldo);
            System.out.println("se retiro correctamente: " + saldo);
        }else{
            this.setSaldo(this.getSaldo() - montoAutorizado);
            System.out.println("se retiro correctamente: " + montoAutorizado + "MONTO AUTORIZADO");
        }
    }

}
