import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the coefficient of a: ");
        int a = input.nextInt();
        System.out.printf("Enter the coefficient of b: ");
        int b = input.nextInt();
        System.out.printf("Enter the coefficient of c: ");
        int c = input.nextInt();

        double d = Math.pow(b,2)-(4*a*c);
        if (a==0){
            System.out.printf("Invalid input!");
        }
        else if (d==0){
            double output = ((-b) + Math.sqrt(d))/(2*a);
            System.out.printf("The value of x is" + output);
        }
        else if (d<0){
            System.out.printf("Invalid input");
        }
        else {
            double output1 = ((-b) + Math.sqrt(d))/(2*a);
            double output2 = ((-b) - Math.sqrt(d))/(2*a);
            System.out.printf("The value of x1 is: " + output1);
            System.out.printf("The value of x2 is: " + output2);
        }
    }
}
