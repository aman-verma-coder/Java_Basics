import java.util.Scanner;

public class _11p6_Largest_of_3_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int greatest = 0;
        if (a > b && a > c) {
            if (a != b && a != c) {
                greatest = (int) (a);
            } else if (a == b && a != c) {
                System.out.println("a == b");
                greatest = (int) (a);
            } else if (a == c && a != b) {
                System.out.println("a == c");
                greatest = (int) (a);
            } else if (a == b && a == c) {
                System.out.println("a == b == c");
                greatest = (int) (a);
            }
        } else if (b > c) {
            if (b != c) {
                greatest = (int) (b);
            } else if (b == c) {
                System.out.println("b == c");
                greatest = (int) (b);
            }
        } else if (b < c) {
            if (b != c) {
                greatest = (int) (c);
            } else if ((int) (b) == (int) (c)) {
                System.out.println("b == c");
                greatest = (int) (c);
            }
        }
        System.out.println("The greatest number is: " + greatest);
        sc.close();
    }
}
