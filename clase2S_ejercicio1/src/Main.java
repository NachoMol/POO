public class Main {

    public static boolean esPrimo (int numero){
        boolean aux = true;
        for(int i = 2;i < numero; i++){
            if (numero % i == 0){
                aux = false;
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        Sca
        System.out.println(esPrimo(47));
    }
}