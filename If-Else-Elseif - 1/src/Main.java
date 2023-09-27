public class Main {
    public static void main(String[] args) {
        int j = 2;
        pariDisp(j);

    }
    public static void pariDisp (int j){
        if ((j%3) == 0 && (j%5) == 0){
            System.out.println("FizzBuzz");
        }else if ((j%3) == 0){
            //System.out.println("Fizz");
        }else if ((j%5) == 0) {
            System.out.println("Buzz");
        }else {
            System.out.println(j);
        }
    }


}