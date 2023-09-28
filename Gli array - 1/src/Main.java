public class Main {
    public static void main(String[] args) {
        int[] arrayNum = creaERiempiNum();

        for (int numero : arrayNum) {
            System.out.print(numero + " ");
        }

    }
    public static int[] creaERiempiNum() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        return array;
    }






}