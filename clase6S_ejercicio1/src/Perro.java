import java.time.LocalDate;

public class Perro {

    private Boolean enAdopcion;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private Boolean tieneChip;
    private Boolean estaLastimado;
    private String nombre;

    public Perro (boolean enAdopcion, String raza, int anioNacimiento, double peso, Boolean tieneChip, Boolean estaLastimado, String nombre){
        this.enAdopcion = enAdopcion;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombre = nombre;
    }

    public Perro (String nombre){
        this.nombre = nombre;
    }

    public Boolean sePuedePerder (){
        if(!this.tieneChip){
            return true;
        }else{
            return false;
        }
    }

    public Boolean sePuedeAdoptar(){
        if(!estaLastimado && peso > 5){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "Nombre: " + nombre + " Peso: " + peso;
    };

}
