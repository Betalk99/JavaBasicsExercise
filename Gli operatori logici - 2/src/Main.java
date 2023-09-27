public class Main {
    public static void main(String[] args) {
        int x = 7;

        boolean isPari = num(x);
        boolean isDispari = !isPari;

        System.out.println(x + " è un numero pari: " + isPari);
        System.out.println(x + " è un numero dispari: " + isDispari);
    }
    public static boolean num(int x){
        return (x % 2) == 0;
    }
}
