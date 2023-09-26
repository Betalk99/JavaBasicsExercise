public class Main {
    public static void main(String[] args) {
        char x = 'b';
        char y = 'b';
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Le lettere sono uguali: " + equal(x,y));
    }
    public static boolean equal(char x, char y) {
        return x == y;
    }
}