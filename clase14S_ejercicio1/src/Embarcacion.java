import java.time.LocalDate;

public abstract class Embarcacion {

    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioFabricacion;

    private Double esLora;

    public Double calcularAlquiler(){
        if(this.anioFabricacion > 2020){
         return precioBase + valorAdicional;
        }else{
            return precioBase;
        }
    }


}
