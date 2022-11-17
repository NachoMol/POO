import java.time.LocalDate;

public abstract class Embarcacion {

    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioFabricacion;

    private Double esLora;

    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double esLora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.esLora = esLora;
    }

    public Double calcularAlquiler(){
        if(this.anioFabricacion > 2020){
         return precioBase + valorAdicional;
        }else{
            return precioBase;
        }
    }


}
