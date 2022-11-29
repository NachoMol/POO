public class ProductoFactory {

    private static ProductoFactory productoFactory;

    private ProductoFactory(){};

    public final static String caja = "CAJA10X10";
    public final static String pelota = "PELOTAFUTBOL";

    public static ProductoFactory obtenerInstancia(){
        if(productoFactory == null)
            return new ProductoFactory();
        return productoFactory;
    }

    public Producto crearProducto (String codigo){
        switch (codigo){
            case "CAJA10X10":
                return new Caja();
            case "PELOTAFUTBOL":
                return new Pelota();
        }
        return null;
    }






}
