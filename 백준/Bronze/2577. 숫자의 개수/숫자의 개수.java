import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[10];
        Arrays.fill(numbers, 0);

        int result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String resultStr = String.valueOf(result);

        for (String c : resultStr.split("")) {
            numbers[Integer.parseInt(c)]++;
        }

        for (int number : numbers) {
            bw.write(String.valueOf(number));
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}


