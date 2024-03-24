import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        String words = br.readLine();

        int sum = 0;
        for (int i = 0; i < size; i++) {
            int position = words.charAt(i) - 96;
            sum += (position * (int) Math.pow(31, i));
        }

        System.out.println(sum);
        br.close();
    }


}
