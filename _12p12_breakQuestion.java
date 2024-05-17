import java.util.Scanner;

public class _12p12_breakQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println("You entered: " + n);
        } while (true);
        sc.close();
    }
}