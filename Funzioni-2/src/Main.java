public class Main {
    public static void main(String[] args) {
        String ciao = "Ciao";

        System.out.println("La stringa è :" + ciao );
        System.out.println("La lunghezza è : "+ lenght(ciao));
    }
    public static int lenght(String x){
        int l = x.length();
        return l;
    }
}