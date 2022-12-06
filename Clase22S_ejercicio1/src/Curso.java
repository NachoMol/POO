public class Curso extends OfertaAcademica{


    private int cargaHorariaMensual;
    private int cantidadMeses;
    private double valorHora;

    public Curso(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public void setCargaHorariaMensual(int cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    public void setCantidadMeses(int cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    @Override
    public double calcularPrecio() {
        return cargaHorariaMensual * cantidadMeses * valorHora;
    }

    @Override
    public String mostrarOferta(){
        return super.mostrarOferta() + " Precio: " + this.calcularPrecio();
    }




}
