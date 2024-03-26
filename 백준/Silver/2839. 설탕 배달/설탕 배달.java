import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int sugar = sc.nextInt();

        int x = calculateSugarBag(sugar);

        System.out.println(x);

        sc.close();
    }

    private static int calculateSugarBag(int sugar) {
        int result = 0;

        while (sugar > 0) {

            if (sugar % 5 == 0) {
                result += (sugar / 5);
                break;
            }

            if (sugar % 3 != 0) {
                sugar -= 5;
                result++;
            }

            if (sugar % 3 == 0) {
                sugar -= 3;
                result++;
            }
        }

        if (sugar < 0) {
            return -1;
        }

        return result;
    }
}
