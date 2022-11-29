import java.util.ArrayList;

public class Almacen {

    private ArrayList<Producto> productos;


    public double calcularEspacioNecesario(){
    double resultado = 0.0;
    for(Producto producto: productos){
        resultado += producto.calcularEspacio();
    }
    return resultado;
}

public void agregarProducto(Producto p){
    productos.add(p);
}

}
