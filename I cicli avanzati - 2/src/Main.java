
public class Main {
    public static void main(String[] args) {
        int x = 10;
        brk(x);

    }

    public static void brk(int x){
        for(int i = 0; i <= x; i++){
            if( i == 5 ){
                continue;
            }
            System.out.println(i);
        }
    }
}