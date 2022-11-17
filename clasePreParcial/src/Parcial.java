public class Parcial extends Examen implements Recuperable {

    private Integer numeroUnidad;
    private Integer cantidadIntentos;

    public Parcial(String titulo, String enunciado, Double nota, Integer numeroUnidad, Integer cantidadIntentos) {
        super(titulo, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.cantidadIntentos = cantidadIntentos;
    }

    @Override
    public Boolean aprobado() {
        if (this.getNota() >= 4) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public boolean puedeRecuperar() {

        boolean resultado = false;

        if (this.numeroUnidad <= 3) {
            if (this.cantidadIntentos < 3) {
                resultado = true;
            } else if (this.cantidadIntentos < 2) {
                resultado = true;
            }
        }
        return resultado;
    }
}
