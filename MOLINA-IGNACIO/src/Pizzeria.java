import java.util.ArrayList;

public class Pizzeria {

    private String nombre;
    private ArrayList <Pizza> pizzas;


    public Pizzeria(String nombre) {
        this.nombre = nombre;
        pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public String mostrarPizzas(){
        String resultado = "";

        for(Pizza pizza: pizzas){
            resultado += pizza.mostrarPizza() + "\n";
        }

        return resultado;

    };


}
