//Scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi duplicati in un array di interi.
//L'array ottenuto dovrà essere stampato a video.
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] firstArray = {1,2,2,4,1,1,6,3,5};
        System.out.println(Arrays.toString(duplicate(firstArray)));
    }
    public static int[] duplicate(int[] arr){
        System.out.println(Arrays.toString(arr));
        int [] noDupl = new int[arr.length];
        int t = 0;

        for(int i = 0 ;i<arr.length - 1;i++){
            if(arr[i] != arr[i+1]) {
                noDupl[t++] = arr[i];
            }else{
                noDupl[t++] = -1;
            }

        }

        noDupl[t++] = arr[arr.length-1];

        return noDupl;
    }
}