public class Dueño {

    private String nombre;
    private String apellido;
    private Integer cuil;

    public Dueño(String nombre, String apellido, Integer cuil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
    }

    public String toString(){
        return "Nombre: " + nombre + " Apellido: " + apellido + " Cuil: " + cuil;
    }
}
