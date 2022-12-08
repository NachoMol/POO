public class Main {
    public static void main(String[] args) {


        Pizzeria pizzeria = new Pizzeria("PizzaLoca");

        PizzaFactory pizzaFactory = PizzaFactory.obtenerInstancia();

        Simple simple1 = (Simple) pizzaFactory.crearPizza("S","muzzarella", "Esta pizza es basica, pero muy rica");
        simple1.setEsEspecial(false);
        simple1.setPrecioBase(700.0);

        Simple simple2 = (Simple) pizzaFactory.crearPizza("S","margarita especial", "Esta pizza es como la muzzarella pero con un poco mas de onda");
        simple2.setEsEspecial(true);
        simple2.setPrecioBase(850.0);

        Simple simple3 = (Simple) pizzaFactory.crearPizza("S","anana", "Solo para valientes");
        simple3.setEsEspecial(false);
        simple3.setPrecioBase(950.0);

        Combinada combinada1 = (Combinada) pizzaFactory.crearPizza("C","Combinada loca", "La mejor del local");
        combinada1.agregarPizza(simple2);
        combinada1.agregarPizza(simple1);

        pizzeria.agregarPizza(simple1);
        pizzeria.agregarPizza(simple2);
        pizzeria.agregarPizza(simple3);
        pizzeria.agregarPizza(combinada1);

        System.out.println(pizzeria.mostrarPizzas());

    }
}