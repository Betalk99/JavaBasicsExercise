/*Scrivere un programma che contenga un metodo che permette di inizializzare una matrice e di
scambiare le sue righe e le sue colonne stampandola a video. Matrice di partenza

        1 2 3
        4 5 6
        Matrice risultato

        1 4
        2 5
        3 6*/

public class Main {
    public static void main(String[] args) {
        int [][] num = {{1,2,3,4},{4,5,6,6,6}};
        int [][] numScamb = scambPosiz(num);

        stampaArray(numScamb);

    }
    //invertire il numero di colonne con le righe
    public static int [][] scambPosiz(int [][] arr){
        int righe = arr.length;
        int colonne = maxColonne(arr);

        int [][] arrScam = new int[colonne][righe];

        for(int i = 0; i < righe; i++){
            for(int j = 0; j < colonne;j++){
                if(i < arr.length && j < arr[i].length){
                    arrScam[j][i] = arr[i][j];
                }
            }
            System.out.println(" ");
        }
    return arrScam;
    }

    public static int maxColonne(int [][] arr){
        int maxCol = 0;

        for(int i=0; i < arr.length; i++){
            int[] righe = arr[i];
            if(righe.length > maxCol){
                maxCol = righe.length;
            }
        }
        return maxCol;
    }

    // stampare array
    public static void stampaArray(int [][] arr){
        for(int i = 0 ; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ");
        }
    }


}