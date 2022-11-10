public abstract class Cuenta extends Cliente {

    private Double saldo = 0.0;
    private Cliente cliente;



    public Cuenta(Integer numeroCliente, String apellido, Integer dni, Integer cuit) {
        super(numeroCliente, apellido, dni, cuit);
    }

    public void depositar(Double saldo){

        this.saldo += saldo;

        System.out.println("Se deposito correctamente: " + saldo);

    }

    public void extraer (Double saldo){
        this.saldo -= saldo;

        System.out.println("Se extrajo correctamente: " + saldo);
    }

    public Double informarSaldo (){
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
