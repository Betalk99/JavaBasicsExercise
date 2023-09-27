public class Main {
    public static void main(String[] args) {
        int numSet = 0;

        System.out.println(checkDay(numSet));
    }
    public static String checkDay(int x){
        String result;
        switch (x){
            case 1 :
                result = "Lunedì";
                break;
            case 2 :
                result = "Martedì";
                break;
            case 3 :
                result = "Mercoledì";
                break;
            case 4 :
                result = "Giovedì";
                break;
            case 5 :
                result = "Venerdì";
                break;
            case 6 :
                result = "Sabato";
                break;
            case 7 :
                result = "Domenica";
                break;
            default:
                result = "Errore";
                break;
        }
    return result;

    }
}