import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        // nCk 는 n! / ((n-k)! * k!) 와 같다.
        System.out.println(factorial(n) / (factorial(n - k) * factorial(k)));

        sc.close();
   }

   public static int factorial(int n) {
       if (n <= 1)	{
           return 1;
       }
       return n * factorial(n - 1);
   }

}
