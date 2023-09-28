//Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
// Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.
import java.util.Random;

public class Main {
    private static char randomChar() { //generare carattere casuale trovato tramite ricerce su w3schools
        Random r = new Random();
        return (char)(r.nextInt(26) + 'a');
    }
    public static void main(String[] args) {

        char[] ran = creaEriempiArray(10);
    }
    public static char[] creaEriempiArray(int lung ){ //riempire e stampare a se ci trova una a altrimenti 0
        char[] array = new char[lung];
        int cout =0;
        //riempire array
        for(int i=0; i<array.length;i++){
            array[i] = randomChar();
        }
        System.out.println(array);

        for(int i=0; i<array.length;i++) {
            if (array[i] == 'a') {
                cout = cout + 1;
            }
        }
        if (cout != 0 ){
            System.out.println(cout);
        }else{
            System.out.println("0");
        }
    return array;
    }
}