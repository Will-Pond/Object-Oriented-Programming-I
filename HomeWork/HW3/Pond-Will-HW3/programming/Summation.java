import java.util.Scanner;

public class Summation {
    public static double sum(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (1.0 / (Math.sqrt(i - 1) + Math.sqrt(i)));
        }
         result = result;
        return result;
        }


        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n? ");
        int n = input.nextInt();
        double result = sum(n);
        System.out.println("The result:" + result);
    }
}

/*
n?
The result:10.000000000000004
 */