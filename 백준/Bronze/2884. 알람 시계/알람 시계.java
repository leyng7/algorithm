import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        LocalTime localTime = LocalTime.of(hour, minute);
        LocalTime resultTime = localTime.minusMinutes(45);

        System.out.println(resultTime.getHour() + " " + resultTime.getMinute());

        sc.close();

    }

}
