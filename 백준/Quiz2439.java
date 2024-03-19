/**
 * 별 찍기 - 2
 * <p>
 * 문제
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * <p>
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 * <p>
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * <p>
 * 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Quiz2439 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < number; i++) {

            for (int j = i + 1; j < number; j++) {
                bw.write(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                bw.write("*");
            }

            bw.newLine();
        }

        bw.close();
    }

}
