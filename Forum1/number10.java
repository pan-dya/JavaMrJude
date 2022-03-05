import java.util.Scanner;
import java.lang.Math;

public class Main {
    static double mean (double x, double y, double z){
        return (x+y+z)/3;
    }
    static double variance (double x, double y, double z){
        return (Math.pow((x - mean(x, y, z)),2 ) + Math.pow((y - mean(x, y, z)),2 ) + Math.pow((z - mean(x, y, z)),2 )) / 3;
    }
    static double deviation (double x, double y, double z){
        return Math.sqrt(variance(x, y, z));
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first value: ");
        var x = input.nextDouble();
        System.out.printf("Enter the second value: ");
        var y = input.nextDouble();
        System.out.printf("Enter the third value: ");
        var z = input.nextDouble();
        System.out.println("The mean value is: " +mean(x, y, z));
        System.out.println("The variance value is: " +variance(x, y, z));
        System.out.println("The standard deviation value is: " +deviation(x, y, z));
    }
}
