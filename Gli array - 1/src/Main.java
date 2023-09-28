public class Main {
    public static void main(String[] args) {
        int[] arrayNum = creaERiempiNum();

        // Stampiamo l'array di caratteri
        for (int numero : arrayNum) {
            System.out.print(numero + " ");
        }
    }
    public static int[] creaERiempiNum() {
        int[] array = new int[10];
        int somma = 0;
        // Riempimento dell'array con il valore specifico
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            somma = somma + array[i];
        }
        System.out.println("La somma è : "+ somma);
        return array;
    }


}