import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        if (size == 1) {
            int number = sc.nextInt();
            System.out.println(number * number);

            sc.close();
            return;
        }

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println(numbers[0] * numbers[numbers.length - 1]);

        sc.close();
   }

}
