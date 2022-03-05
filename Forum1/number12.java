public class Main {
    public static void main (String[] args){
        System.out.printf("Number\tSquare\tCube\n");
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d\t%d\t%d\t", i, i*i, i*i*i);
            System.out.printf("\n");
        }
    }
}
