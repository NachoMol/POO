import java.util.ArrayList;

public class Combinada extends Pizza{

    private ArrayList <Pizza> pizzas;

    public Combinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzas = new ArrayList<>();
    }

    public void agregarPizza (Pizza pizza){
        pizzas.add(pizza);
    }
    @Override
    public Double calcularPrecio(){
        Double resultado = 0.0;
        for(Pizza pizza: pizzas){
            if (pizza.calcularPrecio() > resultado){
                resultado = pizza.calcularPrecio();
            }
        }
        return resultado;
    }

    public String mostrarPizza(){
        String resultado = "";

        for(Pizza pizza: pizzas){
            resultado += pizza.mostrarPizza();
        }
         return super.mostrarPizza();
    }

}
