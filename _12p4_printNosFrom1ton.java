import java.util.Scanner;

public class _12p4_printNosFrom1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("Printing numbers from 1 to " + n);
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
