public class Main {

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        if(unTextoA.equals(unTextoB) == false){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(cadenasDeTextoDistintas("hola","hola"));
    }
}