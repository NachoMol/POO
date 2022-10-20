import java.util.Scanner;

public class Main {

    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){
     Integer resultado = 0;
        if(unNumeroA > unNumeroB && unNumeroA > unNumeroC){
            resultado = unNumeroA;
        }
        else if (unNumeroB > unNumeroC){
            resultado = unNumeroB;
        }else{
            resultado = unNumeroC;
        }

        return  resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese numero A");
        Integer A = scanner.nextInt();
        System.out.println("ingrese numero B");
        Integer B = scanner.nextInt();
        System.out.println("ingrese numero C");
        Integer C = scanner.nextInt();

        System.out.println(maximoEntreTresNumeros(A,B,C));


    }
}