public class Main {
    public static void main(String[] args) {
        double a = 3;
        double b = 6;
        double c = 6;

        System.out.println("La media è : " + media(a,b,c));
    }
    public static double media(double a, double b, double c){
        return (a+b+c)/ 3;
    }
}