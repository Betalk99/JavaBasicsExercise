public class Main {
    public static void main(String[] args) {
        double x = 10;
        double y = 20;
        double z = 30;

        System.out.println("la media è :" + media(x, y, z));
    }

    public static double media(double x, double y, double z){
        double som = x + y + z;
        double mediaSomma = som / 3;
        return mediaSomma;
    }
}