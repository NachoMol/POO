public class Yate extends Embarcacion implements Comparable<Yate>{

    private Integer cantidadCamarotes;

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
