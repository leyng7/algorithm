import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());


        int[] numbers = new int[size];
        double maxScore = 0; // 정렬 후 마지막 값을 들고 오는 것으로도 가능

        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
            maxScore = Math.max(numbers[i], maxScore);
        }

        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += (numbers[i] / maxScore * 100);
        }

        System.out.println(sum / size);

        br.close();
    }

}
