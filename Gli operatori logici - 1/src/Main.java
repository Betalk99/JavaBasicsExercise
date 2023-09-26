public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        int zz = 4;

        System.out.println("x : " + x);
        System.out.println("Y : " + y);
        System.out.println("E' compreso tra x e y : " + num(x,y,zz));
    }
    public static boolean num(int x, int y,int z){

        return (z>=x) && (z<=y);
    }
}

