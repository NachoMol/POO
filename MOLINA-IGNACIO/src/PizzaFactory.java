public class PizzaFactory {

    private static PizzaFactory instancia;
    public static final String SIMPLE="S";
    public static final String COMBINADA="C";

    public PizzaFactory() {
    }

    public static PizzaFactory obtenerInstancia(){
        if(instancia == null)
            instancia= new PizzaFactory();
        return instancia;
    }

    public Pizza crearPizza(String codigo, String nombre, String descripcion){
        switch (codigo){
            case "S":
                return new Simple(nombre, descripcion);

            case "C":
                return new Combinada(nombre, descripcion);

        }
        return null;
    }

}
