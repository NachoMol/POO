public class Yate extends Embarcacion implements Comparable<Yate>{

    private Integer cantidadCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double esLora, Integer cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, esLora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Yate y){
        if (this.cantidadCamarotes > y.cantidadCamarotes){
            return 1;
        }else if(this.cantidadCamarotes == y.cantidadCamarotes){
            return 0;
        }else{
            return -1;
        }
    }

}
