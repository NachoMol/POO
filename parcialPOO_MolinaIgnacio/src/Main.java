import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        //Validando creacion de clases
        Dueño d1 = new Dueño("Ignacio","Molina",123456789);
        Dueño d2 = new Dueño("Lionel","Messi",987654321);
        Automovil v1 = new Automovil(d1,LocalDate.of(2022,1,25),50000.0,"Renault","ABC123",true,false,1100);
        Camion c1 = new Camion(d1,LocalDate.of(1990,1,25),100000.0,"Scania","ASDH12356",true,6,2000.0);
        Camion c2 = new Camion(d2,LocalDate.of(2004,1,20),30000000.0,"Audi","CBA123454",false,8,5000.0);

        //Validando toString
        System.out.println(d1.toString());
        System.out.println(d1.toString());


    }
}