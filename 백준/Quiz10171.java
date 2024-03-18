import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 문제 - 고양이
 * 아래 예제와 같이 고양이를 출력하시오.
 *
 * 입력
 * 없음.
 *
 * 출력
 * 고양이를 출력한다.
 */
public class Quiz10171 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\\    /\\");
        bw.newLine();
        bw.write(" )  ( ')");
        bw.newLine();
        bw.write("(  /  )");
        bw.newLine();
        bw.write(" \\(__)|");

        bw.close();
    }

}
