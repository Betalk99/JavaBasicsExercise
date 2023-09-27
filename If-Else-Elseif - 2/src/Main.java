public class Main {
    public static void main(String[] args) {
        String frase = "BrunoBruno";
        int lung = frase.length();

        System.out.println(checkValue(lung));
    }
    private static String checkValue(int value) {

        if (value > 10) {
            return "Lunghezza maggiore di 10";
        } else if (value < 10) {
            return "Lunghezza minore di 10";
        } else if (value == 10) {
            return "Lunghezza pari a 10";
        }
        return "";
    }
}