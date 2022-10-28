import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Perro perro1 = new Perro(false,"Salchicha", 2013,8.0,false,false,"Ulises");


        System.out.println(perro1);

        System.out.println(perro1.sePuedePerder());
        System.out.println(perro1.sePuedeAdoptar());
    }

}