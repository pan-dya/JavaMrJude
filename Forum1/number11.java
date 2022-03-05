public class Main {
    public static void main(String[] args){
        int x = 10;
        int y = 5;
        int x2 = y;
        int y2 = x;
        x = x2;
        y = y2;
        System.out.println("X is " + x + " Y is " + y);
    }
}
