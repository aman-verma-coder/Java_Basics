import java.util.Scanner;

public class _9p10_productWithInput {
    public static void main(String[] args) {
        int a, b, product;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        product = a * b;
        System.out.print("The product of " + a + " and " + b + " is " + product);
        sc.close();
    }
}
