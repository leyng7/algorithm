import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfCards = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        String[] numbersStr = br.readLine().split(" ");
        int[] cards = new int[numberOfCards];
        for (int i = 0; i < numberOfCards; i++) {
            cards[i] = Integer.parseInt(numbersStr[i]);
        }

        int currentSum = getNearestSum(cards, numberOfCards, target);
        System.out.println(currentSum);

        br.close();
    }

    private static int getNearestSum(int[] cards, int numberOfCards, int target) {
        Arrays.sort(cards);

        int nearestSum = Integer.MAX_VALUE;
        for (int i = 0; i < numberOfCards; i++) {
            int left = i + 1;
            int right = numberOfCards - 1;
            while (left < right) {
                int currentSum = cards[i] + cards[left] + cards[right];
                if (currentSum == target) {
                    return currentSum;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }

                if (currentSum < target && Math.abs(currentSum - target) < Math.abs(nearestSum - target)) {
                    nearestSum = currentSum;
                }
            }
        }

        return nearestSum;
    }

}
