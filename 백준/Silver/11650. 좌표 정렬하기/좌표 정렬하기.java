import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[][] marks = new int[count][2];

        for (int i = 0; i < count; i++) {
            marks[i][0] = sc.nextInt();
            marks[i][1] = sc.nextInt();
        }

        Arrays.sort(marks, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        for (int[] mark : marks) {
            System.out.println(mark[0] + " " + mark[1]);
        }

    }

}
