public class Simple extends Pizza{

    private Double precioBase;
    private Boolean esEspecial;

    public Simple(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public void setEsEspecial(Boolean esEspecial) {
        this.esEspecial = esEspecial;
    }

    @Override
    public Double calcularPrecio(){

        if (esEspecial == true){
            return precioBase * 1.7;
        }else{
            return precioBase;
        }

    }

}
