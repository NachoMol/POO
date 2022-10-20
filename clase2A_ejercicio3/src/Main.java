import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String apellido;



        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = scanner.nextLine();

        String iniciales = nombre.charAt(0) + "" + apellido.charAt(0);

        System.out.println(iniciales);
    }
}