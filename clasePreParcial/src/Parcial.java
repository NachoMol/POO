public class Parcial extends Examen {

    private String numeroUnidad;
    private String cantidadIntentos;

    public Parcial(String titulo, String enunciado, Double nota, String numeroUnidad, String cantidadIntentos) {
        super(titulo, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.cantidadIntentos = cantidadIntentos;
    }

    @Override
    public Boolean aprobado(){
        if(this.getNota() >= 4){
            return true;
        }else{
            return false;
        }
    }
}
