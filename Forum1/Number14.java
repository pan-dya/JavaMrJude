import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time value in seconds: ");
        int time = input.nextInt();
        int time2;
        int time3;
        int hour = 0;
        int minute = 0;
        int second = 0;
        if (time%3600 == 0){
            hour += time/3600;
        } else if (time%60 == 0){
            hour += time/3600;
            time2 = time%3600;
            minute += time2/60;
        } else {
            hour += time/3600;
            time2 = time%3600;
            minute += time2/60;
            time3 = time2%60;
            second += time3;
        }
        System.out.print("Time in seconds: " + time + " = " + hour + "hour(s)" + minute + "minute(s)" + second + "second(s)");
    }
}
