import java.util.Scanner;

public class _12p6_forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
        sc.close();
    }
}
