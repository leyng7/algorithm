import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Quiz2739 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        for (int i = 1; i < 10; i++) {
           bw.write(n + " * " + i + " = " + (n * i));
           bw.newLine();
        }

        sc.close();
        bw.close();
    }

}
