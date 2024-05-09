import java.util.Scanner;

public class _11p7_ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        String result = ((a % 2 == 0) ? "even" : "odd");
        System.out.println("The number is " + result);
        sc.close();
    }
}