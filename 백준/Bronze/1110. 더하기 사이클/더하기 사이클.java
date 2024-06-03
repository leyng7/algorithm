import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int prevNumber = number;
        int newNumber = -1;
        int i = 0;

        while (number != newNumber) {
            i++;
            int tens = prevNumber / 10;
            int units = prevNumber % 10;

            newNumber = (units * 10) + (tens + units) % 10;
            prevNumber = newNumber;
        }

        bw.write(i + "");
        bw.close();

    }

}