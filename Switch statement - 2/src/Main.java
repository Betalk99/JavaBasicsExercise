public class Main {
    public static void main(String[] args) {
        char c = '/';

        System.out.println(checkOper(c));
    }
    public static String checkOper(char x){
        String result;
        switch (x){
            case '+' :
                result = "Addizione";
                break;
            case '-' :
                result = "Sottrazione";
                break;
            case '*' :
                result = "Moltiplicazione";
                break;
            case '/' :
                result = "Divisione";
                break;
            default:
                result = "Errore";
                break;
        }
        return result;
    }
}