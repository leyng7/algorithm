import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        System.out.println(factorial(sc.nextInt()));

    }

    public static int factorial(int n) {
        return n < 1 ? 1 : n * factorial(n - 1);
    }

}
