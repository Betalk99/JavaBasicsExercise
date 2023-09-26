public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;

        System.out.println("Il risultato è " + b(x, y));

    }

    public static int b(int x, int y){
        int incX = x + 2;
        int incY = y + 2;
        int molt = incX * incY;

        return  molt;
    }
}