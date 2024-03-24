import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 하루를 빼고 계산
    // 1 + (5-2) / (2-1)
    // 1 + 3 / 1 = 4

    // 1 + (6-5)/(5-1)
    // 1 + 1/4 = 1.25

    // 1 + 999999900 = 999999901

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int climbHeight = v - a;
        int movePerDay = a - b;

        int days = 1 + (int) Math.ceil((double) climbHeight / movePerDay);

        System.out.println(days);
        
        br.close();

    }


}
