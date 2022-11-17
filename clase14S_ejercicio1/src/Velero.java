public class Velero extends Embarcacion{

    private Integer cantidadMastiles;

    public Boolean esGrande(){
        if(this.cantidadMastiles > 4){
            return true;
        }else{
            return false;
        }
    }


}
