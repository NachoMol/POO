

public class Main {

    public static boolean esDivisible(int n, int divisor)
    {
        if (n % divisor == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(esDivisible(13,7));
    }
}