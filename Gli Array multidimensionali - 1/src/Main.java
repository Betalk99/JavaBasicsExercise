/*Scrivere un programma che contenga un metodo che permette di inizializzare una
matrice riempita con dei valori a vostro piacimento e restituisca la somma degli elementi sulla prima riga*/


public class Main {
    public static void main(String[] args) {
        int [][] num = {{1,2,3,4},{5,6,7,8}};
        somma(num);
    }

    public static void somma(int [][] arr){
        int cout = 0;
        for(int i = 0 ; i < 1 ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
                cout = cout + arr[i][j];
            }
            System.out.println(" ");
        }
        System.out.println("La somma è : " + cout);
    }
}