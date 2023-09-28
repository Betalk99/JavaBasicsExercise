public class Main {
    public static void main(String[] args) {
        int valUno = 3;
        int valDue = 5;
        char oper = '*';

        whatOperation(valUno, valDue, oper);
    }
    public static void whatOperation(int x, int y, char oper){
        if (oper == '+'){
            addiction(x,y);
        }else if (oper == '-'){
            sottrz(x,y);
        }else if (oper == '*'){
            multi(x,y);
        }else if (oper == '/'){
            division(x,y);
        }
    }

    public static int addiction(int x, int y){
        return x+y;
    }
    public static int multi(int x, int y){
        return x+y;
    }
    public static int sottrz(int x, int y){
        return x+y;
    }
    public static void division(int x, int y){
        System.out.printl();
    }
}