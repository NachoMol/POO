import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica{

    private double porcentajeBonificacion;
    private ArrayList <OfertaAcademica> ofertas;


    public ProgramaIntensivo(String nombre, String descripcion) {
        super(nombre, descripcion);
        ofertas = new ArrayList<>();
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public void agregarOferta(OfertaAcademica oferta){
        ofertas.add(oferta);
    }

    public double calcularBonificacion(double valor){
        return valor*porcentajeBonificacion/100;
    }

    @Override
    public double calcularPrecio() {
        double precio = 0.0;
        for(OfertaAcademica oferta: ofertas){
            precio+= oferta.calcularPrecio();
        }

        return precio-calcularBonificacion(precio);

    }

    @Override
    public String mostrarOferta(){
        return super.mostrarOferta() + " Precio: " + calcularPrecio();
    };

}
