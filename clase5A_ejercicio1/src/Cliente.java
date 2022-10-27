public class Cliente {
    private String nombre;
    private String apellido;
    private Integer numeroCliente;
    private double deuda;

    public Cliente(String nombre, String apellido, Integer numeroCliente){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCliente = numeroCliente;
        deuda=0;
    }

    public void incrementarDeuda (double valor){
        deuda += valor;
    }

    public void pagar(){
        deuda= 0;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido (String apellido){
        this.apellido = apellido;
    }

    public String getNombre(){
    return nombre;
    }

    public String getApellido(){
        return apellido;
    }
}