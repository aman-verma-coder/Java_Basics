import java.util.Scanner;

public class _12p15_primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num % 2 == 0) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
        }
        if (isPrime == true) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
        sc.close();
    }
}