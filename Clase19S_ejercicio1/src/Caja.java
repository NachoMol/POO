public class Caja extends Producto{


    private double longitud;
    private double ancho;
    private double altura;

    @Override
    public double calcularEspacio(){
        return ancho*altura*longitud;
    }


}
