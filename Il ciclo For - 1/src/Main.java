public class Main {
    public static void main(String[] args) {
        int n = 7;
        tabellina(n);
    }
    public static void tabellina (int n){
        for(int i=0; i <= 10; i++){
            int risultato = n * i;
            System.out.println(n + " * " + i + " = " + risultato);
        }
    }


}