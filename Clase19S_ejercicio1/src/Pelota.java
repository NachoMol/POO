public class Pelota extends Producto{



    private double radio;

    @Override
    public double calcularEspacio() {
        return (3.14*radio)*(3.14*radio);
    }

}
