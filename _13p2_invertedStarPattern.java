import java.util.Scanner;

public class _13p2_invertedStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for inverted star pattern: ");
        int n = sc.nextInt();
        System.out.println("By first method");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("By second method");
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
