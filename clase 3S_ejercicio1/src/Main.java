import java.util.Scanner;

public class Main {

    public static int cuantosPaquetes(double comidaNecesaria){
        double sumatoriaPaquetes = 0;
        int cantidadPaquetes;
        double comidaDelPaquete;
        Scanner scanner = new Scanner(System.in);

        for (cantidadPaquetes = 0; sumatoriaPaquetes < comidaNecesaria ; cantidadPaquetes++){
            System.out.println("Ingrese comida del paquete");
            comidaDelPaquete = scanner.nextDouble();

            sumatoriaPaquetes += comidaDelPaquete;

        }
        return cantidadPaquetes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombrePerro;
        double comidaNecesaria = 0;

        System.out.println("Ingrese nombre del perro");
        nombrePerro = scanner.nextLine();
        while(comidaNecesaria < 3){
            System.out.println("Ingrese comida necesaria por dia (en kg). Deben ser como minimo 3kg");
            comidaNecesaria = scanner.nextDouble();
        }
            System.out.println("Para " + nombrePerro + " se precisaron: " + cuantosPaquetes(comidaNecesaria) + " paquetes");
    }
}