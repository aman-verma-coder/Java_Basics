import java.util.Scanner;

public class _9p10_sumWithInput {
    public static void main(String[] args) {
        int a, b, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        sc.close();
    }
}
