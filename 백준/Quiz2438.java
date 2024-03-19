import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Quiz2438 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i + 1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        sc.close();
        bw.close();
    }

}
