public class Main {
    public static void main(String[] args) {

       System.out.println("La somma è : " + somma());
    }
    public static int somma(){
        int[] num={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum = sum + num[i];
        }
        return sum;
    }
}