public class Main {
    public static void main(String[] args) {
        double valUno = 10;
        double valDue = 5;
        char oper = '/';
        double base = 2;
        double espon = 20;

        whatOperation(valUno, valDue, oper);

        if(pariDisp()){
            System.out.println("Il numero è pari");
        }else{
            System.out.println("Il numero è dispari");
        }

        calcPotenza(base,espon);

    }
    public static void whatOperation(double x, double y, char oper){
        if (oper == '+'){
            System.out.println(addiction(x,y));
        }else if (oper == '-'){
            System.out.println(sottrz(x,y));
        }else if (oper == '*'){
            System.out.println(multi(x,y));
        }else if (oper == '/'){
            division(x,y);
        }


    }

    public static double addiction(double x, double y){
        return x+y;
    }
    public static double multi(double x, double y){
        return x*y;
    }
    public static double sottrz(double x, double y){
        return x-y;
    }
    public static void division(double x, double y){
        System.out.println(x/y);
        System.out.println(x % y);
    }
    public static boolean pariDisp(){
        int x = 10;
        return (x % 2) == 0;
    }

    public static void calcPotenza(double base, double espon){
        double result = base;
        for(int i=0; i<espon-1; i++){
            System.out.println(result);
            result = result * base;
        }

        System.out.println("Risultato potenza : " + result );

    }


}