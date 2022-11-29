public class Main {
    public static void main(String[] args) {



        ProductoFactory productoFactory = ProductoFactory.obtenerInstancia();

        Pelota pelota = (Pelota) productoFactory.crearProducto("PELOTAFUTBOL");
        Pelota pelota2 = (Pelota) productoFactory.crearProducto("PELOTAFUTBOL");

        Almacen almacen = new Almacen();

        almacen.agregarProducto(pelota);
        almacen.agregarProducto(pelota2);

        System.out.println(almacen);


    }
}