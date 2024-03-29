public class Main {

    public static void main(String[] args) {

        boolean[] isNotSelfNumbers = new boolean[10001];

        for (int i = 1; i < 100001; i++) {
            int calculatedNumber = calculate(i);
            if (calculatedNumber < 10001) {
                isNotSelfNumbers[calculatedNumber] = true;
            }
        }

        for (int i = 1; i < isNotSelfNumbers.length; i++) {
            if (!isNotSelfNumbers[i]) {
                System.out.println(i);
            }
        }
    }

    private static int calculate(int number) {
        int sum = number;

        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }

}
