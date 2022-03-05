import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner degreeCel = new Scanner(System.in);
        System.out.printf("Enter the temperature in Celsius: ");
        int temperature = degreeCel.nextInt();
        double degreeFah = (temperature * 9 / 5) +32;
        System.out.printf("The temperature in Celsius: "+ temperature + " The temperature in Fahrenheit: " + degreeFah);
    }
}
