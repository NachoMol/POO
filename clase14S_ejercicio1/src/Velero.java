public class Velero extends Embarcacion{

    private Integer cantidadMastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double esLora, Integer cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, esLora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public Boolean esGrande(){
        if(this.cantidadMastiles > 4){
            return true;
        }else{
            return false;
        }
    }


}
