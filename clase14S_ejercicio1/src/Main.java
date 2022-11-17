public class Main {
    public static void main(String[] args) {

        Capitan capitan1 = new Capitan("Ignacio", "Molina", "123asd");
        Velero velero1 = new Velero(capitan1,1250.0,500.0,2022,200.0,5);
        Yate yate1 = new Yate(capitan1,2000.0,750.0,2019,200.0,50);
        Yate yate2 = new Yate(capitan1,2000.0,750.0,2019,200.0,49);


        System.out.println(velero1.esGrande());
        System.out.println(yate1.compareTo(yate2));


    }
}