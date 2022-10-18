public class Main {
    public static void main(String[] args) {

        int num1;
        int num2;

        num1 = 10;
        num2 = 2;

        if (num1 % num2 == 0){
            int result = num1 / num2;
            System.out.println("el resultado es: "+result);
        }
        else{
            System.out.println("no son divisibles");
        }

    }
}