public class Main {
    public static void main(String[] args) {
        int x = 4;
        int y = 4;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("I numeri sono uguali: " + equal(x,y));
    }
    public static boolean equal(int x, int y) {
        return x == y ;
    }
}