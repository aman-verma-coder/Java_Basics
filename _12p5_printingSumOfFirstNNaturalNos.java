import java.util.Scanner;

public class _12p5_printingSumOfFirstNNaturalNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of first " + n + " natural numbers is " + sum);
        sc.close();
    }
}
