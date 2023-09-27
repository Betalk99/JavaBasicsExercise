public class Main {
    public static void main(String[] args) {
        int x = 4;

        if (num(x)){
            System.out.println("Numero è pari ");
        }else{
            System.out.println("Numero è dispari ");
        }

    }
    public static boolean num(int x){
        return (x % 2) == 0;
    }
}
