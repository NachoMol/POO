public class CuentaComitente extends Cuenta{

    private String claveCnv;

    public CuentaComitente(Integer numeroCliente, String apellido, Integer dni, Integer cuit, String claveCnv) {
        super(numeroCliente, apellido, dni, cuit);
        this.claveCnv = claveCnv;
    }

    @Override
    public void depositar(Double saldo){
        this.setSaldo(this.getSaldo()+saldo*0.99);

        System.out.println("Se deposito correctamente: " + saldo*0.99);
    }

    @Override
    public void extraer(Double saldo){
        if(saldo <= this.getSaldo() / 2){
            this.setSaldo(this.getSaldo() - saldo);
            System.out.println("se retiro correctamente: " + saldo);
        }else{
            System.out.println("No puedes extraer este monto, intente nuevamente ingresando clave cnv");
        }
    }


    public void extraer(Double saldo, String claveCnv){
        if(this.informarSaldo() > saldo){
            this.setSaldo(this.getSaldo() - saldo);
            System.out.println("se retiro correctamente: " + saldo);
        }else {
            System.out.println("no tienes saldo suficiente");
        }
    }

}
