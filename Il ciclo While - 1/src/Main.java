public class Main {
    public static void main(String[] args) {
        int i = 0;
        int max = 9;

        System.out.println("La somma è : " + somma(i,max));

    }
    public static int somma(int i, int max){
        int count = 0;
        while (i<max){
            count = count + i;
            i++;
        }
        return count;
    }

}