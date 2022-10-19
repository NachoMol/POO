public class Main {
    public static void main(String[] args) {
        Integer num1 = 20;
        Integer num2 = 20;

        if (num1.equals(num2)){
            System.out.println("son iguales");
        }else if (num1.compareTo(num2) == -1){
            System.out.println(num2 + " es el mayor, mientras que el menor es " + num1);
        }else{
            System.out.println(num1 + " es el mayor, mientras que el menor es " + num2);
        }
    }
}