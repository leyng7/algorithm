import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 문제 - 새싹
 * 아래 예제와 같이 새싹을 출력하시오.
 *
 * 입력
 * 입력은 없다.
 *
 * 출력
 * 새싹을 출력한다.
 */
public class Quiz25083 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("" +
        "         ,r'\"7\n" +
        "r`-_   ,'  ,/\n" +
        " \\. \". L_r'\n" +
        "   `~\\/\n" +
        "      |\n" +
        "      |"
        );

        bw.close();
    }

}
