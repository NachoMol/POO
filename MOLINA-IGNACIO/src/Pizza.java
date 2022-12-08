public abstract class Pizza {

    private String nombre;
    private String descripcion;

    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    public String mostrarPizza(){
        return "Nombre: " + nombre + "\n" + "Precio: " + this.calcularPrecio() + "\n";
    };


}
