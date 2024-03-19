import java.util.Scanner;

public class Quiz10952 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            if (left == 0 && right == 0) {
                break;
            }
            System.out.println(left + right);
        }

        sc.close();
    }

}
