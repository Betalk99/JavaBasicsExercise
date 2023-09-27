public class Main {
    public static void main(String[] args) {
        int puntoPartenza = 6;
        int numRisultati = 4;
        stampaNum(puntoPartenza, numRisultati);
    }
    public static void stampaNum(int x, int y) {
        int diff = x - y;
        if (x <= 0) {
            System.out.println("Il numero di risultati deve essere maggiore di zero.");
            return;
        }
        for (int i = x; i > diff; i--) {
            System.out.print(i);
            if (i > (diff + 1)) {
                System.out.print(" ");
            }
        }
    }
}