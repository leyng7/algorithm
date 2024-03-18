import java.io.*;
import java.time.LocalDate;

/**
 * 문제
 * 서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
 * <p>
 * 입력
 * 입력은 없다.
 * <p>
 * 출력
 * 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
 */
public class Quiz10699 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(LocalDate.now().toString());

        br.close();
        bw.close();
    }

}
