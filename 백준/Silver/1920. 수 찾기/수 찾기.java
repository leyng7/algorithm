import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            bw.write(String.valueOf(binarySearch(numbers, sc.nextInt()) >= 0 ? 1 : 0));
            bw.newLine();
        }

        sc.close();
        bw.close();
    }

    public static int binarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
