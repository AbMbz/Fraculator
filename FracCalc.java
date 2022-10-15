import java.util.Scanner;
public class FracCalc {
    public static String add(int n1, int n2, int d1, int d2) {
        int n = (n1 * d2) + (n2 * d1);
        int d = d1 * d2;

        int divisor = reduce(n, d);
        n /= divisor;
        d /= divisor;
        int integerComponent = 0;

        while (n >= d) {
            integerComponent++;
            n -= d;
        }
        String answer = "";
        if (integerComponent > 0) {
            answer += integerComponent + "_";
        }
        if (n != 0) {
            answer += n + "/" + d;
        }
        return answer;
    }

    public static int reduce(int n, int d) {
        int n_abs = Math.abs(n);
        int d_abs = Math.abs(d);

        int min_num = Math.min(n_abs, d_abs);

        int divisor = 1;

        for (int i = 1; i <= min_num; i++) {
            if (n % i == 0 && d % i == 0) {

                divisor = 1;
            }
        }
                return divisor;

            }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String f1 = scan.next();

        System.out.print("Enter an expression: ");
        String f2 = scan.next();
    }
}







